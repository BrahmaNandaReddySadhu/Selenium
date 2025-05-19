package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToListAndViceversa {
    public static void main(String[] args) {

        String fruits[] = {"apple","banama","mango"};

        // array to arraylist
        List<String> list= new ArrayList<>(Arrays.asList(fruits));
        System.out.println(list);  // [apple, banama, mango]



        String[] stringArray=list.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));  // [apple, banama, mango]


        String[] value=list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(value));  // [apple, banama, mango]
    }
}
