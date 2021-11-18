package com.apachecamelsap.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.configuration.xml.SessionManagerConfig;
import org.hibersap.execution.jco.JCoContext;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.hibersap.session.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apachecamelsap.bean.CustomerDetailsVO;
import com.apachecamelsap.bean.GetCustomerPartnerVO;
import com.apachecamelsap.bean.InvoiceDetailsVO;
import com.apachecamelsap.bean.KeyBalanceVO;
import com.apachecamelsap.bean.PartnerVO;
import com.apachecamelsap.bean.SalesOrderGetListVO;
import com.apachecamelsap.model.CreateCustomerBapi;
import com.apachecamelsap.model.CreateDeliveryBapi;
import com.apachecamelsap.model.CreateDownPaymentBapi;
import com.apachecamelsap.model.CreateInvoiceBapi;
import com.apachecamelsap.model.CreateSaleOrderBapi;
import com.apachecamelsap.model.CustomerDetailsBapi;
import com.apachecamelsap.model.GetCustomerPartnerBapi;
import com.apachecamelsap.model.InvoiceDetailsBapi;
import com.apachecamelsap.model.KeyBalanceBapi;
import com.apachecamelsap.model.PartnerBapi;
import com.apachecamelsap.model.PiCopyReference;
import com.apachecamelsap.model.PiPersonalData;
import com.apachecamelsap.model.SalesOrderGetListBapi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.conn.jco.ext.DestinationDataProvider;
/**
 * 
 * @author jugalpatel
 *
 */
public class SAPNetweaverGateway {
	
	private static final Logger logger = LoggerFactory.getLogger(SAPNetweaverGateway.class);
	
	private static final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
	
	private static SessionManager sessionManager = null;
	
	public SAPNetweaverGateway() {
        SessionManagerConfig cfg = new SessionManagerConfig("A12").setContext(JCoContext.class.getName())
                .setProperty(DestinationDataProvider.JCO_CLIENT, "700")
                .setProperty(DestinationDataProvider.JCO_USER, "msfaint")
                .setProperty(DestinationDataProvider.JCO_PASSWD, "msfaint@700")
                .setProperty(DestinationDataProvider.JCO_LANG, "en")
                .setProperty(DestinationDataProvider.JCO_ASHOST, "13.127.228.21")
                .setProperty(DestinationDataProvider.JCO_SYSNR, "00");

        AnnotationConfiguration configuration = new AnnotationConfiguration(cfg);
        configuration.addBapiClasses(SalesOrderGetListBapi.class, KeyBalanceBapi.class, InvoiceDetailsBapi.class,
                CustomerDetailsBapi.class, GetCustomerPartnerBapi.class, PartnerBapi.class, CreateCustomerBapi.class,
                CreateDownPaymentBapi.class, CreateSaleOrderBapi.class, CreateDeliveryBapi.class, CreateInvoiceBapi.class);
        // AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
        sessionManager = configuration.buildSessionManager();
    }
	
	public String getSalesOrderGetList(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.getSalesOrderGetList(String requestData) -->Enter");
		String result = "";
		Session session = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			SalesOrderGetListVO salesOrderGetListVO = objectMapper.readValue(requestData, SalesOrderGetListVO.class);
			SalesOrderGetListBapi salesOrderGetListBapi =  new SalesOrderGetListBapi();
			salesOrderGetListBapi.setCustomer_number(salesOrderGetListVO.getCustomerNumber());
			salesOrderGetListBapi.setSales_organization(salesOrderGetListVO.getSalesOrganization());
			salesOrderGetListBapi.setDocument_date(StringUtils.isNotBlank(salesOrderGetListVO.getDocumentDate()) ? formatter.parse(salesOrderGetListVO.getDocumentDate()) : null);
			salesOrderGetListBapi.setDocument_date_to(StringUtils.isNotBlank(salesOrderGetListVO.getDocumentDateTo()) ? formatter.parse(salesOrderGetListVO.getDocumentDateTo()) : null);
			salesOrderGetListBapi.setMaterial(StringUtils.isNotBlank(salesOrderGetListVO.getMaterial()) ? salesOrderGetListVO.getMaterial() : null);
			salesOrderGetListBapi.setPurchase_order(StringUtils.isNotBlank(salesOrderGetListVO.getPurchaseOrder()) ? salesOrderGetListVO.getPurchaseOrder() : null);
			salesOrderGetListBapi.setPurchase_order_number(StringUtils.isNotBlank(salesOrderGetListVO.getPurchaseOrderNumber()) ? salesOrderGetListVO.getPurchaseOrderNumber() : null);
			salesOrderGetListBapi.setTransaction_group(StringUtils.isNotBlank(salesOrderGetListVO.getTransactionGroup()) ? salesOrderGetListVO.getTransactionGroup() : null);
			
			session.execute(salesOrderGetListBapi);
			result = objectMapper.writeValueAsString(salesOrderGetListBapi.getSales_orders());
			System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getSalesOrderGetList():",e);
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.getSalesOrderGetList(String requestData) -->Exit");
		return result;
	}
	
