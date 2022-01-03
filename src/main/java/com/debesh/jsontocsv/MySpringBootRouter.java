package com.debesh.jsontocsv;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and print
 * @author dnaya
 *
 */
@Component
public class MySpringBootRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// Receive from JSON file 
		from("file:files/input")
				.log("Received file - ${body}")
		// transform to CSV format 
		
		// Write to output file
				.log("Writing file - ${body}")
				.to("file:files/output");
	}

}
