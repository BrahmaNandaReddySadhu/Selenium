package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        String string = "aaaabbccdee";

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            if (i==0 || string.charAt(i)!= string.charAt(i-1)) {
                buffer.append(string.charAt(i));
            }
        }
        System.out.println(buffer);
    }
}
