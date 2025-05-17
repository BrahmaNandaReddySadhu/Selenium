package com.java.javatopics.StringsConcepts.Intermediate;

public class StringIsValidNimberOrNot {
    public static void main(String[] args) {
        // 1 using pasre

        String string="123a";
        try {
            Integer i = Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.println("Unable to parse the string , this is invalid format");
        }


        // regex:
        String str1="1233";
        String str2="-127.77";

        boolean status=str2.matches("-?\\d+(\\.\\d+)?");
        System.out.println(status);

        boolean statusValue=str1.matches("\\d+");
        System.out.println(statusValue);

    }
}
