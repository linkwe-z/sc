package com.linkwe.api;

import com.linkwe.entity.UserDemo;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lwz on 2018/2/28.
 * desc:
 */
public interface HelloService {
    @RequestMapping(value="/feign-service/serviceGet",method= RequestMethod.GET)
    String helloService(@RequestParam("name") String name);

    @RequestMapping(value="/feign-service/serviceHead", method=RequestMethod.HEAD)
    String helloService(@RequestHeader("name") String name,
                        @RequestHeader("password") String password);

    @RequestMapping(value="/feign-service/servicePost", method=RequestMethod.POST)
    String helloService(@RequestBody UserDemo userDemo);

}
