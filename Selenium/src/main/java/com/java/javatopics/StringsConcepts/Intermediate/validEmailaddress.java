package com.java.javatopics.StringsConcepts.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validEmailaddress {
    public static void main(String[] args) {

        String email = "brahmananda.sadhu@pinelabs.com";
        String Testdata = "brahmananda@pinelabs.com";

        String regex = "^[A-Za-z0-9]+(\\.[A-Za-z0-9]+)?@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if( matcher.find()){
            System.out.println("email is valid");
        }else {
            System.out.println("email is not valid");
        }

    }
}
