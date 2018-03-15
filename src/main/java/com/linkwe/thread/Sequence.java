package com.linkwe.thread;

/**
 * Created by lwz on 2018/3/12.
 * desc:
 */
public class Sequence {
    private int num=1;
    public  int getNext(){
        return num++;
    }
}
