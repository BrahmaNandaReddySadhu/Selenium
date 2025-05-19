package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoLists {
    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.addAll(Arrays.asList("Apple","Mango","Oranges"));
        list2.addAll(Arrays.asList("pineapple","grapes"));

        System.out.println(list1);  // [Apple, Mango, Oranges]
        System.out.println(list2); // [pineapple, grapes]

        list1.addAll(list2);
        System.out.println(list1);  // [Apple, Mango, Oranges, pineapple, grapes]
    }
}
