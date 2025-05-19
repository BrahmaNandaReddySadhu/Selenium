package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromListUsingSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.add("c++");

        System.out.println(list);  // [java, python, java, c++]

        Set<String> set = new HashSet<>(list);
        System.out.println(set);  // [python, c++, java]

    }
}
