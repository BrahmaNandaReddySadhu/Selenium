package com.java.javatopics.StringsConcepts.Basic;

public class Polindrome {
    public static void main(String[] args) {


        // reverse the string and check with originla string , if both are match then it is polindrome
        String name = "MAM";
        String temp = name;

        String reverse = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        if (reverse.equals(temp)) {
            System.out.println("polindrome");
        } else {
            System.out.println("Not polindrome");
        }

        // using stringBuilder

        String text = "madam";
        String reverseString = new StringBuilder(text).reverse().toString();
        System.out.println(reverseString.equals(text) ? "polindrome" : "Not polindrome");

    }
}
