package com.vector;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lwz on 2018/3/7.
 * desc:
 */
public class VectorApp {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement(new Integer(1));
        vector.add("one");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println("###"+enumeration.nextElement());
        }

        vector.insertElementAt(new String("tow"),1);
        for (int i = 0; i< vector.size(); i++){
            System.out.println(i+":##"+vector.get(i));
        }
        Thread h = new Thread();

    }

    @Test
    public void test1(){
        String str1 = "hello";
        String str2 = "he" + new String("llo");  //llo是新开辟了个内存块
        System.out.println(str1 == str2 );  //结果false == 比较的是两个对象的地址


        String s1=new String("abc");
        String s2="abc";
        System.out.println("-------------");
        System.out.println(s1==s2);  //结果false ，因为s1在堆内存中，s2在常量池中
        System.out.println(s1.equals(s2));

    }
}
