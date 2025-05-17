package com.java.javatopics.ArraysTopics.basics;

public class LargestElement {
    public static void main(String[] args) {

        int array[] ={10,20,30,40,50};

        int largest = array[0];

        for(int i=0; i< array.length;i++){

            if( largest < array[i]){
                largest= array[i];
            }

        }
        System.out.println("largest element is => "+largest);


        int lar= array[0];
        for(int num : array){
            if(lar < num){
                lar=num;
            }
        }

        System.out.println("lar=> "+lar);
    }
}
