package com.java.javatopics.StringsConcepts.Intermediate;

public class SwapWords {
    public static void main(String[] args) {

        String string="hello world java";
        String [] array= string.split(" ");

        String temp =array[0];
        array[0]=array[array.length-1];

        array[array.length-1]= temp;


        for( String value:array)
        {
            System.out.println(value);
        }

    }
}
