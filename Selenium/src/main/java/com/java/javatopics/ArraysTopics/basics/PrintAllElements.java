package com.java.javatopics.ArraysTopics.basics;

public class PrintAllElements {
    public static void main(String[] args) {
        int array[]= {10,20,30,40};
        for( int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println();

        for(int number:array){
            System.out.print(number +" ");
        }
    }
}
