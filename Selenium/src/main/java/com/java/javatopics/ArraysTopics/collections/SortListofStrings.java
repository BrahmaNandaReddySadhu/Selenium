package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListofStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("manago","apple","icecream"));

        System.out.println(list);   // [manago, apple, icecream]

        Collections.sort(list);

        System.out.println(list); //[apple, icecream, manago]

    }
}
