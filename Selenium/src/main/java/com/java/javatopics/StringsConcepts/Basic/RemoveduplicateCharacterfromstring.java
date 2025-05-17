package com.java.javatopics.StringsConcepts.Basic;

import java.util.Arrays;

public class RemoveduplicateCharacterfromstring {
    public static void main(String[] args) {

        String string = "this iswor d";
        String[] array= string.split("");
        System.out.println(Arrays.asList(array));

        int count =0;
        for( int i=0 ;i< array.length;i++){
            count=1;
            for( int j=i+1;j<array.length;j++){

                if(  array[i].equals( array[j]) && !array[j].trim().isEmpty()){
                    count = count+1;
                    array[j]="Z";
                }

            }

            if( count >1 && !array[i].equals("Z")){
                System.out.println(array[i]+ " "+ count);
            }

        }

    }
}
