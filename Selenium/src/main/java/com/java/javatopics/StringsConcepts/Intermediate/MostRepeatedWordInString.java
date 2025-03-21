package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.*;

public class MostRepeatedWordInString {
    public static void main(String[] args) {
        String string ="this is java program and java is good is java";
        String[] values = string.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<>();
        for( String data:values){
            hashMap.put(data, hashMap.getOrDefault(data,0)+1);
        }
        List<String> word = new ArrayList<>();

        int most=0;
        for( Map.Entry<String , Integer> entry : hashMap.entrySet()){

            if( most < entry.getValue()){
                most= entry.getValue();
                word.clear();
                word.add(entry.getKey());
            }else if ( most==entry.getValue()){
                word.add(entry.getKey())
;            }


        }






        System.out.println(hashMap);
        System.out.println(word);
    }
}
