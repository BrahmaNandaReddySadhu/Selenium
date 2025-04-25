package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.HashSet;

public class LongestOfLongestNonRepeatingSubstring {
    public static void main(String[] args) {

        String string = "aabcdef";

        HashSet<Character> set = new HashSet<>();

        int max = 0, i = 0, j = 0;

        while( i< string.length()){

            if(!set.contains(string.charAt(i))){
                set.add(string.charAt(i));
                i=i+1;
                max= Math.max(max,set.size());
            }else{
                set.remove(string.charAt(j));
                j=j+1;
            }


        }
        System.out.println(max);
        System.out.println(set);

    }
}
