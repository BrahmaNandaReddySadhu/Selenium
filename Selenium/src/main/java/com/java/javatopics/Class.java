package com.java.javatopics;

public class Class {
	/*
	 * 1) class Name start with the UpperCase
	 * 2) class name should not start with the Numbers -->2Test
	 * 3) should not use the special characters in the class name
	 */

	/*
	 * class is just blue print
	 * to allocate the memory for the variable and methods we need to create the object for the class
	 */

	/*
	 * constructor is also just like method which allocating the memory to the class
	 * rules for the constructor
	 * 1) same as class name
	 * 2) No return type
	 * 3) assign the 
	 * 
	 */


	public Class() {
		System.out.println("default constructor");

	}
	public Class(int a) {
		System.out.println("Parametrorized Constructor");
	}


	/*
	 * Methods
	 */

	public void testMethod1() {
		System.out.println("Nothing returning ");
	}
	public int testMethod2() {
		System.out.println("returning integer ");
		return 10;
	}
	public Class testMethod3() {
		System.out.println("returning Object ");
		return new Class();
	}
	public static void main(String[] args) {
		new Class();
		new Class(0);
	}
}
