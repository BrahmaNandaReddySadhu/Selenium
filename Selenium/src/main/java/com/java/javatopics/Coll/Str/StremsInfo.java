package com.java.javatopics.Coll.Str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremsInfo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,304,3,41));

        List<Integer> even=list.stream().filter( i ->i%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
