package com.java.javatopics.ArraysTopics.basics;

public class FindTheIndexofIdentifiedElement {
    public static void main(String[] args) {

        int array[]={10,20,30,40,50,60,10};
        int search =10;

        for( int i=0; i< array.length ;i++){
            if( search == array[i]){
                System.out.println("Element is Identified at the index ->"+ i);
            }
        }

    }
}
