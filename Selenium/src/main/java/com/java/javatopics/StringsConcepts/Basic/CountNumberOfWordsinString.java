package com.java.javatopics.StringsConcepts.Basic;

import java.util.Arrays;

public class CountNumberOfWordsinString {
    public static void main(String[] args) {
        String string = "this is the data";

        //split()
        String[] str = string.split(" ");
        System.out.println(str.length);

        // streams

        long countValues = Arrays.stream(string.trim().split("\\s"))
                .filter( value ->!value.isEmpty())
                .count();
        System.out.println(countValues);

    }
}
