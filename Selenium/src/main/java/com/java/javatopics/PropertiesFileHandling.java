package com.java.javatopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileHandling {

	public static void propertiesFileAccessingDataInDifferentWays() throws IOException {
		/*
		 *  Properties file accepting the data in the form of the --->  Key=Value
		 *  
		 *  In java any file we can handle with  the help of  File Object
		 *   
		 *   File file = new File(" location");
		 */

		File file = new File("./Resources/PropertiesFiles/config.properties");
		System.out.println(file.exists());  // to check whether the file is exist or not 
		Properties properties = new Properties();

		FileInputStream fileInputStream = new FileInputStream(file);

		// we can alos load the file by passing the FileReader also
		FileReader reader = new FileReader(file);
		properties.load(reader);
		properties.load(fileInputStream);


		// we can read the property values in different ways like 

		// 1st way  --> getting property as object 
		Object property1 = properties.get("browserName");   // chrome
		System.out.println(property1);

		// 2nd way  --> getting property as String

		String property2=properties.getProperty("url");    //https://www/google.com/
		System.out.println(property2);

		// 3rd way  -> if the specified key (name) is available then it display it value , otherwise it display the default value (if value is not avaialble)

		String property3=properties.getProperty("name", "if value is not avaialble");  //sadhu
		System.out.println(property3);

		String property4=properties.getProperty("username", "Username not available")  ;  // username key is not available , so it display the Username not available as username value 
		System.out.println(property4);

		/*
		   chrome
           https://www.google.com/
           sadhu
           Username not available

		 */

		fileInputStream.close();


	}

	public static void WritingDataToPropertyFile() throws IOException {
		File file = new File("./Resources/PropertiesFiles/config.properties");

		Properties properties = new Properties();
		FileReader reader = new FileReader(file);
		properties.load(reader);

		System.out.println(properties.size());  // 3 --. display how many key value are there


		//  Reading all the key = values from the Property File 
		Set<Object> keys=properties.keySet();
		for(Object k:keys) {
			System.out.println("key-->"+ k +" values is -->"+properties.get(k));
		}

		/*

	    key-->name values is -->sadhu
	    key-->browserName values is -->chrome
	    key-->url values is -->https://www.google.com/

		 */



		/*
		 *  Write the key=value pair to the property file 
		 *  
		 *  We need to set the value to the property object
		 *  once we set those value are available only in Property object , for to make it available on the file we need to write it in to file 
		 *  
		 *  we need to write using 
		 *  
		 */

		properties.setProperty("newproperty", "added to the propert ");
		System.out.println(properties.getProperty("newproperty"));   //-->  we are getting when try to print but that value is not visible in the property file , for make it visible we need to write that property using some writer 


		// try to writing into file

		FileWriter writer = new FileWriter(file);  //creating the file writer object and try to pass to store () method

		properties.store(writer, "value added succeddfully");
		writer.close();
		reader.close();


	}

	public static void main(String[] args) throws IOException {
		System.out.println("Reading the data from the Properties file dffrent ways");
		PropertiesFileHandling.propertiesFileAccessingDataInDifferentWays();
		WritingDataToPropertyFile();

	}

}
