package com.java.datatypes;

public class DataTypes {

	/* 1) primitive data types
	 * 2) Non primitive data types
	 * 
	 * 
	 * we have 8 primitive data types
	 * 
	 *  Text -->  String , char
	 *  numeric --> byte , short , int , long , float , double 
	 *  boolean --> boolean 
	 */
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
		 *  To display the range and size of the data types in java 
		 */


		/*
		 * Int size in bytes -->4
           int min value -->-2147483648
           int max value -->2147483647
		 */
		System.out.println("Int size in bytes -->"+Integer.SIZE/8);
		System.out.println("int min value -->"+Integer.MIN_VALUE);
		System.out.println("int max value -->"+Integer.MAX_VALUE);

		/*
		  short size in bytes -->2
          short min value -->-32768
          short max value -->32767

		 */

		System.out.println("byte size in bytes -->"+Byte.SIZE/8);
		System.out.println("byte min value -->"+Byte.MIN_VALUE);
		System.out.println("byte max value -->"+Byte.MAX_VALUE);

		/*
		  short size in bytes -->2
          short min value -->-32768
          short max value -->32767
		 */

		System.out.println("short size in bytes -->"+Short.SIZE/8);
		System.out.println("short min value -->"+Short.MIN_VALUE);
		System.out.println("short max value -->"+Short.MAX_VALUE);

		/*

		 long size in bytes -->8
         long min value -->-9223372036854775808
         long max value -->9223372036854775807
		 */

		System.out.println("long size in bytes -->"+Long.SIZE/8);
		System.out.println("long min value -->"+Long.MIN_VALUE);
		System.out.println("long max value -->"+Long.MAX_VALUE);

		/*
		  float size in bytes -->4
          float min value -->1.4E-45
          float max value -->3.4028235E38
		 */

		System.out.println("float size in bytes -->"+Float.SIZE/8);
		System.out.println("float min value -->"+Float.MIN_VALUE);
		System.out.println("float max value -->"+Float.MAX_VALUE);

		/*
		 double size in bytes -->8
         double min value -->4.9E-324
         double max value -->1.7976931348623157E308

		 */

		System.out.println("double size in bytes -->"+Double.SIZE/8);
		System.out.println("double min value -->"+Double.MIN_VALUE);
		System.out.println("double max value -->"+Double.MAX_VALUE);




	}

}
