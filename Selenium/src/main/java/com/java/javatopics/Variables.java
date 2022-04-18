package com.java.javatopics;

public class Variables {
	
	/*
	 *  variables is container which can used to store some values 
	 * 
	 *  1) Instance variable
	 *  2) Static variable
	 *  3) Local variable  
	 *   
	 *   
	 *   
	 */
	static String staticVarible = "No need to create the object to the statics variables";
	String stringValue = " String value ";
	int intValue = 123;
	char charValue = 'c';
	short shortValue = 123;
	byte byteValue = 123;
	long longValue = 1234;
	double doubleValue = 123.78;
	float floatValue =2312.787f;
    int [] intArray = {12,34,56} ;

	public static void main(String[] args) {
		/*
		 * We need to create the object for accessing the  instant variables 
		 */
		
		Variables objectVariables = new Variables();
		System.out.println(objectVariables.stringValue);
		System.out.println(objectVariables.intValue);
		System.out.println(objectVariables.charValue);
		System.out.println(objectVariables.shortValue);
		System.out.println(objectVariables.byteValue);
		System.out.println(objectVariables.longValue);
		System.out.println(objectVariables.doubleValue);
		System.out.println(objectVariables.floatValue);
		System.out.println(objectVariables.intArray[1]);
		System.out.println(staticVarible); //  directly accessing the variable
		System.out.println(Variables.staticVarible); //  using class name 
		System.out.println(objectVariables.staticVarible); // using object 
	}

}
