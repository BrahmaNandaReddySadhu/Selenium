package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class RemoveDuplicateCharactersfromstrinf {
    public static void main(String[] args) {

        String string = "Programming";
        StringBuffer buffer = new StringBuffer();

        for (int i=0; i<string.length();i++){
            char ch= string.charAt(i);

            if(buffer.indexOf(String.valueOf(ch))==-1){
                buffer.append(ch);
            }
        }
        System.out.println(buffer);
    }

}
