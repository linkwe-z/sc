package com.te;

import org.junit.Test;

/**
 * Created by lwz on 2018/3/6.
 * desc:
 */
public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        //Class testDemo = Class.forName("com.te.TestDemo");
        //System.out.println("###"+testDemo);
    }

    @Test
    public void test1(){
        int a = 10;
        Integer b = 10;
        String c = new String("A");
        String d =new String("A");
        System.out.println("###"+(a==b));
        System.out.println("###"+c.hashCode()+" ###"+d.hashCode());
    }

    @Test
    public void test2(){
        TestDemo t1 = new TestDemo();
        TestDemo t2 = new TestDemo();
        TestDemo t3 = new TestDemo();

        System.out.println("t1.equals(t2)="+t1.equals(t2));  //false 自定义类用equals和==结果是一样的，
        System.out.println("t1==t2"+(t1==t2));  //false 因为自定义的类是继承于object，而object中的equals就是用==来实现的

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("s1.equals(s2)="+s1.equals(s2)); //true 比较的是值
        System.out.println("s1==s2="+(s1==s2));  //false 比较的是地址
        //因为String等常用类已经重写了object中的equals方法，让equals来比较实际内容。

    }
}
