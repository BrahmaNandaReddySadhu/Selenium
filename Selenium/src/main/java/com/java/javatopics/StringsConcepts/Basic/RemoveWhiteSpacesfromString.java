package com.java.javatopics.StringsConcepts.Basic;

public class RemoveWhiteSpacesfromString {
    public static void main(String[] args) {

        String value = "java is programming  language";
        String resultValue = value.replace(" ", "");
        System.out.println(resultValue);

        String valueData = value.replaceAll("\\s", "");
        System.out.println(valueData);


    }
}
