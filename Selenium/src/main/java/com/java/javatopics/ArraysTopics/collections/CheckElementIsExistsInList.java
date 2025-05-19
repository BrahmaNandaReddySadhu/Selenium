package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckElementIsExistsInList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("sadhu","Brahma","Nanda"));
        System.out.println(list);  // [sadhu, Brahma, Nanda]

        System.out.println( list.contains("Brahma"));  // true
        System.out.println(list.contains("apple"));  // false
    }
}
