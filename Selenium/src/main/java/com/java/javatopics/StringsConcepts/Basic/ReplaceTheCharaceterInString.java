package com.java.javatopics.StringsConcepts.Basic;

public class ReplaceTheCharaceterInString {
    public static void main(String[] args) {

        char ch = 'G';
        String string = "this is tava";

        //1. replace

        String newString = string.replace('t', ch);
        System.out.println(newString); /// Ghis is Gava

        //2 firstOccurance
        String string2= string.replaceFirst("t","G");
        System.out.println(string2); // Ghis is tava

        //3.stringBuilder

        StringBuilder builder=new StringBuilder(string);
        builder.setCharAt(0,'Z');
        System.out.println(builder); //Zhis is tava

        //charArray()

        char array[] = string.toCharArray();
        array[0]='C';
        String s=new String(array);
        System.out.println(s); //Chis is tava



    }
}
