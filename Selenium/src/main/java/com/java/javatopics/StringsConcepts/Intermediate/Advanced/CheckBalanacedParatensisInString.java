package com.java.javatopics.StringsConcepts.Intermediate.Advanced;

import java.util.Stack;

public class CheckBalanacedParatensisInString {
    public static void main(String[] args) {
        String string = "((a+b))*(c-d)";

        boolean isBalanced=true;
        Stack<Character> stack = new Stack<>();
        for(char ch : string.toCharArray()){
            if( ch== '('){
                System.out.println("pushing "+ch);
                stack.push(ch);
                System.out.println(stack);
            }else if(ch == ')'){
                if(stack.empty()){
                    isBalanced=false;
                }
                System.out.println("poping character "+ch);
                stack.pop();
                System.out.println(stack);
            }
        }

        System.out.println(isBalanced && stack.empty());
        System.out.println(stack);
    }
}
