package com.java.javatopics.StringsConcepts.Intermediate;

public class ReverseWordByWord {
    public static void main(String[] args) {


        String data = "this is";
        String dataArray[] = data.split(" ");


        for (String word:dataArray){
            String reverse="";
            for( int i=0 ; i< word.length();i++){
                char charAt = word.charAt(i);
                reverse=charAt+reverse;
            }
            System.out.print(reverse+ " ");






        }

    }

}
