package com.java.javatopics.StringsConcepts.Basic;

import org.apache.commons.lang3.StringUtils;

public class CheckStringContainsOnlyAlphabets {
    public static void main(String[] args) {
        String str="AB";

        //1 matches
        boolean value=str.matches("[A-Za-z]+");
        System.out.println(value);

        //2. character.isLetter()
        char[] charArray=str.toCharArray();
        boolean status=true;
        for( char data:charArray){
            if( !Character.isLetter(data)){
               status=false;
            }
        }
        if(status){
            System.out.println("Only Alphabets");
        }else {
            System.out.println("other than alphabets");
        }

        //3 streams()
        boolean alphabets =str.chars().allMatch(Character::isLetter);
        System.out.println(alphabets);

        //4. apcheUtils
        boolean alpha=StringUtils.isAlpha(str);
        System.out.println(alpha);
    }
}
