package com.statics;

/**
 * http://blog.csdn.net/tt_zhang/article/details/7614180
 * Created by lwz on 2018/3/8.
 * desc: 静态代码块加载顺序
 * 当static语句执行完之后,再执行main方法.
 * 非静态代码块是在类new一个实例的时候执行，而且是每次new对象实例都会执行。
 * 执行顺序:类加载之后,按从上到下执行被static修饰的语句, 如果有语句new了自身的对象,将从上到下执行构造代码块,构造器,创建完对象后,接着执行下面的static语句,
 * 当static语句执行完之后,再执行main方法.
 */
public class OrderTest {
    public static void main(String[] args) {
        System.out.println("main-start");
        new OrderTest();
        System.out.println("main-end");
    }

    public static int   method() {
        System.out.println("=====method========");
        return 0;
    }
    {
        System.out.println("__构造块2start__");
    }

    static {
        System.out.println("==静态块1start==");
    }
    public static OrderTest t1 = new OrderTest();
    static {
        System.out.println("==静态块2start==");
    }
    public static OrderTest t2  = new OrderTest();

    public static int x =  method();
    static {
        System.out.println("==静态块3start==");
    }

    public OrderTest() {
        System.out.println("=======构造器-start========");
    }
    {
        System.out.println("__构造块1start__");
    }
}
