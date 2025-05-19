package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAccessData {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("selenium");
        arraylist.add("java");
        arraylist.add("python");
        arraylist.add("c++");
        arraylist.add("C#");

        System.out.println(arraylist);  // [selenium, java, python, c++, C#]

        // add at specific element

        arraylist.add(2, "AI");
        System.out.println(arraylist); // [selenium, java, AI, python, c++, C#]

        // get the element at specific index
        System.out.println("element at the index 1 is " + arraylist.get(1)); // java

        // replace the element at specific index
        arraylist.set(2, "sadhu");
        System.out.println(arraylist); // [selenium, java, sadhu, python, c++, C#]


        // remove (index)
        arraylist.remove(0);
        System.out.println(arraylist); // [java, sadhu, python, c++, C#]

        // remove (object) - remove first occurance of the objcet

        arraylist.remove("sadhu");
        System.out.println(arraylist);  // [java, python, c++, C#]

        System.out.println(arraylist.size()); // 4

        System.out.println(arraylist.isEmpty());  // false

        arraylist.add("kiwi");
        arraylist.add("grapes");
        arraylist.add("kiwi");
        System.out.println(arraylist);  // [java, python, c++, C#, kiwi, grapes, kiwi]
        System.out.println(arraylist.indexOf("kiwi"));  // 4
        System.out.println(arraylist.lastIndexOf("kiwi"));  // 6

        // clear array list
        arraylist.clear();
        System.out.println(arraylist);  // []

        arraylist.add("selenium");
        // convert loist to array

        Object[] namesArray = arraylist.toArray();

        System.out.println(namesArray);


    }
}
