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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Sat Oct 10 13:03:45 CEST 2015")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class Product
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="id")
	@javax.validation.constraints.NotNull
	private java.lang.String _id;

	@com.fasterxml.jackson.annotation.JsonProperty(value="description")
	@javax.validation.constraints.NotNull
	private java.lang.String _description;

	@com.fasterxml.jackson.annotation.JsonProperty(value="summer")
	private java.lang.Boolean _summer;
	
	public java.lang.String getId()
	{
		return _id;
	}
	
	public java.lang.String getDescription()
	{
		return _description;
	}
	
	public java.lang.Boolean isSummer()
	{
		return _summer;
	}

	public void setId(final java.lang.String _id)
	{
		this._id = _id;
	}

	public void setDescription(final java.lang.String _description)
	{
		this._description = _description;
	}

	public void setSummer(final java.lang.Boolean _summer)
	{
		this._summer = _summer;
	}
}
