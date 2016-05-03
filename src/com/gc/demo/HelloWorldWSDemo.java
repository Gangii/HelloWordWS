package com.gc.demo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * 
 */

/**
 * @author Maurice
 *
 */
@Path("/demo") // service call mapping 
public class HelloWorldWSDemo {
	
	/*
	 * Test my WS.
	 * Use the following url to call this WS:
	 * http://localhost:8080/HelloWorldWS/api/demo/echo/{insert parameter here}
	 */
	@GET // Http verb
	@Path("/echo/{inputTxt}")
	public String testWS(@PathParam("inputTxt") String input){
		
		return input;
	}

}
