/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.hackfest.temperature.api.generated;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultTemperaturesResourceTest extends com.hackfest.temperature.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /temperatures,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/temperatures";

	/* get() /temperatures */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /temperatures */
	@Test
	public void testPostWithTemperature()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Temperature entityBody =
		new Temperature();
		final javax.ws.rs.client.Entity<Temperature> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /temperatures/temperatureId */
	@Test
	public void testGetByTemperatureId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/temperatureId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /temperatures/temperatureId */
	@Test
	public void testPutByTemperatureIdWithTemperature()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/temperatureId");
		final Temperature entityBody =
		new Temperature();
		final javax.ws.rs.client.Entity<Temperature> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /temperatures/temperatureId */
	@Test
	public void testDeleteByTemperatureId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/temperatureId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultTemperaturesResource.class);
		return application;
	}
}