package com.ad.campain.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ad.campain.model.Campain;
import com.ad.campain.operation.CampainOperation;

@Path("/campain")
public class CampainAdder {
	@POST
	@Path("add/{campain_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCampain(@PathParam("campain_id") String campain_id, Campain campainObj) {

		try {
			campainObj.setCampainId(campain_id);
			CampainOperation.add(campain_id, campainObj);

			return Response.status(200).build();
		} catch (Exception e) {
			return Response.status(500).build();
		}

	}

	@GET
	@Path("fetch/{campain_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Campain getCampain(@PathParam("campain_id") String campain_id) {
		Campain campain = null;
		try {
			campain = CampainOperation.get(campain_id);

			if (campain == null) {
				campain = new Campain();
			}
		} catch (Exception e) {
			campain = new Campain();
		}
		return campain;
	}

	@GET
	@Path("test/{param}")
	public Response simpleTest(@PathParam("param") String msg) {

		String output = msg;

		return Response.status(200).entity(output).build();

	}

}
