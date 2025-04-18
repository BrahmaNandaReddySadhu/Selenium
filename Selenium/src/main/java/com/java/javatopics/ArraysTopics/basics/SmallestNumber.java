package com.java.javatopics.ArraysTopics.basics;

public class SmallestNumber {
    public static void main(String[] args) {

        int array[]={10,20,30,40,50};

        int smallest = array[0];
        for( int num:array)
        {
            if(smallest >num){
                System.out.println(smallest);
            }
        }
        System.out.println("Smallest Number => "+ smallest);


        int small=array[0];
        for(int i=0;i<array.length;i++){
            if(small >array[i]){
                small=array[i];
            }
        }
        System.out.println("small => "+small);

    }
}
