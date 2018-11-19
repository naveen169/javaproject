package com.miguno;

import java.io.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("status")
public class Status {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String statusInformation() {
	System.out.println("Enter characters, 'q' to quit.");
    return "{\"status\": \"idle\"}\n";
 
  }
}
