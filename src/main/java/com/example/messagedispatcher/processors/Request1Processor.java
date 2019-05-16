package com.example.messagedispatcher.processors;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;
import com.example.messagedispatcher.util.*;

public class Request1Processor implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		System.out.println("Request1Processor.process enter.");
		Utility.setClientType(exchange);
	}

}
