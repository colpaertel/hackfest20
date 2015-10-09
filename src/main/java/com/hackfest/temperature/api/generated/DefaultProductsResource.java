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

import java.util.ArrayList;
import java.util.List;

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
		List<Product> products = getDemoProducts();
		return Response.ok()
			.entity(products).build();
	}

	private List<Product> getDemoProducts() {
		List<Product> products = new ArrayList<Product>(5);
		Product p1 = new Product();
		p1.setId("1");
		p1.setSummer(true);
		p1.setDescription("Tanktop");
		Product p2= new Product();
		p2.setId("2");
		p2.setSummer(true);
		p2.setDescription("Bikini");
		Product p3= new Product();
		p3.setId("3");
		p3.setSummer(false);
		p3.setDescription("Hat");
		Product p4= new Product();
		p4.setId("4");
		p4.setSummer(false);
		p4.setDescription("Scarf");
		Product p5= new Product();
		p5.setId("5");
		p5.setSummer(false);
		p5.setDescription("Hand gloves");
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		return products;
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
		for (Product product : getDemoProducts()) {
			if(product.getId().equalsIgnoreCase(productId))
			{
				return Response.ok()
						.entity(product).build();
			}
		}
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
