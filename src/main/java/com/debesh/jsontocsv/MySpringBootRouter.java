package com.debesh.jsontocsv;

import org.apache.camel.builder.RouteBuilder;

/**
 * A simple Camel route that triggers from a timer and calls a bean and print
 * @author dnaya
 *
 */
public class MySpringBootRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// Receive from JSON file 
		from("")
		// transform to CSV format 
		
		// Write to output file

	}

}
