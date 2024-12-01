package com.java.javatopics;

public class StringBasicMethods {

	public static void main(String[] args) {
		String value1 = "hello";
		String value2 = "Hello";

		System.out.println(value1.equals(value2));              // false
		System.out.println(value1.equalsIgnoreCase(value2));    // true
		System.out.println(value1.contentEquals(value2));       // false
		System.out.println(value1.toUpperCase());               // HELLO
		System.out.println(value1.toUpperCase().toLowerCase()); // hello  --> this is method chaining
		System.out.println(value1.startsWith("h"));             // true
		System.out.println(value1.startsWith("he"));            // true
		System.out.println(value1.endsWith("lo"));              // true
		System.out.println(value1.indexOf("llo"));              // 2   
		System.out.println(value1.lastIndexOf("l"));            // 3
		System.out.println(value1.charAt(2));                   // l
		System.out.println(value1.concat(value2));              // helloHello
		System.out.println(value1.contains("e"));               // true
		System.out.println(value1.length());                    // 5


		for (int i = 0; i < value1.length(); i++) {
			System.out.println(value1.charAt(i));   
			/*
			 * h
               e
               l
               l
               o
			 */
		}

		char[] arr=value1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			System.out.println(c);
			/*
			h
			e
			l
			l
			o
			 */
		}
		System.out.println(value1.replace('h', 'Z'));   // Zello

		String value3 = "hello word";
		String array[]=value3.split(" ");
		System.out.println(array[0]);      // hello

		System.out.println(value3.substring(1,3)); // el




	}

}
