package com.bridge;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddFeatures {

	public static void main(String[] args) throws Exception {
		JSONParser parser = new JSONParser();

		String name = "";
		AddressBookInfo address = new AddressBookInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("what you want to do");
		System.out.println("1.create new File\n  2.Open existing file\n 3.save the file\n 4.save as\n 5.quit ");
		System.out.println("enter your choice");
		File f = null;
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("creating a new file");
			System.out.println("enter the name of the file");
			name = scanner.next();
			f = new File("/home/bridgelabz/" + name + ".json");

			f.getParentFile().mkdirs();
			f.createNewFile();

		case 2:

			String folderPath = "/home/bridgelabz/address123";
			File folder = new File(folderPath);
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) {
					System.out.println("Directory " + listOfFiles[i].getName());
				}
			}

			try {

				Object obj = parser.parse(new FileReader("/home/bridgelabz/address123"));

				JSONObject jsonObject = (JSONObject) obj;

				String firstName = (String) jsonObject.get("firstName");
				String lastName = (String) jsonObject.get("lastName");
				String cityName = (String) jsonObject.get("cityName");
				JSONArray list = (JSONArray) jsonObject.get("list");

				System.out.println("FirstName: " + firstName);
				System.out.println("LastName " + lastName);
				System.out.println("CityNmae" + cityName);
				System.out.println("");
				System.out.println("\nCompany List:");
				Iterator<String> iterator = list.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			/*
			 * try { Object object =parser.parse(new
			 * FileReader("c:\\sample.json"));
			 * 
			 * //convert Object to JSONObject JSONObject jsonObject =
			 * (JSONObject)object;
			 * 
			 * //Reading the String String name = (String)
			 * jsonObject.get("Name"); Long age = (Long) jsonObject.get("Age");
			 * 
			 * //Reading the array JSONArray countries =
			 * (JSONArray)jsonObject.get("Countries");
			 * 
			 * //Printing all the values System.out.println("Name: " + name);
			 * System.out.println("Age: " + age);
			 * System.out.println("Countries:"); for(Object country : countries)
			 * { System.out.println("\t"+country.toString()); } }
			 * catch(FileNotFoundException fe) { fe.printStackTrace(); }
			 * catch(Exception e) { e.printStackTrace(); } } }
			 */

			name = scanner.next();
			Desktop desktop = Desktop.getDesktop();

			desktop.open(folder);

			// case 3

		}
	}
}
