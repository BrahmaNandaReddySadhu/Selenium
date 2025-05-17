package com.java.javatopics.ArraysTopics.basics;

public class CountOddAndEvenNumbers {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10,11};
        int evenCount =0;
        int oddcount =0;
        for(int i=0; i< array.length ; i++){

            if( array[i] % 2 ==0 ){
                evenCount= evenCount +1;
            }else {
                oddcount =oddcount +1;
            }
        }

        System.out.println("Even Count ==> "+evenCount);
        System.out.println("Odd count ==>"+ oddcount);
    }
}
