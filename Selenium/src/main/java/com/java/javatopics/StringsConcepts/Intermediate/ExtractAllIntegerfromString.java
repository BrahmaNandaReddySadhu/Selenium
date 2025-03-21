package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllIntegerfromString {
    public static void main(String[] args) {
        String string ="orderId is : 123423 is test 1662";
        String value = String.join(",",string.replaceAll("\\D",""));
      //  System.out.println(value);


        // another way

        char[] charArray = string.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();

        StringBuffer num = new StringBuffer();

        for( int i=0; i< charArray.length;i++) {

            if (Character.isDigit(charArray[i])) {
                num.append(charArray[i]);
            } else {
                if (num.length() > 1) {
                    list.add(Integer.parseInt(num.toString()));
                    num.setLength(0);
                }
            }
        }

            if(num.length()>0){
                list.add(Integer.parseInt(num.toString()));
            }

        System.out.println(num);
        System.out.println(list);



        // 2.regular expressions

        String string3 ="orderId is : 123423 is test 1662";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher  =pattern.matcher(string3);


        List<Integer> data = new ArrayList<>();
        while(matcher.find()){
            data.add(Integer.valueOf(matcher.group()));

        }

        System.out.println(data);



        }

}
