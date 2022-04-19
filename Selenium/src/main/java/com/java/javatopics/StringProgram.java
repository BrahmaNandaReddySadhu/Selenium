package com.java.javatopics;

import org.openqa.selenium.net.PortProber;

public class StringProgram {
	public static void main(String[] args) {
		StringProgram object = new StringProgram();
		System.out.println("String basic topics");
		object.stringTopics();
		System.out.println("String comparisios");
		object.stringComaparision();

}
	public void stringComaparision() {
		String s1= "hello";
		String s2= new String("hello");
		String s3= "hello";
		String s4= new String("hello");
		
		
		/*
		 * Literal to Literal --> True 
		 * Object to Object  --> False
		 * Literal to object --> false
		 * Object to literal -->false
		 */
		
		//    == is used to comapare the memory address
		System.out.println(s1 == s2); // false
	    System.out.println(s1 == s3); // true
	    System.out.println(s2 == s4); // false   
	    System.out.println(s2.hashCode());  // 99162322
	    
	    System.out.println(s4.hashCode()); // 99162322    -- even though hascodes are same but memory is different so it gave false
	    
	    // if you want to compare the content of the string object then use equals
	    
	    System.out.println(s2.equals(s4));  // true
	    System.out.println(s1.equals(s3));  // true
	    
	}
	
	public void stringTopics() {
		/*
		 * for represent the text we have two ways 
		 * 1) String
		 * 2) Char
		 * 
		 * String is Class in java --> from  "java.lang" package  , it also called as Literal
		 */

		// we can declare string in 2 ways those
		//1st way
		String value1 = "java";
		// 2nd way
		String value2 = new String("java");
		
		// accessing the string
		
		System.out.println(value1);  //java
		System.out.println(value2);  // java
		
		
		
		StringProgram obj = new StringProgram();
		System.out.println(obj);  // com.java.javatopics.StringProgram@76ed5528
	    
		String object = new String();
		System.out.println(object);  // it does give any output just like above "om.java.javatopics.StringProgram@76ed5528" so strings are specially handled in the java programming

		
		
		/*
		 * Character
		 */
		
		char c='y';
		char[] chararray = {'c','d','e'}; 
		System.out.println(c);   //y
		System.out.println(chararray); // cde
		
		// if we want to convert the charater array to string by using
		
		String string = new String(chararray);
		System.out.println(string);  //cde
	}
}
