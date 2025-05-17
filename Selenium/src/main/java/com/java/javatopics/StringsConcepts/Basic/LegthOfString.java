package com.java.javatopics.StringsConcepts.Basic;

public class LegthOfString {
    public static void main(String[] args) {

        String string = "this is sadhu";


        //1.    split("")
        int count = 0;
        String[] array1 = string.split("");
        for (String array : array1) {
            System.out.println(array);
            count = count + 1;
        }
        System.out.println(count);

        //2. toChatArray()
        int count2 = 0;
        String string2 = "sadhu";
        char[] array2 = string2.toCharArray();
        for (char value2 : array2) {
            count2++;
        }
        System.out.println(count2);


        // 3. using chatAt()

        String string3 = "sadhu";
        int count3 = 0;
        try {
            while (true) {
                string3.charAt(count3);
                count3++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        System.out.println(count3);


        //4. lastIndexOf()
        String string4="sadhu";
        int length=string4.lastIndexOf("");
        System.out.println(length);

    }

}
