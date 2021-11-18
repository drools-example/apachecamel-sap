package com.apachecamelsap.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.apachecamelsap.util.SAPNetweaverGateway;

public class SimpleRouteBuilderSAP extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// route for REST POST Call
		from("cxfrs:bean:restService")
		.choice()
		.when(header("operationName").isEqualTo("getKeyBalanceDetails"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getKeyBalanceDetails(requestData);
		        exchange.getOut().setBody(responseJson);              
		    }
		})
		.when(header("operationName").isEqualTo("getSalesOrderList"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getSalesOrderGetList(requestData);
		        exchange.getOut().setBody(responseJson);              
		    }
		})
        .when(header("operationName").isEqualTo("getInvoiceDetails"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getInvoiceDetails(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
        .when(header("operationName").isEqualTo("getCustomerDetails"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getCustomerDetails(requestData);
		        exchange.getOut().setBody(responseJson);              
		    }
		})
        .when(header("operationName").isEqualTo("getCustomerPartner"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getCustomerPartner(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
        .when(header("operationName").isEqualTo("getPartner"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getPartner(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.when(header("operationName").isEqualTo("createCustomer"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().createCustomer(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.when(header("operationName").isEqualTo("createDownPayment"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().createDownPayment(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.when(header("operationName").isEqualTo("createSaleOrder"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().createSaleOrder(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.when(header("operationName").isEqualTo("createDelivery"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().createDelivery(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.when(header("operationName").isEqualTo("createInvoice"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String requestData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().createInvoice(requestData);
		        exchange.getOut().setBody(responseJson);
		    }
		})
		.end();
	}
}