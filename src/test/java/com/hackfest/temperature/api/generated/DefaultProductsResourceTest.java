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


public final class DefaultProductsResourceTest extends com.hackfest.temperature.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /products,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/products";

	/* get() /products */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /products */
	@Test
	public void testPostWithProduct()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Product entityBody =
		new Product();
		final javax.ws.rs.client.Entity<Product> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /products/productId */
	@Test
	public void testGetByProductId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/productId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /products/productId */
	@Test
	public void testPutByProductIdWithProduct()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/productId");
		final Product entityBody =
		new Product();
		final javax.ws.rs.client.Entity<Product> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /products/productId */
	@Test
	public void testDeleteByProductId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/productId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultProductsResource.class);
		return application;
	}
}
