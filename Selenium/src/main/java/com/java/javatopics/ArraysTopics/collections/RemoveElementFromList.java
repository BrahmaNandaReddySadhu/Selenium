package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementFromList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("apple","mango","banana"));
        System.out.println(list); //[apple, mango, banana]
        list.remove(1);
        System.out.println(list); //[apple, banana]
        list.remove("apple");
        System.out.println(list); // [banana]


    }
}
