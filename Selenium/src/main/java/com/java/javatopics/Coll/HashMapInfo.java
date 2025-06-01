package com.java.javatopics.Coll;

import java.util.*;

public class HashMapInfo {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap();

        map.put("1","sadhu");
        map.put("2","Brahma");
        map.put("3","Reddy");

        System.out.println(map);


        Set<String> keyset=map.keySet();
        System.out.println(keyset);


        Collection<Object>  valuesData=map.values();
        System.out.println(valuesData);

        for(String data: map.keySet()){
            System.out.println(data+ " "+ map.get(data));
        }

        System.out.println(map);

        map.remove("1");
        System.out.println(map);


        System.out.println(map.containsKey("3"));
        System.out.println(map.containsValue("Brahma"));

        System.out.println(map);
        map.put("2","NANDA");
        System.out.println(map);

        map.putIfAbsent("4","YYY");
        System.out.println(map);

        System.out.println(map.size());
        map.clear();
        System.out.println(map);


    }
}
