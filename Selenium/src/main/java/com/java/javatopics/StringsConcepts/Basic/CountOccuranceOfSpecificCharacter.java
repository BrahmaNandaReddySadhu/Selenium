package com.java.javatopics.StringsConcepts.Basic;

public class CountOccuranceOfSpecificCharacter {
    public static void main(String[] args) {

        //1. charAt()
        String string1 = "sadhu brahma";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i <= string1.length() - 1; i++) {
            if (string1.charAt(i) == ch) {
                count = count + 1;
            }
        }
        System.out.println("character " + ch + " is presen" + count + "times");

        //2. toCharArray()
        String string2 = "sadhu";
        char ch2 = 'u';
        char strings2Array[] = string2.toCharArray();
        int count2 = 0;
        for (int i = 0; i < strings2Array.length; i++) {
            if (ch2 == strings2Array[i]) {
                count2 = count2 + 1;
            }
        }
        System.out.println(count2);


        // 3. using replaceAll () - replaceing with empty character find the length

        String string3 = "sadhu";
        char ch3 = 'c';
        int stringLength = string3.length();
        int lengthAfterReplacingWithCharacter = string3.replaceAll(String.valueOf(ch3), "").length();
        int finalLenth = stringLength - lengthAfterReplacingWithCharacter;
        System.out.println(finalLenth);

        //4 streams()

        char ch4= 'B';
        String string4="sadhuBrahma";
        long countValue=string4.chars().filter(value -> value==ch4).count();
        System.out.println(countValue);

    }
}
