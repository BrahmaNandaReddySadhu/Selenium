package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListusingComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("mango", 100));
        list.add(new Student("apple", 2));
        list.add(new Student("banana", 1));

        System.out.println(list); //[mango -- 100, apple -- 2, banana -- 1]
        Collections.sort(list);
        System.out.println(list);  // [banana -- 1, apple -- 2, mango -- 100]
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*
  System.out.println(list); //[mango -- 100, apple -- 2, banana -- 1]
        Collections.sort(list);
        System.out.println(list);  // [banana -- 1, apple -- 2, mango -- 100]
 */

//    public int compareTo(Student  others){
//        return this.age - others.age;
//    }

    /*
    [mango -- 100, apple -- 2, banana -- 1]
[apple -- 2, banana -- 1, mango -- 100]
     */
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " -- " + age;
    }
}
