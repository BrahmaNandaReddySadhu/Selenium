package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class RemoveAllDigits {
    public static void main(String[] args) {
        String string="abc123edf123";
        String result=string.replaceAll("\\d+","");
        System.out.println(result);  // abcedf
    }
}
