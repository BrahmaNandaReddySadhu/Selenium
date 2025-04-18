package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.Arrays;

public class SortCharactersOfString {
    public static void main(String[] args) {

        String string ="this";

        char[] charArray = string.toCharArray();

        for( int i=0; i<charArray.length-1;i++){

            for( int j=0; j< charArray.length-1-i;j++){

                if( charArray[j]>charArray[j+1]){
                    char temp= charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }

            }

        }

        String stringva ="this";

        char[] charArrayva = stringva.toCharArray();

        for( int i=0; i<charArray.length-1;i++){

            for( int j=0; j< charArray.length-1-i;j++){

                if( charArray[j]>charArray[j+1]){
                    char temp= charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }

            }

        }




        int array[]={10,20,1,2,4,5};

        for( int i=0;i< array.length-1;i++){

            for( int j=0;j<array.length-1-i;j++){

                if( array[j]<array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }



        }

        for(int vale: array){
            System.out.print(vale);
        }



        String string1 = new String(charArray);
        System.out.println(string1);


        String string2 ="this is";


        string2.chars().map(value-> (char)value).sorted().forEach(value -> System.out.print((char)value));


    }


    }

