package com.java.javatopics.ArraysTopics.basics;

public class SumOfElements {
    public static void main(String[] args) {
        int array[] ={10,20,30,40,50};
        int sum=0;
        for(int data: array){
            sum=sum+data;
        }
        System.out.println("sum is=> "+sum);
    }
}
