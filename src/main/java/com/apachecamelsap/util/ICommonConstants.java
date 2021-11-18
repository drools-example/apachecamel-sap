package com.apachecamelsap.util;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author jugalpatel
 *
 */

public interface ICommonConstants {

	public String SERVER_PROPERTY_DIR = "D:\\Jugal Project\\Jboss Jbpm\\jbpm-server-7.47.0.Final-dist\\standalone\\configuration";

	//public String SERVER_PROPERTY_DIR = System.getProperty("jboss.server.config.dir") + "/maheshValue.properties";
	
	public String API_HOST_URL = Utilities.getProperty(SERVER_PROPERTY_DIR,"apiHostURL");
	
	public String  API_GET_CUSTOMER_DETAILS = API_HOST_URL + "/camelServices/getCustomerDetails";
	
	public String  API_GET_KEY_BALANCE_DETAILS = API_HOST_URL + "/camelServices/getKeyBalanceDetails";
	
}
