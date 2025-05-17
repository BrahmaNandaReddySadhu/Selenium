package com.java.javatopics.StringsConcepts.Intermediate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LexogarphicallySmallest {
    public static void main(String[] args) {

        //  Lexicographical order is the order in which words are arranged in a dictionary.

        String string = "bdgf";
        char charArray[] = string.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));





    }
}