	public String getKeyBalanceDetails(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.getKeyBalanceDetails(String requestData) -->Enter");
		String result = "";
		Session session = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			KeyBalanceVO keyBalanceVO = objectMapper.readValue(requestData, KeyBalanceVO.class);
			KeyBalanceBapi  keyBalanceBapi = new KeyBalanceBapi();
			keyBalanceBapi.setCompanyCode(keyBalanceVO.getCompanyCode());
			keyBalanceBapi.setCustomer(keyBalanceVO.getCustomer());
			keyBalanceBapi.setKeydate(StringUtils.isNotBlank(keyBalanceVO.getKeydate()) ? formatter.parse(keyBalanceVO.getKeydate()) : new Date());
			keyBalanceBapi.setBalance(keyBalanceVO.getBalance());
			keyBalanceBapi.setNotedItems(keyBalanceVO.getNotedItems());
			
			session.execute(keyBalanceBapi);
			result = objectMapper.writeValueAsString(keyBalanceBapi.getKeybalance());
			 System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getKeyBalanceDetails():",e);
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.getKeyBalanceDetails(String requestData) -->Exit");
		return result;
	}
	

	public String getInvoiceDetails(String requestData) throws Exception {
        logger.debug("SAPNetweaverGateway.getInvoiceDetails(InvoiceDetailsVO invoiceDetailsVO) -->Enter");
        String result = "";
        Session session = null;
        try {
            session = sessionManager.openSession();
            ObjectMapper objectMapper = new ObjectMapper();

            InvoiceDetailsVO invoiceDetailsVO = objectMapper.readValue(requestData, InvoiceDetailsVO.class);
            InvoiceDetailsBapi invoiceDetailsBapi = new InvoiceDetailsBapi();
            invoiceDetailsBapi.setSign(invoiceDetailsVO.getSign());
            invoiceDetailsBapi.setOption(invoiceDetailsVO.getOption());
            invoiceDetailsBapi.setRefDocLow(invoiceDetailsVO.getRefDocLow());
            invoiceDetailsBapi.setRefDocHigh(invoiceDetailsVO.getRefDocHigh());

            session.execute(invoiceDetailsBapi);
            result = objectMapper.writeValueAsString(invoiceDetailsBapi.getInvoicedetails());
            System.out.println(result);
        } catch (Exception e) {
            logger.error("Error while calling SAPNetweaverGateway.getInvoiceDetails():", e);
            throw new Exception(e.getMessage());
        } finally {
            if (session != null)
                session.close();
        }
        logger.debug("SAPNetweaverGateway.getInvoiceDetails(InvoiceDetailsVO invoiceDetailsVO) -->Exit");
        return result;
    }
	
	public String getCustomerDetails(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createCustomer(String requestData) -->Enter");
		String result = "";
		Session session = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CustomerDetailsBapi  customerDetailsBapi = new CustomerDetailsBapi();
			customerDetailsBapi.setCustomerNo(customerDetailsVO.getCustomerNo());
			customerDetailsBapi.setCompanyCode(customerDetailsVO.getCompanyCode());
			
			session.execute(customerDetailsBapi);
         
            if (customerDetailsBapi.getReturnData() != null
                    && customerDetailsBapi.getReturnData().containsKey("NUMBER")) {

                if (customerDetailsBapi.getReturnData().get("NUMBER").equals("505")) {
                    customerDetailsVO.setCustomerAddress(customerDetailsBapi.getCustomerAddress());
                    customerDetailsVO.setCustomerCompanyDetail(customerDetailsBapi.getCustomerCompanyDetail());
                    customerDetailsVO.setCustomerGeneralDetail(customerDetailsBapi.getCustomerGeneralDetail());
                    customerDetailsVO.setReturnData(customerDetailsBapi.getReturnData());
                    customerDetailsVO.setUserExist(true);
                }
            }
            customerDetailsVO.setCustomerAddress(customerDetailsBapi.getCustomerAddress());
            customerDetailsVO.setCustomerCompanyDetail(customerDetailsBapi.getCustomerCompanyDetail());
            customerDetailsVO.setCustomerGeneralDetail(customerDetailsBapi.getCustomerGeneralDetail());
            customerDetailsVO.setReturnData(customerDetailsBapi.getReturnData());
            result = objectMapper.writeValueAsString(customerDetailsVO);
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getCustomerDetails():",e);
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.getCustomerDetails(String requestData) -->Exit");
		return result;
	}
	
