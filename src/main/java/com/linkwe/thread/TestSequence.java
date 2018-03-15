package com.linkwe.thread;

/**
 * https://zhidao.baidu.com/question/224876339.html
 * Created by lwz on 2018/3/12.
 * desc:
 */
public class TestSequence {
    public static void main(String[] args) {
        Sequence sequ=new Sequence();
        SequenceThread a=new SequenceThread("A",1,sequ);
        SequenceThread b=new SequenceThread("B",2,sequ);
        SequenceThread c=new SequenceThread("C",3,sequ);
        SequenceThread d=new SequenceThread("D",0,sequ);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(a);
        a.start();
    }
}
