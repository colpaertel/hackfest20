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

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/products")
public interface ProductsResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware);

	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.validation.Valid final Product product);

	@javax.ws.rs.Path("/{productId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByProductId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("productId") final java.lang.String productId);

	@javax.ws.rs.Path("/{productId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByProductId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("productId") final java.lang.String productId, @javax.validation.Valid final Product product);

	@javax.ws.rs.Path("/{productId}")
	@javax.ws.rs.DELETE
	Response deleteByProductId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("productId") final java.lang.String productId);

}
