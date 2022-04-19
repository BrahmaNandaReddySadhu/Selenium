package com.java.javatopics;

public class ArrayAccessing {

	public void singleDimesionalArray() {

		/*
		 * print the array values using the indexes
		 */
		int array[]= {10,20,30,405,50,60,30,40,5} ;
		System.out.println(array[0]);  // 10 
		System.out.println(array[1]);  // 20
		System.out.println(array[2]);  // 30
		System.out.println(array[3]); // 405
		System.out.println(array[4]); // 50
		System.out.println(array[5]); // 60

		/*
		 *  print the array value using for looping statements
		 */

		for (int i = 0; i < array.length; i++) {
			int value=array[i];
			System.out.println(value);	
		}

		/*
		 * print the array value using for- each / extended for loop
		 * 
		 * in the for-each loop we don't know the index
		 * we have only increment in for each loop
		 * we can use for each loop only for arrays , collections
		 */
		for(int value:array) {
			System.out.println(value);
		}
	}

	public void multiDimesionalArray() {

		int array[][] = { {1,2,3},
				{2,3,4}     
		};

		/*
		 *  for loop 
		 */
		for (int i = 0; i < array.length; i++) {

			// passing the number of the columns of the first row 
			for (int j = 0; j < array[0].length; j++) { 
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		
		/*
		 * for each loop
		 */
		
		for (int[] singleDimensional : array) {
			for (int  element : singleDimensional) {
				System.out.print(element);
			}
			System.out.println();
		}


	}	
	public static void main(String[] args) {

		ArrayAccessing object = new ArrayAccessing();
		System.out.println("single dimensional array");
		object.singleDimesionalArray();
		System.out.println("Multidimensional array values");
		object.multiDimesionalArray();

	}
}
