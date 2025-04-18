package com.java.javatopics.ArraysTopics.basics;

import java.util.Arrays;

public class CopyElementFromOnearrayToAnother {
    public static void main(String[] args) {

        int array[] = {10,20,30,40,50};

        int copyArray[] = new int[array.length];

        for(int i=0 ; i< array.length ;i++){
            copyArray[i]= array[i];
        }

        for(int number: copyArray){
            System.out.print(number + " ");
        }

    }
}
