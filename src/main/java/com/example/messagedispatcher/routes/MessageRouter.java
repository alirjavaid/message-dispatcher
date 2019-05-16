package com.example.messagedispatcher.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageRouter extends RouteBuilder {
	
	String queueIn = "jms:queue:IN";
	
	String queueOut = "jms:queue:OUT";
	
	String queueOut_default = "jms:queue:DEAD";
	
	@Override
    public void configure() throws Exception {
        
		from(queueIn)
		.processRef("preProcessor")
        .choice()
        	.when(header("request_type").isEqualTo("1"))
        		.processRef("request1Processor")
        	.when(header("request_type").isEqualTo("2"))
        		.processRef("request2Processor")
        	.otherwise()
        		.processRef("defaultProcessor")
         .end()
		 .to(queueOut)
         .processRef("postProcessor");
        
    }
}