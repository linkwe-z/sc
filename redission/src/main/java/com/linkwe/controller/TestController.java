package com.linkwe.controller;

import com.linkwe.utils.RedissLockUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by lwz on 2018/1/26.
 * desc:
 */
@RestController
public class TestController {
    private final String _lock  = "_lock";

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String getCurrentDate(){
        return sdf.format(new Date());
    }

    @RequestMapping(value = "/testlock",method= RequestMethod.GET)
    public String testlock(String name) {

        new Thread(new Runnable() {

            @Override
            public void run() {

                RedissLockUtil.lock(_lock, TimeUnit.MINUTES, 10);

                System.out.println(getCurrentDate()+" "+name+" begin...");
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(getCurrentDate()+" "+name+" "+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getCurrentDate()+" "+name+" end...");

                RedissLockUtil.unlock(_lock);
            }
        }).start();

        return "testlock";
    }
}
