package com.acme.babynames;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.HashMap;

import java.util.Map;

public class BabyNames {
	
	public static void createAFile() throws Exception {
		File file = new File("BabyNames");
		file.createNewFile();
	}

	public static void ReadAFile() throws Exception {
		FileReader fileReader = new FileReader("C:\\Users\\Dell15\\eclipse-workspace\\New\\BabyNames");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String myString = "";
		String line = bufferedReader.readLine();
		while (line != null) {
			myString = myString + line + "\n";
			line = bufferedReader.readLine();
		}
		System.out.println(myString);
		bufferedReader.close();
	}

	public static Map<String, Integer> createMap(String fileName) throws Exception {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		while (line != null) {
			String[] strings = line.split(",");
			String name = strings[0];
			Integer age = Integer.parseInt(strings[2]);
			hashMap.put(name, age);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		return hashMap;

	}

}
