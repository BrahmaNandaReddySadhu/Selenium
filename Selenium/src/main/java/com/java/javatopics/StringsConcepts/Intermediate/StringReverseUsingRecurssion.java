package com.java.javatopics.StringsConcepts.Intermediate;

public class StringReverseUsingRecurssion {
    public static void main(String[] args) {

        String string ="helloo";
        String revre= stringReverse(string);
        System.out.println(revre);

    }

    public static String stringReverse(String s){
        if( s.isEmpty()){
            return s;
        }
        return stringReverse(s.substring(1)) + s.charAt(0);
    }
}
