package com.java.javatopics.ArraysTopics;

public class DuplicateElementArray {
    public static void main(String[] args) {

        int array[] ={10,20,30,10,10,20};

        int count;
        for( int i=0;i< array.length;i++){
            count=1;
            for(int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    array[j]=-1;
                    count++;
                }
            }
            if( count>1 && array[i]!=-1 ){
                System.out.println(array[i]);
            }

        }

    }
}
