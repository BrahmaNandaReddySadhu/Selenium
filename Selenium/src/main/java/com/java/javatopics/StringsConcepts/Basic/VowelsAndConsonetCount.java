package com.java.javatopics.StringsConcepts.Basic;

public class VowelsAndConsonetCount {
    public static void main(String[] args) {

        String string= "sadhuBrahmanandaReddy";
        string=string.toLowerCase();
        System.out.println(string);

        int vowelsCount=0, consonentCount =0;
        for( int i=0; i<= string.length()-1;i++){
            if( string.charAt(i)>='a' && string.charAt(i)<='z'){
                if( string.charAt(i)=='a' || string.charAt(i)=='e'||string.charAt(i)=='i' || string.charAt(i)=='o'||string.charAt(i)=='u'){
                    vowelsCount=vowelsCount+1;
                }
                consonentCount=consonentCount+1;
            }

        }
        System.out.println("Vowels Count ->"+vowelsCount);
        System.out.print("Consonet Count ->"+consonentCount);

    }
}
