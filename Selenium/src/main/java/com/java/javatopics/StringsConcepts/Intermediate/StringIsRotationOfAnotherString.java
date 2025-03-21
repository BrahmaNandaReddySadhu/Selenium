package com.java.javatopics.StringsConcepts.Intermediate;

public class StringIsRotationOfAnotherString {
    public static void main(String[] args) {

        String str1="abcd";

        String str2="cdab";

        if(str2.length()!= str1.length()){
            System.out.println("Not Rotation");
        }else {
            str1= str1+str1;


            if(str1.indexOf(str2)!=-1){
                System.out.println("rotation");
            }else {
                System.out.println("Not rotaion");
            }
        }


    }
}
