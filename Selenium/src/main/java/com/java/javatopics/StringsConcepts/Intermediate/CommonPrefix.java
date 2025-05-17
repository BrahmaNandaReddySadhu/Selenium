package com.java.javatopics.StringsConcepts.Intermediate;

public class CommonPrefix {
    public static void main(String[] args) {
        String array[] = {"apple","aptly","applt"};

        String prefix= array[0];

        for( int i=1; i<array.length;i++){

            while( array[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }

        }


        System.out.println(prefix);
    }
}
