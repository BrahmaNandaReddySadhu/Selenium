package com.java.javatopics.StringsConcepts.Basic;

import java.util.Arrays;

public class ReverseEachwordstring {
    public static void main(String[] args) {

        String string="this is data";

        // split
        String[] words=string.split(" ");
        String[] reverseWords = new String[words.length];

       // System.out.println(Arrays.asList(words));

        for( int i=0 ; i< words.length ; i++){
            String wordData = words[i];
            System.out.println(wordData);
            String rev="";
            for( int k=0 ; k< wordData.length();k++){
                rev = wordData.charAt(k)+rev;
            }
            reverseWords[i]=rev;
        }

        for( String va:reverseWords){
            System.out.println(va);
        }




    }
}

