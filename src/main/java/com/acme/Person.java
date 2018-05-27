package com.acme;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2236565436776691981L;
	private String name;
	private int age;
	private Address address;
	private static String state;
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	

	
}
	


