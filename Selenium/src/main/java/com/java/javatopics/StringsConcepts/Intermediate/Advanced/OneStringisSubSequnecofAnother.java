package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class OneStringisSubSequnecofAnother {
    public static void main(String[] args) {
        String string1="abc";
        String string2="ahbgdc";
        int i=0,j=0;
        while( i<string1.length() && j<string2.length()){
            if(string1.charAt(i) == string2.charAt(j)){
                i++;
            }
            j++;

        }
        System.out.println(i== string1.length());
    }
}
