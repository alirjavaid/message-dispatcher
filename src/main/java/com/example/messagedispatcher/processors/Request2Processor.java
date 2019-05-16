package com.example.messagedispatcher.processors;

import org.apache.camel.Processor;

import com.example.messagedispatcher.util.Utility;

import org.apache.camel.Exchange;

public class Request2Processor implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		System.out.println("Request2Processor.process enter.");
		Utility.setClientType(exchange);
	  }

}
