package com.linkwe.thread;

/**
 * Created by lwz on 2018/3/12.
 * desc:难点1：如何保证线程按ABCD这样的顺序启动 难点2：如何保证线程一直按ABCD这样的顺序执行
 */
public class SequenceThread extends Thread {
    private Sequence sequence;
    private int order;
    private SequenceThread next;
    public boolean started = false;

    public SequenceThread(String name, int or, Sequence se) {
        this.setName(name);
        this.sequence = se;
        this.order = or;
    }

    public void setNext(SequenceThread next) {
        this.next = next;
    }

    public void run() {
        int num = sequence.getNext();  //num+1
        this.started = true;
        while (num < 101) {
            if (num % 4 == order) {
                System.out.println(getName() + ":" + num);
                if (this.next.started) {
                    synchronized (this.next) {
                        this.next.notify();
                    }
                } else {
                    this.next.start();
                }
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num = sequence.getNext();
            }
            //
        }
        System.exit(0);
    }
}
