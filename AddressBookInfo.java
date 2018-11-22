package com.bridge;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;

public class AddressBookInfo {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper;
		Address book = new Address();
		Person info = new Person();
		String str = "";
		do {
			Scanner scanner = new Scanner(System.in);

			/*
			 * System.out.println("enter the number of entires"); int entry =
			 * scanner.nextInt(); book.setNoOfEntries(entry);
			 */
			System.out.println("this is the first record in file 1");
			System.out.println("enter persons first name");
			String firstName = scanner.next();
			info.setFirstName(firstName);
			System.out.println("enter persons last name");
			String lastName = scanner.next();
			info.setLastName(lastName);
			System.out.println("enter the city name");
			String cityName = scanner.next();
			book.setCityName(cityName);
			System.out.println("enter the state name");
			String state = scanner.next();
			book.setStateNmae(state);
			System.out.println("enter the pin code ");
			long PinCode = scanner.nextLong();
			book.setPinCode(PinCode);
			info.setAddress(book);
			System.out.println("you want to add more peoeple yes or no");
			// System.out.println("you want to add in new file");
			str = scanner.next();
			//if (str.equals("yes"))
				;
			// string = scanner.next();

		} while (str.equals("yes"));

		String jsonResult = null;
		mapper = new ObjectMapper();
		try {
			jsonResult = "["+mapper.writeValueAsString(info)+"]";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		JSONArray array=new JSONArray();
				//array.add(jsonResult);
		File file = new File("/home/bridgelabz/address123/book.json");
		FileWriter writer = new FileWriter(file);
		writer.write(jsonResult);
		writer.close();

	}
}
