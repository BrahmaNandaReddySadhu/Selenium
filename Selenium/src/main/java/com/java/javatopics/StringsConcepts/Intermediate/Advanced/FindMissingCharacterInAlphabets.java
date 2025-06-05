package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

public class FindMissingCharacterInAlphabets {
    public static void main(String[] args) {

        String input = "thequickbrownfxjmlazydg";
        boolean[] present = new boolean[26];

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                present[ch - 'a'] = true;
            }
        }

        for(int i=0; i<present.length;i++){
            if(!present[i]){
            System.out.println(present[i]+ " "+i);
            System.out.println( (char)(i+'a'));
        }}


    }
}
