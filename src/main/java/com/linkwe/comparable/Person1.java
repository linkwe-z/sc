package com.linkwe.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lwz on 2018/3/12.
 * desc:
 */
public class Person1 implements Comparable<Person1> {
    private int age;
    private String name;

    public Person1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person1 o) {
        return this.age-o.age;
    }

    @Override
    public String toString()
    {
        return name+":"+age;
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1("zzh",18);
        Person1 person2 = new Person1("jj",17);
        Person1 person3 = new Person1("qq",19);

        List<Person1> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
