package com.acme.javaexamples;

import java.util.Scanner;

public class RemoveVowels {
	public static void removeVowels(String string)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter new String");
	string = scanner.nextLine();
	String newString = string.replaceAll("[AEIOUaeiou]", " ");
	System.out.println(newString);
	scanner.close();
	}
}
