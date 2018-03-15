package com.linkwe.controller;

import com.linkwe.entity.UserDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created by lwz on 2018/2/28.
 * desc:
 */
@RestController
@RequestMapping(value = "/feign-service")
public class HelloServiceContorller {
    private Logger logger = LoggerFactory.getLogger(HelloServiceContorller.class);

    private void sleep(String methodName){
        int sleepMinTime = new Random().nextInt(3000);
        logger.info("helloService "+methodName+" sleepMinTime: "+sleepMinTime);

        try {
            Thread.sleep(sleepMinTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/serviceGet", method = RequestMethod.GET)
    private String helloService(@RequestParam String name){
        sleep("get");
        return "HelloServiceImpl name :"+name;
    }

    @RequestMapping(value="/serviceHead", method=RequestMethod.HEAD)
    public String helloService(@RequestHeader String name,
                               @RequestHeader String password) {
        sleep("header");
        return "helloServiceHead name :"+name +" password:"+password;
    }

    @RequestMapping(value="/servicePost", method=RequestMethod.POST)
    public String helloService(@RequestBody UserDemo userDemo) {
        sleep("post");
        return userDemo.toString();
    }
}
