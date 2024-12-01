package com.java.javatopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTopics {

	/*
	 * If we want to store the multiple data type of same or different group of element then we go with the Collection
	 * 
	 * Arrays are already there to store the group of the element why collection?
	 * 
	 * some problems are there in arrays
	 * 1) arrays are fixed length - once we declared size will not change
	 * 2) Arrays stores only similar data types ( only Integer, Only String etc)
	 * 3) We are accessing the array values using index ,  so if 1000 values are there , i want to access 999 element i need to  iterate all the indexes to reach that 999 element
	 * 4) key , value pair mechanism is not available 
	 * 5) we cannot store unique values in arrays
	 * 
	 * 
	 * 
	 * So To Overcome the problems , one Framework is available which is called  Collection Framework
	 * 
	 * Collection  ---> Is Interface
	 *   1)List  ->Interface
	 *   2)Set   ->Interface
	 *   3)Queue ->Interface
	 *   4)Map   ->Interface
	 */
	
	/*
	 *   List : Interface
	 *   
	 *   Implemented Classes of List 
	 *      1) ArrayList
	 *      2) LinkedList
	 *      3) Vector
	 *      4) Stack
	 *      
	 *     
	 *     
	 *     
	 *     Iterable -- Collection --> List -->ArrayList
	 *     Iterable --> Collection--> List/Dequeue -->LinkedList
	 *     Iterable --> Collection --> List --> Vector
	 *     Iterable --> Collection--> List -->vector --> Set
	 *     
	 *     
	 *     
	 */
	
	
	public static void testArrayList() {
		
		/*
		 *  Collection Entirely Dealing with the Objects
		 *  
		 *  List<int> list = new ArrayList<int> ();   -----> this is invalid 
		 *  
		 *  so we need to  use the corresponding Wrapper Classes for every primitive data types
		 *  
		 *  List<Integer> list = new ArrayList<Integer>(); --> this is valid
		 *  List<Employee> list = new ArrayList<Employee>(); --> valid
		 */
		
		
		// if we didnt specify generic type it will consider type of the data is  Object
		
		
		/*
		 * Adding the elements 
		 */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(1);
		System.out.println(numbers.size());  // 3          if we comment one line then size will get change dynamically 
		numbers.add(1);
		numbers.add(23);
		System.out.println(numbers.size());   // 5
		System.out.println(numbers);           //  [10, 20, 1, 1, 23]
		
		
		/*
		 *  removing the elements
		 *  
		 *  1) based on Index  remove(index)
		 */
		numbers.remove(1);       // this remove the index of one
		System.out.println(numbers);  // [10, 1, 1, 23]
		
		/*
		 *  Sorting 
		 *  
		 *  We can used Collections class for sort the data
		 *  
		 */
		
		Collections.sort(numbers);     // - trying to perform the sorting
		System.out.println(numbers);   //   [1, 1, 10, 23]
		
	
		/*
		 *  Add the data using Index 
		 */
		
		numbers.add(1,99);       // add (index , value)
		System.out.println(numbers);   // [1, 99, 1, 10, 23]
		
		/*
		 *  Update the Value using Set 
		 */
		
		numbers.set(1, 88);
		System.out.println(numbers);
		
		/*
		 *  get the value
		 */
		 System.out.println(numbers.get(3));   // 10
		// System.out.println(numbers.get(99));  // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 99 out of bounds for length 5
		
		
		 
		 /*
		  *  print the all the values  using for loop / for each loop
		  */
		 
		 for (int i = 0; i < numbers.size(); i++) {
			Integer data =numbers.get(i);
			System.out.print(data+"--");   //   1--88--1--10--23--
		}
		 
		 System.out.println();
		 
		for(Integer data:numbers) {
			System.out.print(data+"--");    // 1--88--1--10--23--
		}
		
        System.out.println(numbers.contains(10));    // true	 
		 
	}
	
	
	public static void testHashMap() {
		
		/*
		 *  Insertion order is not there 
		 *  Duplications not allowed
		 *  key should not duplicate 
		 *  values may be null 
		 *  
		 *  only one null is allowed in key
		 */
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(106, "Sadhu");
		hashMap.put(102, "brahma");
		hashMap.put(103, "reddy");
		System.out.println(hashMap);
		System.out.println(hashMap.getClass().getSimpleName());  // to know which  type of the variable 
 		System.out.println(hashMap.size());
 		hashMap.remove(101);
 		System.out.println(hashMap);
 		//System.out.println(hashMap.remove(102, "brahm"));    //   give the status after removing or not by giving the boolean value 
 		
 		hashMap.put(101, "AAAA");
 		hashMap.put(102, "BBB");
 		System.out.println(hashMap);
 		
 		hashMap.put(null, "CCCC");
 		hashMap.put(null, "DDDD");
 		
 		System.out.println(hashMap);
 		
 		
 		/*   
 		 *  get the value
 		 *  
 		 */
 		
 		System.out.println(hashMap.get(105));   //  null - since 105 is not available
 		System.out.println(hashMap.get(101));   // AAAA
 		
 		
 	    /*
 	     * 
 	     *    get all the keys 
 	     */
 		
 		Set<Integer> keySet = hashMap.keySet();
 		System.out.println(keySet.toString());
 		
 		for (Integer integer : hashMap.keySet()) {
		
 			 System.out.println("key -->"+integer+" value -->"+hashMap.get(integer));
 			/* 
 			key -->null value -->DDDD
 			key -->101 value -->AAAA
 			key -->102 value -->BBB
 			key -->103 value -->reddy
 			key -->106 value -->Sadhu
 			*/
		}
 		
 	
 		
 		
 		
 	}
	
	public static void testSet() {
		
	 /*
	  * 
	  *   set is similar to list some difference are 
	  *   
	  *   1) No duplicate 
	  *   2) Insertion ordert not there
	  *   3) one null value allowed 
	  *   4) We canot accesss the value using index
	  *   
	  *   
	  *   Iterable --> Collection --> Set --> HashSet
	  *   Iterable --> Collection --> Set -->LinkedHashSet
	  *   Iteravle --> Collection -->Set -->Tree Set
	  *   
	  *   
	  */
		
		
		HashSet< String> hashSet = new HashSet<String>();
		System.out.println("*********************");
		hashSet.add("manago");
		hashSet.add("apple");
		hashSet.add("mango");
		hashSet.add(null);
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		/*
		 *  Accessing value s
		 * 
		 */
		for(String a:hashSet) {
			System.out.println(a);
			
		}
		
		hashSet.remove(null);
		System.out.println(hashSet);
		
		
		
		
		
		
		/*
		 *   Linked Hash Set
		 *   1) Insertion order there
		 *   2) Duplicate value not there 
		 *   3)Null value allowed
		 *   
		 */
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("AAAA");
		linkedHashSet.add("BBBB");
		System.out.println(linkedHashSet);
		linkedHashSet.add("AAAA");
		System.out.println(linkedHashSet);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		
		/*
		 *  TreeSet
		 *  
		 *  1) dont allow null
		 *  2) dont allowe duplicate
		 */
		
		TreeSet< String> treeSet = new TreeSet<String>();
		treeSet.add("AAA");
		System.out.println(treeSet);
	//	treeSet.add(null);
		//System.out.println(treeSet);  // Exception in thread "main" java.lang.NullPointerException
	}
	
	
    public static void testQueue() {
    	/*
    	 *  Queue -- LinkedList
    	 *  Queue -- PriorityQueue
    	 *  
    	 *  
    	 *  1)Null value not allowed
    	 */
    	PriorityQueue<String> queue = new PriorityQueue<String>();
    	queue.add("AAAA");
    	//queue.add(null);  -- not allowed
    	queue.add("zzzz");
    	System.out.println(queue);
    	
    	System.out.println(queue.peek());
    	System.err.println(queue.poll());   // remove the data
    	System.out.println(queue);
    	
    	
    }
 		
 		

	
	public static void main(String[] args) {
		testArrayList();
		testHashMap();
		testSet();
		testQueue();
	}
	
	
	
	

}
