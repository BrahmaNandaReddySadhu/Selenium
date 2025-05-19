package com.java.javatopics.ArraysTopics.collections;

import java.util.*;

public class ConvertSetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("apple","manago","banana"));
        System.out.println(set);

        List<String> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
