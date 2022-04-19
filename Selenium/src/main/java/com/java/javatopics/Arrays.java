package com.java.javatopics;

public class Arrays {
	/* Arrays are used to store the multiple values of the same data type 
	 *  1) Single dimensional array
	 *  2) Two dimensional array
	 *  3) Jagged Array
	 */



	public void singleDimensionalArray() {
		int i=5;    // single value can store in in variable 
		//int array[] = {12,13,15,15};  // we can able to store the multiple value under single variable 


		// 1 st way of definining and Initializing the array 
		int array[]; 
		array= new int[4];  // we are creating the array 

		// Default values are assigned to the array once we create the array 

		System.out.println(array[0]); //0
		System.out.println(array[1]); //0
		System.out.println(array[2]); //0
		System.out.println(array[3]); //0

		// assigning the value to the array  so default values are override

		array[0]=4;

		array[2]=99;
		array[1]=23;
		array[3]=88;

		// once again we are creating the array , so old value will destroyed 

		array = new int[2];  
		array[1]=34;
		System.out.println(array[1]); //34 
		System.out.println(array[0]); //0   because old values are destroyed 


		// 2nd way of defining and initialization of array
		String[] stringarray = {"Java","C++"};
		System.out.println(stringarray.length);

		// accessing array values using the indices
		System.out.println(stringarray[0]);
		System.out.println(stringarray[1]);

	}

	public void multiDimensionalArray() {
		// Two dimensional array   --> rows and columns are same 
		/// jagged array --> number of Rows Fixed , But columns are different for rows 
		
		int array[][] = new int[3][2];
		
		System.out.print(array[0][0]);
		System.out.println(array[0][1]);
		
		System.out.print(array[1][0]);
		System.out.println(array[1][1]);
		
		System.out.print(array[2][0]);
		System.out.println(array[2][1]);
		
		
	// 1 st way of initilizing the array values
		int [][] secondArray = {
				{1,0},
				{2,3},
				{3,4}
		};
		
		// 2nd way of initilizing the array values 
		secondArray[0][1]=2;
		secondArray[0][0]=9;
		secondArray[1][1]=2;
		secondArray[1][0]=9;
		secondArray[2][1]=2;
		secondArray[2][0]=9;
		
		
		
		System.out.print(secondArray[0][0]);
		System.out.println(secondArray[0][1]);
		
		System.out.print(secondArray[1][0]);
		System.out.println(secondArray[1][1]);
		
		System.out.print(secondArray[2][0]);
		System.out.println(secondArray[2][1]);
		

	}
	
	public void jaggedArray() {
		int array[][]= 
			{
					{10,20,40},
					{10},
					{20,394,85,8887,89}
	     	};
		
		System.out.print(array[0][0]);
		System.out.print(array[0][1]);
		System.out.println(array[0][2]);
		
		System.out.println(array[1][0]);
		
		
		System.out.print(array[2][0]);
		System.out.print(array[2][1]);
		System.out.print(array[2][3]);
		System.out.println(array[2][4]);
	
		
		/*
		 column count is not fixed , so we declare only number of rows 
		 But the problem with this example is it will throw null pointer exception be
		 cause we can not specified the column size ,
		 java dont know how to create the memory ( becuse you dont specify th column size
		
		
		 We get the exception like this 
		 Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "secondArray[0]" is null
	     at com.java.javatopics.Arrays.jaggedArray(Arrays.java:124)
	     at com.java.javatopics.Arrays.main(Arrays.java:146)

		*/
		int secondArray [][] = new int [3][];
		
//		secondArray[0][0]=10;
//		secondArray[0][1]=10;
//		secondArray[1][0]=10;
//		secondArray[2][0]=10;
//		secondArray[2][1]=10;
//		secondArray[2][2]=10;
//		
//		System.out.println(secondArray[0][0]);
//		System.out.println(secondArray[0][1]);
//		System.out.println(secondArray[1][0]);
//		System.out.println(secondArray[2][0]);
//		System.out.println(secondArray[2][1]);
//		System.out.println(secondArray[2][2]);
		
		
		// We can overcome the above the Jagged array problem by using 
		// decalring the how much size of each row 
		
		//1st way of declaring and initilizing jagged array
		secondArray[0]= new int[2];
		secondArray[1]=new int[1];
		secondArray[2]=new int[4];
		
		secondArray[0][0]=10;
		secondArray[0][1]=10;
		secondArray[1][0]=10;
		secondArray[2][0]=10;
		secondArray[2][1]=10;
		secondArray[2][2]=10;
		
		
		System.out.println(secondArray[0][0]);
		System.out.println(secondArray[0][1]);
		System.out.println(secondArray[1][0]);
		System.out.println(secondArray[2][0]);
		System.out.println(secondArray[2][1]);
		System.out.println(secondArray[2][2]);
		
		
		// 2nd way of declaring the Jagged array 
		secondArray[0]= new int[]{10,220};
		secondArray[1]=new int[] {10};
		secondArray[2]=new int[] {20,30,4050,607,8};
		System.out.println(secondArray[0][0]);
		System.out.println(secondArray[0][1]);
		System.out.println(secondArray[1][0]);
		System.out.println(secondArray[2][0]);
		System.out.println(secondArray[2][1]);
		System.out.println(secondArray[2][2]);
		
		
		
	}
	public static void main(String[] args) {
		Arrays arraysObject = new Arrays();
		System.out.println("single dimensional array ");
		arraysObject.singleDimensionalArray();
		System.out.println("Multi dimensional Array ");
		arraysObject.multiDimensionalArray();
		System.out.println("Jagged array");
		arraysObject.jaggedArray();
		
		


	}


}
