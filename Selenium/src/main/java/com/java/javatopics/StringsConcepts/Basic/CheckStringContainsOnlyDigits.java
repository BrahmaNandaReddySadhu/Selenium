package com.java.javatopics.StringsConcepts.Basic;

import org.apache.commons.lang3.StringUtils;

public class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {
        String str = "1234";

        //1.matche

        boolean matchesStatus = str.matches("[0-9]+");
        System.out.println(matchesStatus);

        //2 charArray()
        boolean status = true;
        char[] charArray = str.toCharArray();
        for (char value : charArray) {
            if (!Character.isDigit(value)) {
                status = false;
            }
        }
        if (status) {
            System.out.println("digits");
        } else {
            System.out.println("not digits");
        }

        //3 stream

        boolean streamStatus= str.chars().allMatch(Character::isDigit);
        System.out.println(streamStatus);


        //4 stringutils
        boolean stringUtilsStatus=StringUtils.isNumeric(str);
        System.out.println(stringUtilsStatus);


    }
}
