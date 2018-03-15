package com.linkwe.service;

import com.linkwe.entity.UserDemo;
import org.springframework.stereotype.Component;

/**
 * Created by lwz on 2018/2/28.
 * desc:
 */
@Component
public class FeignServiceFallback implements FeignService{
    @Override
    public String helloService(String name) {
        return "get error";
    }

    @Override
    public String helloService(String name,String password) {
        return "head error";
    }

    @Override
    public String helloService(UserDemo userDemo) {
        return "post error";
    }
}
