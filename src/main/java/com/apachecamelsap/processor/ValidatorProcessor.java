package com.apachecamelsap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.java.apachecamelsap.util.SAPNetweaverGateway;

public class ValidatorProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String jsonData = exchange.getIn().getBody(String.class);
		String responseJson = new SAPNetweaverGateway().getKeyBalanceDetails(jsonData);
        exchange.getOut().setBody(responseJson);
	}

    

}