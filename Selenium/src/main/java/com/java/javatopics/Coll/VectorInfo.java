package com.java.javatopics.Coll;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorInfo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Sadhu");
        vector.add(0, "Brahma");
        vector.add(0, "Reddy");
        vector.add(null);


        //  System.out.println(vector);

        Vector<String> v2 = new Vector<>();
        v2.add("aaaa");
        v2.add("bbbb");

        // System.out.println(vector);
        for (int i = 0; i < v2.size(); i++) {
            vector.add(v2.get(i));
        }
        //  System.out.println(vector);
        vector.addAll(v2);
        //  System.out.println(vector);
        vector.addAll(v2);
        // System.out.println(vector);

        vector.remove(v2);
        System.out.println(vector);
        vector.removeAll(v2);
        System.out.println(vector);

        vector.clear();
        System.out.println(vector);

        System.out.println(vector.contains(v2));

        vector.add("sadhu");
        vector.add(0, "brahma");
        System.out.println(vector);
        vector.set(0, "Reddy");
        System.out.println(vector);

        System.out.println(vector.get(1));

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());


        Object[] array = vector.toArray();
        System.out.println(Arrays.toString(array));


        Vector v3 = new Vector(200);
        System.out.println(v3.size());
        System.out.println(v3.capacity());


        List list = vector.subList(0, 1);

        System.out.println(list);

    }
}
