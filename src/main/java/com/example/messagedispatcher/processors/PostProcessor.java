package com.example.messagedispatcher.processors;

import org.apache.camel.Processor;

import com.example.messagedispatcher.logging.LogRecord;

import org.apache.camel.Exchange;

public class PostProcessor implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		System.out.println("PostProcessor.process enter.");
		LogRecord logRecord = (LogRecord)exchange.getProperty("logRecord");
		long totalExecutionTime = System.currentTimeMillis() - logRecord.getStartTime();
		System.out.println("Total Time: " + totalExecutionTime);
	}

}
