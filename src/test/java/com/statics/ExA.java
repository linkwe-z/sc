package com.statics;

/**
 * Created by lwz on 2018/3/8.
 * desc: 执行顺序：父类静态代码块、子类静态代码块、父类非静态代码块、父类构造方法、子类非静态代码块，子类构造方法
 */
public class ExA {
    static {
        System.out.println("父类--静态代码块");
    }

    public ExA() {
        System.out.println("父类--构造函数");
    }

    {
        System.out.println("父类--非静态代码块");
    }

    public static void main(String[] args) {
        new ExB();
    }
}

class ExB extends ExA {
    static {
        System.out.println("子类--静态代码块");
    }
    {
        System.out.println("子类--非静态代码块");
    }

    public ExB() {
        System.out.println("子类--构造函数");
    }
}
