package com.bridge;

import java.awt.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressBookImplementation implements AddressBook {
    static ArrayList<Person>list;
	Scanner sc = new Scanner(System.in);
	//String filename=sc.next();
	
	ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
		AddressBookImplementation imp = new AddressBookImplementation();
		                   imp.open();
		                  imp.save();
		                  // imp.saveAs();
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void open() {
		list= new ArrayList<>();

		System.out.println("number of files are");

		File folder = new File("/home/bridgelabz/address123");

		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println(i + 1 + " File " + listOfFiles[i].getName());
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
		System.out.println("which file you want to open");
		System.out.println("enter name");

		// File file=new File("/home/bridgelabz/address123/address.json");

		String name = sc.nextLine();
		String path="/home/bridgelabz/address123/"+name+".json";
		System.out.println(path);
		{
			System.out.println("you want open first file enter the name");
			try {
				list=(mapper.readValue(new File(path),
						new TypeReference<ArrayList<Person>>() {
						}));
				System.out.println(list);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}

		}

	}
   public void save()
   {
	  System.out.println(list);
	  File file=new File("/home/bridgelabz/address123/book.json");
	  
	  
	try{
	  String result=null;
	  int temp=0;
	  for(int i=0;i<list.size()-1;i++){
		  temp=i;
	  
		  
			result=mapper.writeValueAsString(list.get(i))+",";
		
		  }
		  if(list.size()>1){
			 result=mapper.writeValueAsString(list.get(temp+1));
			  
		  }
		 temp++; 
			if(list.size()==0){
				result=mapper.writeValueAsString(list);
			}
			
			FileWriter writer=new FileWriter(file);
			writer.write(result);
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  		
	  }
	   
	  
	   
   
	@Override
	public void saveAs() {
     System.out.println("save the previous file");
     System.out.println("in which file format you want to save 1).txt 2).json");
     //String name="/home/bridgelabz/address123/"+filename+".txt";
     
  
    		 
    		 
    		
    		String path="/home/bridgelabz/address123/";
    		System.out.println(path);
    		{
    			System.out.println("you want open first file enter the name");
    			try {
    				list=(mapper.readValue(new File(path),
    						new TypeReference<ArrayList<Person>>() {
    						}));
    				System.out.println(list);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    				
    			}
    		}
    
     
		// TODO AutoSystem.out.println("creating a new file");
		

	}

	@Override
	public void quit() {
	System.out.println("if you want to quit ");	
		// TODO Auto-generated method stub

	}

}