    public String getCustomerPartner(String requestData) throws Exception {
        logger.debug("SAPNetweaverGateway.getCustomerPartner -->Enter");
        String result = "";
        Session session = null;
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            session = sessionManager.openSession();

            GetCustomerPartnerVO getCustomerPartnerVO = objectMapper.readValue(requestData, GetCustomerPartnerVO.class);
            GetCustomerPartnerBapi getCustomerPartnerBapi = new GetCustomerPartnerBapi();
            getCustomerPartnerBapi.setCustomerNo(getCustomerPartnerVO.getCustomerNo());
            getCustomerPartnerBapi.setSaleOrg(getCustomerPartnerVO.getSaleOrg());
            getCustomerPartnerBapi.setDistChannel(getCustomerPartnerVO.getDistChannel());
            getCustomerPartnerBapi.setDistDivision(getCustomerPartnerVO.getDistDivision());
            getCustomerPartnerBapi.setPartnerFn(getCustomerPartnerVO.getPartnerFn());

            session.execute(getCustomerPartnerBapi);
            result = objectMapper.writeValueAsString(getCustomerPartnerBapi);
            System.out.println(result);
        } catch (Exception e) {
            logger.error("Error while calling SAPNetweaverGateway.getCustomerPartner():", e);
            throw new Exception(e);
        } finally {
            if (session != null)
                session.close();
        }
        logger.debug("SAPNetweaverGateway.getCustomerPartner(GetCustomerPartnerVO getCustomerPartnerVO) -->Exit");
        return result;
    }

    public String getPartner(String requestData) throws Exception {
        String result = "";
        Session session = null;
        try {
            session = sessionManager.openSession();
            ObjectMapper objectMapper = new ObjectMapper();

            PartnerVO partnerVO = objectMapper.readValue(requestData, PartnerVO.class);
            PartnerBapi partnerBapi = new PartnerBapi();
            partnerBapi.setCustomerNo(partnerVO.getCustomerNo());
            partnerBapi.setSaleOrg(partnerVO.getSaleOrg());
            partnerBapi.setChannel(partnerVO.getChannel());
            partnerBapi.setDivision(partnerVO.getDivision());

            session.execute(partnerBapi);
            result = objectMapper.writeValueAsString(partnerBapi.getPartners());
            System.out.println(result);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
            if (session != null)
                session.close();
        }
        return result;
    }
    
    public String createCustomer(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createCustomer(String requestData) -->Enter");
		String result = "";
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CreateCustomerBapi  createCustomerBapi = new CreateCustomerBapi();
			
			PiPersonalData piPersonalData = new PiPersonalData();
			//piPersonalData.setTitleP("MR");
			piPersonalData.setFirstName("pavan");
			piPersonalData.setLastName("Patel");
			piPersonalData.setDateBirth(new Date());
			piPersonalData.setCity("Ahmedabad");
			piPersonalData.setPostlCod1("567843");
			piPersonalData.setCountry("IN");
			piPersonalData.setLanguP("EN");
			piPersonalData.setCurrency("INR");
			createCustomerBapi.setPiPersonalData(piPersonalData);
			
			PiCopyReference piCopyReference = new PiCopyReference();
			piCopyReference.setSalesOrg("3000");
			piCopyReference.setRefCustmr("100137");
			piCopyReference.setDivision("00");
			piCopyReference.setDistrChan("12");
			createCustomerBapi.setPiCopyReference(piCopyReference);
			
			transaction = session.beginTransaction();
			session.execute(createCustomerBapi);
			transaction.commit();
			
            result = objectMapper.writeValueAsString(createCustomerBapi.getCustomerNo());
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createCustomer():",e);
			if(transaction != null)
				transaction.rollback();
			
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createCustomer(String requestData) -->Exit");
		return result;
	}
    
    public String createDownPayment(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createDownPayment(String requestData) -->Enter");
		String result = "";
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CreateDownPaymentBapi  createDownPaymentBapi = new CreateDownPaymentBapi();
			
			transaction = session.beginTransaction();
			session.execute(createDownPaymentBapi);
			transaction.commit();
			
            result = objectMapper.writeValueAsString(createDownPaymentBapi.getObjSys());
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createDownPayment():",e);
			if(transaction != null)
				transaction.rollback();
			
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createDownPayment(String requestData) -->Exit");
		return result;
	}
    
    public String createSaleOrder(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createSaleOrder(String requestData) -->Enter");
		String result = "";
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CreateSaleOrderBapi  createSaleOrderBapi = new CreateSaleOrderBapi();
			
			transaction = session.beginTransaction();
			session.execute(createSaleOrderBapi);
			transaction.commit();
			
            result = objectMapper.writeValueAsString(createSaleOrderBapi.getSalesDocument());
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createSaleOrder():",e);
			if(transaction != null)
				transaction.rollback();
			
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createSaleOrder(String requestData) -->Exit");
		return result;
	}
    
    public String createDelivery(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createDelivery(String requestData) -->Enter");
		String result = "";
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CreateDeliveryBapi  createDeliveryBapi = new CreateDeliveryBapi();
			
			transaction = session.beginTransaction();
			session.execute(createDeliveryBapi);
			transaction.commit();
			
            result = objectMapper.writeValueAsString(createDeliveryBapi.getDelivery());
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createDelivery():",e);
			if(transaction != null)
				transaction.rollback();
			
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createDelivery(String requestData) -->Exit");
		return result;
	}
    
    public String createInvoice(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.createInvoice(String requestData) -->Enter");
		String result = "";
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionManager.openSession();
			ObjectMapper objectMapper = new ObjectMapper();
			
			CustomerDetailsVO customerDetailsVO = objectMapper.readValue(requestData, CustomerDetailsVO.class);
			CreateInvoiceBapi  createInvoiceBapi = new CreateInvoiceBapi();
			
			transaction = session.beginTransaction();
			session.execute(createInvoiceBapi);
			transaction.commit();
			
            result = objectMapper.writeValueAsString(customerDetailsVO);
            System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createInvoice():",e);
			if(transaction != null)
				transaction.rollback();
			
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createInvoice(String requestData) -->Exit");
		return result;
	}
    
	public static void main(String[] args) throws Exception {
		//String jsonData = "{\"companyCode\": \"MVPL\",\"customer\": \"0004116486\",\"keydate\": \"16-04-2021\",\"balance\": \"\",\"notedItems\": \"\"}";
		//String slaesOrderJson = "{\"customerNumber\": \"0000100915\",\"salesOrganization\": \"MVSO\",\"documentDate\":\"18-11-2020\",\"documentDateTo\":\"18-11-2020\",\"material\":\"\",\"purchaseOrder\":\"\",\"purchaseOrderNumber\":\"\",\"transactionGroup\":\"\"}";
		 String getCustomerJsonData = "{\"companyCode\":\"MVPL\",\"customerNo\":\"0004145672\"}";
        //String getCustomerJsonData = "{\"companyCode\":\"MVPL\",\"customerNo\":\"0004145672\"}";
        //String getCustomerPartnerData = "{\"customerNo\": \"0004145672\",\"saleOrg\":\"MVSO\",\"distChannel\": \"WS\",\"distDivision\":\"SD\",\"partnerFn\":\"\"}";
		//String getPartnerData = "{\"customerNo\": \"0004145672\",\"saleOrg\": \"MVSO\",\"channel\": \"WS\",\"division\": \"SD\"}";
		
		
		SAPNetweaverGateway sapNetweaverGateway = new SAPNetweaverGateway();
		//sapNetweaverGateway.getSalesOrderGetList(slaesOrderJson);
		//sapNetweaverGateway.getKeyBalanceDetails(jsonData);
		//sapNetweaverGateway.createZrfcCustomerLedger();
		 //sapNetweaverGateway.getCustomerDetails(getCustomerJsonData);
        //sapNetweaverGateway.getCustomerPartner(getCustomerPartnerData);
        //sapNetweaverGateway.getPartner(getPartnerData);
		 sapNetweaverGateway.createCustomer(getCustomerJsonData);
		 //sapNetweaverGateway.createDownPayment(getCustomerJsonData);
		//sapNetweaverGateway.createSaleOrder(getCustomerJsonData);
		//sapNetweaverGateway.createDelivery(getCustomerJsonData);
		//sapNetweaverGateway.createInvoice(getCustomerJsonData);
	}
}
