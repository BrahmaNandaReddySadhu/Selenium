package com.java.javatopics.ArraysTopics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUisngComparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 45000));
        list.add(new Employee("Jane", 55000));
        list.add(new Employee("Jack", 35000));

        System.out.println(list);  // [John:45000, Jane:55000, Jack:35000]

        Collections.sort(list,new EmpAgeComparator());
        System.out.println(list);  // [Jack:35000, John:45000, Jane:55000]

        Collections.sort(list, new EmpNameComparator());
        System.out.println(list);  // [Jack:35000, Jane:55000, John:45000]
    }
}

class Employee
{

    String name;
    int age;

    Employee(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString() {
        return name + ":" + age;
    }

}

class EmpAgeComparator implements Comparator<Employee>{
    public int compare(Employee e1 , Employee e2){
        return e1.age-e2.age;
    }
}

class EmpNameComparator implements  Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
