package com.java.javatopics.Coll;

import java.util.*;

public class LinkedListinfo {
    public static void main(String[] args) {

        List<Integer> listData = new LinkedList();
        Queue<Integer> queue = new LinkedList();
        Deque<Integer> deque = new LinkedList<>();
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Sadhu");
        ll.add("Brahma");
        System.out.println(ll);
        ll.add(0,"Reddy");
        ArrayList<String> al = new ArrayList<>(Arrays.asList("AAA"));
        ll.addAll(al);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.contains("bbb"));

        ll.set(1,null);
        System.out.println(ll);



    }
}
