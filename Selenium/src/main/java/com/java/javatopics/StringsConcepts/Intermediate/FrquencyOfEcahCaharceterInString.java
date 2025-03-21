package com.java.javatopics.StringsConcepts.Intermediate;

import com.github.dockerjava.core.exec.InspectNetworkCmdExec;
import com.sun.jna.StringArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrquencyOfEcahCaharceterInString {
    public static void main(String[] args) {
//
//        int array[] = {10,20,30,40,10};
//
//        int[] freq= new int[array.length];
//        for( int i=0;i< array.length;i++){
//            freq[i]=1;
//            for( int j=i+1; j< array.length;j++){
//
//                if( array[i]== array[j]){
//                   freq[i]=freq[i]+1;
//                   array[j]= -1;
//                }
//
//            }
//
//
//        }
//
//        for(int i=0; i<freq.length;i++)
//        {
//            if(array[i]!=-1)
//            System.out.println( array[i] + "-"+ freq[i]);
//        }
//


        int arrayData[] = {10, 10, 20, 30, 10, 40, 50, 60, 10, 70};

        int count;

        for (int i = 0; i < arrayData.length; i++) {

            count = 1;

            for (int j = i + 1; j < arrayData.length; j++) {

                if (arrayData[i] == arrayData[j]) {
                    arrayData[j] = -1;
                    count = count + 1;
                }
            }


            if (arrayData[i] != -1) {
                System.out.println(arrayData[i] + " Appear -->" + count);
            }


        }


        String string = "this is java";
        String removedString = string.replaceAll("\\s+", "");
        System.out.println(removedString);


        HashMap<Character, Integer> hashMapCharacter = new HashMap<>();


        char[] charArray = removedString.toCharArray();

        int countValue;
        for (int i = 0; i < charArray.length; i++) {
            countValue = 1;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    charArray[j] = '1';
                    countValue = countValue + 1;
                }
            }

            if (charArray[i] != '1') {
                System.out.println(charArray[i] + " Appear-->" + countValue);
                hashMapCharacter.put(charArray[i], countValue);
            }

        }


        List<Character> list = new ArrayList<>();
        System.out.println(hashMapCharacter);

        int mostReperatedWord = 0;
        for (Map.Entry<Character, Integer> entry : hashMapCharacter.entrySet()) {

            if (mostReperatedWord < entry.getValue()) {
                mostReperatedWord = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            } else if (mostReperatedWord == entry.getValue()) {
                list.add(entry.getKey());
            }

        }


        System.out.println(list);


        HashMap<String, Integer> hashMapstring = new HashMap<>();

        String string1 = "this is java java is most important java";

        String[] stringArray = string1.split(" ");

        int countValueForString;
        for (int i = 0; i < stringArray.length; i++) {
            countValueForString = 1;
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i].equals(stringArray[j])) {
                    countValueForString++;
                    stringArray[j] = "-1";
                }
            }

            if (!stringArray[i].equals("-1")) {
                System.out.println(stringArray[i] + "<-->" + countValueForString);
                hashMapstring.put(stringArray[i], countValueForString);
            }

        }


        List<String> word = new ArrayList<>();

        int mostReperateStringWord = 0;


        for (Map.Entry<String, Integer> entrysetstring : hashMapstring.entrySet()) {

            if (entrysetstring.getValue() == mostReperateStringWord) {
                word.add(entrysetstring.getKey());
            } else if (mostReperateStringWord < entrysetstring.getValue()) {
                mostReperateStringWord = entrysetstring.getValue();
                word.clear();
                word.add(entrysetstring.getKey());
            }


        }

        System.out.println(word);


        String data = "this is java and java is";
        String[] dataValue = data.split(" ");
        HashMap<String, Integer> dataHashmap = new HashMap<>();

        for (String value : dataValue) {
            dataHashmap.put(value, dataHashmap.getOrDefault(value, 0) + 1);

        }

        System.out.println(dataHashmap);

        int maxString = 0;
        List<String> listValue = new ArrayList<>();
        for (Map.Entry<String, Integer> testing : dataHashmap.entrySet()) {

            if (maxString == testing.getValue()) {
                listValue.add(testing.getKey());
            } else if (maxString < testing.getValue()) {
                maxString = testing.getValue();
                listValue.clear();
                listValue.add(testing.getKey());
            }

        }

        System.out.println(listValue);

    }
}
