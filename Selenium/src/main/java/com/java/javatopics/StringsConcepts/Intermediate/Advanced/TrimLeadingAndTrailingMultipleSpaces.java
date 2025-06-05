package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class TrimLeadingAndTrailingMultipleSpaces {
    public static void main(String[] args) {
        String string=" this is  the hava   ";
        String output=string.replace("\\s+","");
        System.out.println(output);
    }
}
