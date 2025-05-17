package com.java.javatopics.StringsConcepts.Intermediate;

public class CapitalizeStartingofeachword {
    public static void main(String[] args) {
        String string="this is data";

        StringBuffer buffer=new StringBuffer();

        for( String data:string.split(" ")){
            buffer.append(Character.toUpperCase(data.charAt(0))).append(data.substring(1)).append(" ");
        }
        System.out.println(buffer);


        }

}
