package com.apachecamelsap.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * 
 * @author jugalpatel
 *
 */
@Path("/")
public interface RestService {

	@POST
	@Path("/getSalesOrderList/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSalesOrderList(String requestData);
	
	@POST
	@Path("/getKeyBalanceDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getKeyBalanceDetails(String requestData);
	
	@POST
	@Path("/getCustomerDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails(String requestData);
}
