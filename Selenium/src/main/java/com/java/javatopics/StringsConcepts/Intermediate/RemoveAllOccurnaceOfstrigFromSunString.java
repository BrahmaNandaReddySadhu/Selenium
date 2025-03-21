package com.java.javatopics.StringsConcepts.Intermediate;

public class RemoveAllOccurnaceOfstrigFromSunString {
    public static void main(String[] args) {

        String data ="automation testing is fun, testing make software better";
        String remove="testing";

        String finalDatadata= data.replace(remove,"").replaceAll("\\s+"," ");
        System.out.println(finalDatadata);


    }
}

//automation  is fun,  make software better
//automation is fun, make software better