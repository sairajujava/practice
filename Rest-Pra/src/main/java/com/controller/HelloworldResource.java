package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bean.Helloworld;

@Path("/hello")
public class HelloworldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/say")
	public Response syaHello() {

		Helloworld h = new Helloworld("Onboard to Rest - Services World...!");

		return Response.ok(h).build();

	}

}
