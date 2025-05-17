package com.java.javatopics.StringsConcepts.Intermediate;

public class LongestPolindromString {
    public static void main(String[] args) {

        String string ="abaf";
        String longest="";

        for( int i=0; i< string.length(); i++){

            for( int j =i+1; j<= string.length();j++){
                String sub= string.substring(i,j);
                System.out.println(sub);

                if( isPolindrome(sub) && sub.length() >longest.length() ){
                    longest=sub;
                }
            }

            System.out.println(longest);
        }


    }
    public  static boolean isPolindrome(String string){
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
