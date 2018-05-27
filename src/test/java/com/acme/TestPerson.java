package com.acme;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TestPerson {
	@Test
	public void testSerializableMethod() throws Exception
	{
		Person person = new Person();
		person.setName("Leela");
		person.setAge(19);
		person.setState("AP");
		Address address = new Address();
		address.setCityName("Hyderabad");
		address.setAddress("5/6,Street");
		person.setAddress(address );
		FileOutputStream fileOutputStream = new FileOutputStream("File");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);
		objectOutputStream.flush();
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("File");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person newPerson = (Person) objectInputStream.readObject();
		objectInputStream.close();
		//assertTrue(newPerson.getAge() == person.getAge());
		//assertTrue((newPerson.getName()).equals(person.getName()));
		System.out.println(newPerson.getAge());
		System.out.println(newPerson.getName());
		Address newAddress = person.getAddress();
		System.out.println(newAddress.cityName);
		System.out.println(newAddress.address);
		System.out.println(newPerson.getState());
	}

}
