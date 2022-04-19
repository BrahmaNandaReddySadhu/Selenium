package com.java.javatopics;

public class StaticAndNonStatic {

	static String value;

	/*
	 *     Instance variables and Instance methods
	 *     
	 *     Instance Blocks --> Directly we can access
	 *     Static block     --> we need to Create the object 
	 *     
	 *      
	 *     Static variable or Static methods
	 *     
	 *     Instance Blocks --> Directly we can access  with ClassName
	 *     Static block    --> Directly we can access  with ClassName
	 *     
	 *     
	 *     We can access the statics variable and methods  in 3 ways
	 *     
	 *     1) with ClassName
	 *     2) By creating the object 
	 *     3) Directly 
	 * 
	 */
	
	
	
	
	/*
	 *  Static key word applicable for 
	 *  1) Variables  -> Only Global variable
	 *  2) Methods --> for any method 
	 *     ex :   public static void m1( String value) {
		          System.out.println("m1 method");
	              }
	 *  
	 *  Not applicable for the variable present inside the methods and a parameter  --> applicable for only global variables 
	 *  
	 *  public void m1() {
		static String value;    --> error saying Illegal Modifier - if we try to use it as local variable
		}

		public void m1(static String value) {   --> error saying illegal Modifier when try to use it as Parameter of the method

	    }
	 *  
	 *  
	 *  
	 *  
	 */


	/*
	 * We are allocating the memory to the variable or methods by creating the Object to the class 
	 * In the similar way  java will automatically allocate the memory to the variables and methods if we declare them as static keyword ,
	 * you don't need to allocate memory to them , java will automatically allocate memory at the runtime 
	 */

	/*
	 * what is the need of the this static concept ?
	 * 
	 * In some organisations , we have to fill some details like empid,empname,company name,location
	 * 
	 * 101 -aaa- oracle- India
	 * 102 -bbb-oracle- UK
	 * 103- ccc-Orcale - London
	 * 104-ddd-Oracle-Montreul
	 * 
	 * Here company name is same for all the four records , so we can make the company name as Static keyword 
	 * if we declare with static it will allocate the common memory to some common filed( company name) so we can save the memory
	 * 
	 */

	public  void m1( String value) {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
		m1("test");  // m1() is instance method , we can dircetly access in instance method m2()
	}

	public static void m3() {

	}

	/*
	 * When ever we crate the object to this particular class then only for m1() and m2() methods memory allocated , 
	 * in the above for m2() we create the Object to the class , but m2() is not available on the memory , so it unable to call m1() method
	 * 
	 * so thats why we are using main methods as static 
	 * it method name should be main()
	 * we should pass only  array of the string as argument for main method
	 * 
	 */
	public static void main(String[] args) {
		StaticAndNonStatic objectStaticAndNonStatic =new StaticAndNonStatic();
		objectStaticAndNonStatic.m1("data");   // m1 () is instance method so with the help of the object we can access
		objectStaticAndNonStatic.m2();       // m2() is also instance method so with the help of the Object we can access
        
		m3();                    // m3() is static we can directly access
		StaticAndNonStatic.m3();  //  with the help of the class name 
		objectStaticAndNonStatic.m3(); // with the help of the object 
	}

}

