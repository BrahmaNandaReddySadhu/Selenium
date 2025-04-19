package com.java.javatopics.StringsConcepts.Intermediate;

public class StringDecompose {
    public static void main(String[] args) {
        String string = "a2b2c3";

        StringBuffer compresed = new StringBuffer();


        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);
            int count = 1;

            if (i + 1 < string.length() && Character.isDigit(string.charAt(i + 1))) {

                count = string.charAt(i + 1) - '0';
                i++;

            }

            compresed.append(String.valueOf(ch).repeat(count));


        }

        System.out.println(compresed);


        System.out.println("*****************");

        String data = "a4b6c10";


        StringBuffer bufferData = new StringBuffer();
        for (int i = 0; i < data.length(); i++) {

            char ch = data.charAt(i);

            int count = 1;

            StringBuffer counter = new StringBuffer();

            while (i + 1 < data.length() && Character.isDigit(data.charAt(i + 1))) {

                counter.append(data.charAt(++i));

            }

            int finalCounte = Integer.parseInt(counter.toString());
            bufferData.append(String.valueOf(ch).repeat(finalCounte));

        }

        System.out.println(bufferData);

    }


}
