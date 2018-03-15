package com.statics;

/**
 * Created by lwz on 2018/3/8.
 * desc:
 */
public class StaticTest {
    public static void main(String[] args) {
        new Abc();
    }

}

class Abc{
    public static Bcd i = new Bcd();
    static{
        int b = 2;
        System.out.println("=====静态块======");
    }


    Abc(){
        System.out.println("======构造方法=========");
    }

    public static void c(){
        System.out.println("==========静态方法===========");
    }
}


class Bcd{
    Bcd(){
        System.out.println("======静态成员变量========");
    }
}
