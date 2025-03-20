package com.java.javatopics.StringsConcepts.Basic;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        String string = "sadhu";

        //1. using for loop
        String str1 = "";
        for (int i = 0; i <= string.length() - 1; i++) {
            char ch1 = string.charAt(i);
            str1 = ch1 + str1;
        }
        System.out.println(str1);

        //2. for loop , but starting for end
        String string2 = "Brahma";
        String str2 = "";
        for (int j = string2.length() - 1; j >= 0; j--) {
            char ch2 = string2.charAt(j);
            str2 = str2 + ch2;
        }
        System.out.println(str2);


        // 3. now using stringbuffer
        String string3 = "sadhu brahma";
        StringBuffer buffer = new StringBuffer(string3);
        String reverseedString = buffer.reverse().toString();
        System.out.println(reverseedString);


        //4 . swapping using for loop
        String string4 = "sadhu";
        char[] string4Chararray = string4.toCharArray();
        for (int k = 0; k <= (string4.length() - 1) / 2; k++) {
            char temp = string4Chararray[k];
            string4Chararray[k] = string4Chararray[string4.length() - 1 - k];
            string4Chararray[string4.length() - k - 1] = temp;
        }
        for (char ch : string4Chararray) {
            System.out.print(ch);
        }
        System.out.println();


        // 5. using list
        String string5 = "sadhu";
        List<Character> list = new ArrayList<>();
        for (char charaValue : string5.toCharArray()) {
            list.add(charaValue);
        }
        Collections.reverse(list);
        StringBuffer buffer5 = new StringBuffer();
        for (char chValue : list) {
            buffer5.append(chValue);
        }
        System.out.println(buffer5);


        // 6. using stack

        String string6 = "Brahma";
        Stack<Character> stack = new Stack<>();
        for (char ch : string6.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        //StringBuffer stringBuffer= new StringBuffer();
        while (!stack.isEmpty()) {
            //stringBuffer.append(stack.pop());
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder);


    }
}
