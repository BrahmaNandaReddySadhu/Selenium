package com.java.javatopics.ArraysTopics;

public class LargestElement {
    public static void main(String[] args) {

        int array[] ={10,20,30,40,50};
        int max = array[0];
        int small = array[0];

        for( int i=0; i< array.length ;i++){
            if ( max <array[i]){
                max = array[i];
            }
            if( small >array[0]){
                small=array[0];
            }
        }

        System.out.println("max "+max);
        System.out.println("small "+small);

    }
}
