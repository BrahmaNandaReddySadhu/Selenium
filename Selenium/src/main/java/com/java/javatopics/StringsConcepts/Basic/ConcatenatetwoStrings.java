package com.java.javatopics.StringsConcepts.Basic;

public class ConcatenatetwoStrings {
    public static void main(String[] args) {


        String string1="sadhu";
        String string2="brahma";

        //1, conact()
        String concateNatedString=string1.concat(string2);
        System.out.println(concateNatedString);

        //2. + operator
        String value2= string2+string1;
        System.out.println(value2);

        //3 StringBuffer
        StringBuffer stringBuffer= new StringBuffer(string1);
        stringBuffer.append(string2);
        System.out.println(stringBuffer);

        //4 StringBuilder
        StringBuilder stringBuilder = new StringBuilder(string1);
        stringBuilder.append(string2);
        System.out.println(stringBuilder);

        //5. join()
        String finalValue = String.join(",",string1,string2);
        System.out.println(finalValue);

    }
}
