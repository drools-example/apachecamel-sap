package com.apachecamelsap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.apachecamelsap.util.SAPNetweaverGateway;

public class ValidatorProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		String jsonData = exchange.getIn().getBody(String.class);
		String responseJson = new SAPNetweaverGateway().getKeyBalanceDetails(jsonData);
		System.out.println(responseJson);
       // exchange.getOut().setBody(responseJson);
	}

    

}