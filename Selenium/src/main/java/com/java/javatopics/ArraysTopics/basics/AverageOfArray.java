package com.java.javatopics.ArraysTopics.basics;

public class AverageOfArray {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }

        double avarage = sum/array.length;
        System.out.println("Average => "+ avarage);
    }
}
