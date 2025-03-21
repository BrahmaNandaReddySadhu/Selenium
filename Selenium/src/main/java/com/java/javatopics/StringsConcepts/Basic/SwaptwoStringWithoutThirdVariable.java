package com.java.javatopics.StringsConcepts.Basic;

public class SwaptwoStringWithoutThirdVariable {
    public static void main(String[] args) {

        String string1="sadhu";
        String string2="brahma";

        System.out.println("before swapping -"+ string1 +""+string2);
        string1=string1+string2;

        string2 = string1.substring(0,string1.length()-string2.length());
        string1=string1.substring(string2.length());

        System.out.println("after swapping -"+ string1 +""+string2);
    }
}
