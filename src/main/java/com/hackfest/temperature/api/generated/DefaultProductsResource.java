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

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiProductsResource")
@Singleton
public class DefaultProductsResource implements com.hackfest.temperature.api.generated.ProductsResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public Response get(final YaasAwareParameters yaasAware)
	{
		// place some logic here
		return Response.ok()
			.entity(new java.util.ArrayList<Product>()).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Product product)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET /{productId} */
	@Override
	public Response getByProductId(final YaasAwareParameters yaasAware, final java.lang.String productId)
	{
		// place some logic here
		return Response.ok()
			.entity(new Product()).build();
	}

	/* PUT /{productId} */
	@Override
	public Response putByProductId(final YaasAwareParameters yaasAware, final java.lang.String productId, final Product product)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE /{productId} */
	@Override
	public Response deleteByProductId(final YaasAwareParameters yaasAware, final java.lang.String productId)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

}
