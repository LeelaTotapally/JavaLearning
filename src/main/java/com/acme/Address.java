package com.acme;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1765929803495307755L;
	String cityName;
	String address;
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCityName()
	{
		return cityName;
	}
	public String getAddress()
	{
		return address;
	}
	

}
