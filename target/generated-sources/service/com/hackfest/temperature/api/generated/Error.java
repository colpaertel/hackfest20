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
public class Error
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="status")
	@javax.validation.constraints.DecimalMin(value="100")
	@javax.validation.constraints.DecimalMax(value="599")
	@javax.validation.constraints.NotNull
	private java.lang.Integer _status;

	@com.fasterxml.jackson.annotation.JsonProperty(value="type")
	@javax.validation.constraints.Pattern(regexp="[a-z]+[a-z_]*[a-z]+")
	@javax.validation.constraints.NotNull
	private java.lang.String _type;

	@com.fasterxml.jackson.annotation.JsonProperty(value="message")
	private java.lang.String _message;

	@com.fasterxml.jackson.annotation.JsonProperty(value="moreInfo")
	private java.net.URI _moreInfo;

	@com.fasterxml.jackson.annotation.JsonProperty(value="details")
	@javax.validation.Valid
	private java.util.List<com.hackfest.temperature.api.generated.Detail> _details;
	
	public java.lang.Integer getStatus()
	{
		return _status;
	}
	
	public java.lang.String getType()
	{
		return _type;
	}
	
	public java.lang.String getMessage()
	{
		return _message;
	}
	
	public java.net.URI getMoreInfo()
	{
		return _moreInfo;
	}
	
	public java.util.List<com.hackfest.temperature.api.generated.Detail> getDetails()
	{
		return _details;
	}

	public void setStatus(final java.lang.Integer _status)
	{
		this._status = _status;
	}

	public void setType(final java.lang.String _type)
	{
		this._type = _type;
	}

	public void setMessage(final java.lang.String _message)
	{
		this._message = _message;
	}

	public void setMoreInfo(final java.net.URI _moreInfo)
	{
		this._moreInfo = _moreInfo;
	}

	public void setDetails(final java.util.List<com.hackfest.temperature.api.generated.Detail> _details)
	{
		this._details = _details;
	}
}
