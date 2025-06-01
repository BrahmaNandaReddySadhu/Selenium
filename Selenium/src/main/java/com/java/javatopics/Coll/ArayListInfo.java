package com.java.javatopics.Coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArayListInfo {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(a1);

        a1.add(7);
        System.out.println(a1);

    }
}
