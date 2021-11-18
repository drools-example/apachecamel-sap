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
	@Path("/getInvoiceDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInvoiceDetails(String requestData);

    @POST
	@Path("/getCustomerDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetails(String requestData);

    @POST
	@Path("/getCustomerPartner/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerPartner(String requestData);

    @POST
	@Path("/getPartner/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPartner(String requestData);
    
    @POST
	@Path("/createCustomer/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCustomer(String requestData);
    
    @POST
	@Path("/createDownPayment/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createDownPayment(String requestData);
    
    @POST
	@Path("/createSaleOrder/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createSaleOrder(String requestData);
    
    @POST
	@Path("/createDelivery/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createDelivery(String requestData);
    
    @POST
	@Path("/createInvoice/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createInvoice(String requestData);
}
