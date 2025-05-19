package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("manago");
        list.add("banana");
        
        System.out.print(list);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        for(String string : list){
            System.out.println(string);
        }
        
        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()){
            String data=iterator.next();
            System.out.println("data = " + data);
        }

        list.forEach(System.out::println);
    }
}
