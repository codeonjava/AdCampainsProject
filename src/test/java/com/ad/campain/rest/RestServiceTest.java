package com.ad.campain.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assert;
import org.junit.Test;

import com.ad.campain.model.Campain;

public class RestServiceTest extends JerseyTest {

	@Override
	protected Application configure() {
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new ResourceConfig(CampainAdder.class);
	}

	@Test
	public void ordersPathParamTest() {
		Response response = target("campain/test/453").request().get();
		Assert.assertTrue("200".equals(response.getStatus() + ""));
		Assert.assertTrue("453".equals(response.readEntity(String.class)));
	}

	@Test
	public void testPost() {

		Campain campain = new Campain();
		campain.setAccountId("12345");
		campain.setAreaCode("12345");
		campain.setMinAge(12);
		campain.setMaxAge(30);
		campain.setCampainDetail("12345");

		Response response = target("campain/add/facebook").request()
				.post(Entity.entity(campain, MediaType.APPLICATION_JSON));

		assertEquals("Should return status 200", 200, response.getStatus());

		Response output = target("campain/fetch/facebook").request().get();
		assertEquals("Should return status 200", 200, output.getStatus());
		Campain campainTmp=output.readEntity(Campain.class);
		assertEquals("Should return status 204", "facebook", campainTmp.getCampainId());
		
		output = target("campain/fetch/java").request().get();
		campainTmp=output.readEntity(Campain.class);
		assertEquals("Should return status 204", null, campainTmp.getCampainId());

	}
}
