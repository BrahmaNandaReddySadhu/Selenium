package com.java.javatopics.ArraysTopics.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementFromArrays {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,10,20,304};

        Set<Integer> set = new LinkedHashSet<>();

        for(int number : array){
            set.add(number);
        }

        for(int values:set){
            System.out.println(values);
        }

    }
}
