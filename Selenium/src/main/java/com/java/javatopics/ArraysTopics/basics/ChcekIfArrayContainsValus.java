package com.java.javatopics.ArraysTopics.basics;

public class ChcekIfArrayContainsValus {
    public static void main(String[] args) {
        int array[] = {10,20,30,405,60};
        int element = 405;

        boolean idDisplayed= false;
        for(int num : array){
            if( num == element){
                idDisplayed = true;
                break;
            }
        }

        System.out.println("Element is displayed ==>"+ idDisplayed);

    }
}
