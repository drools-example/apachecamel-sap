package com.apachecamelsap.controller;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.apachecamelsap.service.RestService;
import com.java.apachecamelsap.util.SAPNetweaverGateway;

/**
 * 
 * @author jugalpatel
 *
 */
public class MainController implements RestService {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	private static final String API_ERROR_RESPONSE_MESSAGE = "API request was failed.";
	
	@Override
	public Response getSalesOrderList(String jsonData) {
		String response = null;
		try {
			response = new SAPNetweaverGateway().getSalesOrderGetList(jsonData);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getSalesOrderList():",e);
			Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(API_ERROR_RESPONSE_MESSAGE).build();
		}
		return Response.status(Response.Status.OK).entity(response).build();
	}

	@Override
	public Response getKeyBalanceDetails(String jsonData) {
		String response = null;
		try {
			response = new SAPNetweaverGateway().getKeyBalanceDetails(jsonData);
		} catch (Exception e) {
			logger.error("Error while calling SAPNetweaverGateway.getKeyBalanceDetails():",e);
			Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(API_ERROR_RESPONSE_MESSAGE).build();
		}
		return Response.status(Response.Status.OK).entity(response).build();
	}
}
