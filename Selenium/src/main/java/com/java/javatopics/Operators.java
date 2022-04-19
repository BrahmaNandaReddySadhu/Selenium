package com.java.javatopics;

public class Operators {
	/*
	 * Arithmetic Operator
	 * Unary Operator
	 * Relational Operator
	 * Conditional Operator
	 * Assignment Operator
	 * 
	 */

	public static void main(String[] args) {

		/*
		 *  Arithmetic Operator
		 *  +
		 *  -
		 *  *
		 *  /
		 *  %
		 */
		System.out.println(1+2);  //3
		System.out.println(2-1);  // 1
		System.out.println(2*3);  // 6
		System.out.println(10/3); // 3
		System.out.println(10%3); // 1


		/*
		 * Unary Operator  ++ ,--
		 * 
		 */

		int a=10;
		// post Increment and Post decrement 
		System.out.println(a++); // 10 : first value is printed then perform the increment
		System.out.println(a);   // 11  : value is already incremented 
		System.out.println(a--); // 11  : first value is printed , then it value is decreased by one
		System.out.println(a);   // 10  : value is already decreased


		// pre increment and pre decrement
		int b=10;
		System.out.println(++b); // 11 : value first Incremented and then print the value 
		System.out.println(b);   // 11 : value is already incremented
		System.out.println(--b); // 10 : value is first decremented and then print the value
		System.out.println(b);   // 10 : value is already decremented


		/*
		 * Relational Operators : we got boolean value as result
		 * == 
		 * !=
		 * <
		 * <=
		 * >
		 * >=
		 * 
		 */

		int x=10;
		int y=20;

		System.out.println(x==y); // false
		System.out.println(x!=y); // true
		System.out.println(x<y);  // true
		System.out.println(x<=y); // true
		System.out.println(x>y);  // false
		System.out.println(x>=y); // false


		/*
		 * Conditional Operators
		  && -  And Conditional Operator 
		  true true - true
		  true false - false
		  false true  - false
		  false false - false


		 ||  - Or Conditional Operator
		  true true - true
		  true false - true
		  false true  - true
		  false false - false
		 */

		int i=20;
		int j=20;
		int k=30;

		System.out.println(i==7 && j==20);  //false
		System.out.println(i==20 || k==60); // true
		System.out.println((i==7 && j==30) || (j==20));  // true

		/*
		 * Assignment Operators
		 * 
		 *  =
		 *  +=
		 *  -=
		 *  *=
		 *  /=
		 *  %=
		 *  <<=
		 *  >>=
		 *  &=
		 *  ^=
		 *  
		 */

		int z=5;
		z=z+3;
		System.out.println(z); //8

		// we can also write above z=z+3 as z+=3

		int w=5;
		w+=3;
		System.out.println(w); // 8

		int aa=5;
		aa/=3;
		System.out.println(aa);  //1
		int ab=5;
		ab-=3;
		System.out.println(ab);   //2
		int ac=5;
		ac%=3;   
		System.out.println(ac); //2

		int ad=2;
		/*
		 *  2           -> 0000 0010 
		 *  ad << 2     -> 0000 1000 --> 8 
		 *  ad >>2      -> 00000000  --> 0
		 */
		System.out.println(ad<<2);  // 8
		System.out.println(ad>>2);  // 0 
       
		int ar=5;
		System.out.println(ar++ + ++ar);


	}

}
