package com.apachecamelsap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	String body = exchange.getIn().getBody(String.class);
    	//System.out.println(body);
        exchange.getOut().setBody(body);
    }

}