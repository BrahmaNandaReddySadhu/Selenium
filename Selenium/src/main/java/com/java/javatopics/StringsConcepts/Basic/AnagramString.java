package com.java.javatopics.StringsConcepts.Basic;

import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
    public static void main(String[] args) {
        String string1="listen";
        String string2="silent";

        char []array1=string2.toCharArray();
        char[]array2=string1.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array2,array2)){
            System.out.println("anagram");
        }else {
            System.out.println("Not anagram");
        }

    }
}
