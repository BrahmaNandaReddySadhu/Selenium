package com.java.javatopics.ArraysTopics.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListtoSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","apple","manago");
        Set<String> set= new HashSet<>(list);
        System.out.println(set);  // [apple, manago, Banana]
    }
}
