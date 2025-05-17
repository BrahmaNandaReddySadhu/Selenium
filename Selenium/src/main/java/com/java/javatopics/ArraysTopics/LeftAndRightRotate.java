package com.java.javatopics.ArraysTopics;

import java.util.Arrays;

public class LeftAndRightRotate {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5};
        int n=3;

        for( int i=0 ; i< n ;i++){

            int j;

            int first = array[0];

            for( j=0 ; j< array.length-1;j++){
                array[j]=array[j+1];
            }
            array[j]=first;

        }

        for( int va:array){
            System.out.print(va);
        }



        for( int i =0 ; i< n; i++)
        {
            int j, last;
            last = array[array.length-1];

           for( j = array.length-1;j>0; j--){
               array[j]= array[j-1];
           }

           array[0]=last;


        }



    }
}
