package com.java.javatopics.Coll;

import java.util.Stack;

public class StackInfo {
    public static void main(String[] args) {

        /*

        LIFO - Last in first out - stack
        FIFO - first in fisrt out - queue


       stack class implement list and extends vector

         */


        Stack<String> stack = new Stack<>();

        stack.add(("Red"));
        stack.add(("Green"));
        stack.add(("White"));
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push("Test");
        System.out.println(stack);
        System.out.println(stack.search("Red"));
        System.out.println(stack.indexOf("Red"));






    }
}
