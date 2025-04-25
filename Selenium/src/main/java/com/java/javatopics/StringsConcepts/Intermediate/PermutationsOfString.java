package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    public static void main(String[] args) {
        String string = "ABC";
        char[] charArray=string.toCharArray();
        List<String> result = new ArrayList<>();
        generatePermutations(charArray,0,result);

        for( String data :result){
            System.out.println(data);
        }

    }
    public static void  generatePermutations(char[] charData, int index, List<String> result){
        if( index == charData.length){
            result.add(new String(charData));
        }

        for( int i=index; i<charData.length;i++){
            swap(charData,index,i);
            generatePermutations(charData,index+1,result);
            swap(charData,index,i);
        }



    }
    public static void swap(char[] charData, int i,  int j){
        char temp = charData[i];
        charData[i]=charData[j];
        charData[j]=temp;
    }
}
