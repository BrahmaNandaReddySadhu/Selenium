package com.java.javatopics.StringsConcepts.Basic;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        String string = "swiss";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : string.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }


    }

}
