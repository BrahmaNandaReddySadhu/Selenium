package com.java.javatopics.StringsConcepts.Basic;

public class CompareThetwoStrings {
    public static void main(String[] args) {

        String string1="sadhu";
        String string2="sadhu";

        // equals
        System.out.println(string1.equals(string2));

        // equalsIgnoreCae
        System.out.println(string1.equalsIgnoreCase(string2));

        //compareTo
        System.out.println(string1.compareTo(string2));

        //compateToIgnoreCase
        System.out.println(string1.compareToIgnoreCase(string2));

        //==
        System.out.println(string1==string2);

    }
}
