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
				String jsonData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getKeyBalanceDetails(jsonData);
		        exchange.getOut().setBody(responseJson);              
		    }
		})
		.when(header("operationName").isEqualTo("getSalesOrderList"))
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String jsonData = exchange.getIn().getBody(String.class);
				String responseJson = new SAPNetweaverGateway().getSalesOrderGetList(jsonData);
		        exchange.getOut().setBody(responseJson);              
		    }
		})
		.end();
	}
}