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
@javax.annotation.Generated(value = "hybris", date = "Fri Oct 09 15:04:53 CEST 2015")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class Temperature
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="id")
	@javax.validation.constraints.NotNull
	private java.lang.String _id;

	@com.fasterxml.jackson.annotation.JsonProperty(value="temperature")
	@javax.validation.constraints.NotNull
	private java.lang.Integer _temperature;
	
	public java.lang.String getId()
	{
		return _id;
	}
	
	public java.lang.Integer getTemperature()
	{
		return _temperature;
	}

	public void setId(final java.lang.String _id)
	{
		this._id = _id;
	}

	public void setTemperature(final java.lang.Integer _temperature)
	{
		this._temperature = _temperature;
	}
}
