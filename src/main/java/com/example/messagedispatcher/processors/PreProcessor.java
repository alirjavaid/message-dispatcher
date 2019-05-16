package com.example.messagedispatcher.processors;

import org.apache.camel.Processor;

import com.example.messagedispatcher.logging.LogRecord;

import org.apache.camel.Exchange;

public class PreProcessor implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		System.out.println("PreProcessor.process enter.");
		LogRecord logRecord = new LogRecord(System.currentTimeMillis());
		exchange.setProperty("logRecord", logRecord);
		String body = exchange.getIn().getBody(String.class);
		System.out.println("body=[" + body + "]");
		String eventType="";
		if(body.contains("Manifest"))
			eventType="M";
		else if(body.contains("Delivery"))
			eventType="D";
		else if(body.contains("Exception"))
			eventType="X";
		else
			eventType="U";
		exchange.getIn().setHeader("event_type", eventType);
		System.out.println("PreProcessor.process exit. event_type=[" + eventType + "]");
	  }

}
