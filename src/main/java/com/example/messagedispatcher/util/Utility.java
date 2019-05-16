package com.example.messagedispatcher.util;

import org.apache.camel.Exchange;

public class Utility {
	
	public static void setClientType(Exchange exchange)
	{
		System.out.println("Utility.setClientType enter.");
		String body = exchange.getIn().getBody(String.class);
		System.out.println("body=[" + body + "]");
		String clientType="";
		if(body.contains("EDI"))
			clientType="EDI";
		else if(body.contains("CAMS"))
			clientType="CAMS";
		else
			clientType="U";
		System.out.println("clientType=[" + clientType + "]");
		exchange.getIn().setHeader("client_type", clientType);
	}

}
