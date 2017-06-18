package com.angelos.wsjava.WebService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.angelos.wsjava.service.dataService;
import com.angelos.wsjava.service.dateService;

@Path("/rest")
public class RestAPI {

	@GET
	@Path("/get")
	@Produces("application/json")
	public String hello() throws IOException {

		String datelog = dateService.dateFormat();

		Writer file;
		file = new BufferedWriter(new FileWriter("/home/angelor/Documents/getlogs.txt", true));
		file.write(datelog);
		file.close();

		return datelog;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	// @Produces(MediaType.APPLICATION_JSON)
	public Response createDataInJSON(String dataPost) throws IOException {

		String result = dataService.createDataInJSON(dataPost);

		return Response.status(201).entity(result).build();
	}
}
