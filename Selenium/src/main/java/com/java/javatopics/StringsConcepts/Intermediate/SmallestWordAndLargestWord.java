package com.java.javatopics.StringsConcepts.Intermediate;

public class SmallestWordAndLargestWord {

    public static void main(String[] args) {

        String string ="this is data";

        String[] array = string.split(" ");

        String small=array[0];
        String large = array[0];
        for( String data:array){

            if(data.length() < small.length()){
                small=data;
            }if (data.length() >large.length()){
                large=data;
            }

        }

        System.out.println(small);
        System.out.println(large);



    }


}
