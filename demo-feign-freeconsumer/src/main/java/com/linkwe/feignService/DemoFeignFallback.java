package com.linkwe.feignService;

import com.linkwe.entity.UserDemo;
import org.springframework.stereotype.Component;

/**
 * Created by lwz on 2018/2/28.
 * desc: 服务降级后的接口实现类
 */
@Component
public class DemoFeignFallback implements DemoFeignService{
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
