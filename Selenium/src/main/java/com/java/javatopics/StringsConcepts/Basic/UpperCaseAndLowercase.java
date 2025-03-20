package com.java.javatopics.StringsConcepts.Basic;

public class UpperCaseAndLowercase {
    public static void main(String[] args) {

       String string ="sadhu";

       String upperCaseString = string.toUpperCase();
        System.out.println(upperCaseString);

        String lowerCaseString=string.toLowerCase();
        System.out.println(lowerCaseString);


        // characeters converting to upper and lower cases
        String string1= "Sadhu Brahma Nanda Reddy";

        StringBuffer stringBuffer = new StringBuffer(string1);
        for(int i=0;i<= string1.length()-1;i++){
            if( Character.isLowerCase(string1.charAt(i))){
                stringBuffer.setCharAt(i,Character.toUpperCase(string1.charAt(i)));
            }else{
                stringBuffer.setCharAt(i,Character.toLowerCase(string1.charAt(i)));
            }
        }
        System.out.println(stringBuffer);

    }
}
