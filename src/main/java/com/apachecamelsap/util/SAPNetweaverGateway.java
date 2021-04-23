package com.apachecamelsap.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.configuration.xml.SessionManagerConfig;
import org.hibersap.execution.jco.JCoContext;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apachecamelsap.bean.CustomerDetailsVO;
import com.apachecamelsap.bean.KeyBalanceVO;
import com.apachecamelsap.bean.SalesOrderGetListVO;
import com.apachecamelsap.model.Bukrs;
import com.apachecamelsap.model.CustomerDetailsBapi;
import com.apachecamelsap.model.Gbudat;
import com.apachecamelsap.model.KeyBalanceBapi;
import com.apachecamelsap.model.Kunnr;
import com.apachecamelsap.model.SalesOrderGetListBapi;
import com.apachecamelsap.model.ZrfcCustomerLedgerBapi;
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
	
	static {
		SessionManagerConfig cfg = new SessionManagerConfig("A12") 
			    .setContext(JCoContext.class.getName()) 
			    .setProperty(DestinationDataProvider.JCO_CLIENT,"400") 
			    .setProperty(DestinationDataProvider.JCO_USER ,"mvpldev") 
			    .setProperty(DestinationDataProvider.JCO_PASSWD, "mdev999") 
			    .setProperty(DestinationDataProvider.JCO_LANG, "en") 
			    .setProperty(DestinationDataProvider.JCO_ASHOST, "13.233.222.105") 
			    .setProperty(DestinationDataProvider.JCO_SYSNR, "00");
			 
		AnnotationConfiguration configuration = new AnnotationConfiguration(cfg);
		configuration.addBapiClasses(SalesOrderGetListBapi.class, KeyBalanceBapi.class, ZrfcCustomerLedgerBapi.class,
				CustomerDetailsBapi.class);
		sessionManager =  configuration.buildSessionManager();
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
	
	/*public String createZrfcCustomerLedger() throws Exception {
		logger.debug("SAPNetweaverGateway.createZrfcCustomerLedger() -->Enter");
		String result = "";
		Session session = null;
		try {
			session = sessionManager.openSession();
			List<Gbudat> gbudatList = new ArrayList<>();
			List<Bukrs> bukrsList = new ArrayList<>();
			List<Kunnr> kunnrList = new ArrayList<>();
			ObjectMapper objectMapper = new ObjectMapper();
			
			ZrfcCustomerLedgerBapi  zrfcCustomerLedger = new ZrfcCustomerLedgerBapi();
			zrfcCustomerLedger.setI1("");
			
			Kunnr kunnr = new Kunnr();
			kunnr.setSign("I");
			kunnr.setOption("EQ");
			kunnr.setLow("100206");
			//kunnr.setHigh("");
			
			Gbudat gbudat = new Gbudat();
			gbudat.setSign("I");
			gbudat.setOption("BT");
			gbudat.setLow(formatter.parse("01-01-2016"));
			gbudat.setHigh(formatter.parse("31-12-2018"));
			
			Bukrs bukrs = new Bukrs();
			bukrs.setSign("I");
			bukrs.setOption("EQ");
			bukrs.setLow("MVPL");
			//bukrs.setHigh("");
			
			bukrsList.add(bukrs);
			gbudatList.add(gbudat);
			kunnrList.add(kunnr);
			
			zrfcCustomerLedger.setBukrs(bukrsList);
			//zrfcCustomerLedger.setG_budat(gbudatList);
			//zrfcCustomerLedger.setKunnr(kunnrList);
			
			session.execute(zrfcCustomerLedger);
			result = objectMapper.writeValueAsString(zrfcCustomerLedger.getLt_final());
			System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.createZrfcCustomerLedger():",e);
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.createZrfcCustomerLedger() -->Exit");
		return result;
	}*/
	
	public String getCustomerDetails(String requestData) throws Exception {
		logger.debug("SAPNetweaverGateway.getCustomerDetails(String requestData) -->Enter");
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
			result = objectMapper.writeValueAsString(customerDetailsBapi.getCustomerBankDetail());
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
	
	/*
	public static void main(String[] args) throws Exception {
		//String jsonData = "{\"companyCode\": \"MVPL\",\"customer\": \"0000100060\",\"keydate\": \"24-01-2021\",\"balance\": \"\",\"notedItems\": \"\"}";
		//String slaesOrderJson = "{\"customerNumber\": \"0000100915\",\"salesOrganization\": \"MVSO\",\"documentDate\":\"18-11-2020\",\"documentDateTo\":\"18-11-2020\",\"material\":\"\",\"purchaseOrder\":\"\",\"purchaseOrderNumber\":\"\",\"transactionGroup\":\"\"}";
		//String customerData = "{\"customerNo\": \"0004145509\",\"companyCode\": \"MVPL\"}";
		//SAPNetweaverGateway sapNetweaverGateway = new SAPNetweaverGateway();
		//sapNetweaverGateway.getSalesOrderGetList(slaesOrderJson);
		//sapNetweaverGateway.getKeyBalanceDetails(jsonData);
		//sapNetweaverGateway.createZrfcCustomerLedger();
		//sapNetweaverGateway.getCustomerDetails(customerData);
	} */
}
