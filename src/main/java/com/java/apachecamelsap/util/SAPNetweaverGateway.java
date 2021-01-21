package com.java.apachecamelsap.util;

import java.util.Date;
import java.util.Map;

import org.hibersap.bapi.BapiRet2;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apachecamelsap.model.SalesOrderGetListBapi;
import com.apachecamelsap.model.KeyBalanceBapi;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/**
 * 
 * @author jugalpatel
 *
 */
public class SAPNetweaverGateway {
	
	private static final Logger logger = LoggerFactory.getLogger(SAPNetweaverGateway.class);

	public static SessionManager createSessionManager() {
        AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
        return configuration.buildSessionManager();
    }
	
	private String showResult(SalesOrderGetListBapi salesOrderGetListBapi ) {

		BapiRet2 returnStruct = salesOrderGetListBapi.getReturnData(); 
		System.out.println( "\tMessage: " + returnStruct.getMessage()); 
		System.out.println( "\tNumber: " + returnStruct.getNumber()); 
		System.out.println( "\tType: " + returnStruct.getType()); 
		System.out.println( "\tId: " + returnStruct.getId());
		 
		return salesOrderGetListBapi.getCustomer_number();
	}
	
	public String getSalesOrderGetList(String jsonData) throws Exception {
		logger.debug("SAPNetweaverGateway.getSalesOrderGetList(String jsonData) -->Enter:" + jsonData);
		String result = "";
		Session session = null;
		try {
			SessionManager sessionManager = createSessionManager();
			session = sessionManager.openSession();
			Gson gson = new Gson();
			
			Map<String,String> paramMap = gson.fromJson(jsonData, new TypeToken<Map<String, String>>(){}.getType());
			SalesOrderGetListBapi salesOrderGetListBapi =  new SalesOrderGetListBapi();
			salesOrderGetListBapi.setCustomer_number(paramMap.get("customerNumber")); //"0000100915"
			salesOrderGetListBapi.setSales_organization(paramMap.get("salesOrganization"));  //"MVSO"
			
			session.execute(salesOrderGetListBapi);
			result = gson.toJson(salesOrderGetListBapi.getSales_orders());
			
			System.out.println(showResult(salesOrderGetListBapi));
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getSalesOrderGetList():",e);
			throw new Exception(e.getMessage());
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.getSalesOrderGetList(String jsonData) -->Exit");
		return result;
	}
	
	public String getKeyBalanceDetails(String jsonData) throws Exception {
		logger.debug("SAPNetweaverGateway.getKeyBalanceDetails(String jsonData) -->Enter:" + jsonData);
		String result = "";
		Session session = null;
		try {
			SessionManager sessionManager = createSessionManager();
			session = sessionManager.openSession();
			Gson gson = new Gson();
			
			Map<String,String> paramMap = gson.fromJson(jsonData, new TypeToken<Map<String, String>>(){}.getType());
			KeyBalanceBapi  user = new KeyBalanceBapi();
            user.setCompanyCode(paramMap.get("companyCode")); //"MVPL"
            user.setCustomer(paramMap.get("customer")); //"0000100060"
            user.setKeydate(new Date());
            user.setBalance("");
            user.setNotedItems("");
            
			session.execute(user);
			result = gson.toJson(user.getKeybalance());
			System.out.println(result);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getKeyBalanceDetails():",e);
			throw new Exception(e);
		}finally {
			if(session != null)
				session.close();
		}
		logger.debug("SAPNetweaverGateway.getKeyBalanceDetails(String jsonData) -->Exit");
		return result;
	}
	public static void main(String[] args) throws Exception {
		String jsonData = "{\"companyCode\": \"MVPL\",\"customer\": \"0000100060\"}";
		SAPNetweaverGateway sapNetweaverGateway = new SAPNetweaverGateway();
		//sapNetweaverGateway.getSalesOrderGetList();
		sapNetweaverGateway.getKeyBalanceDetails(jsonData);
	}
}
