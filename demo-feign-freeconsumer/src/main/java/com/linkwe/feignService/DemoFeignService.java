package com.linkwe.feignService;

import com.linkwe.entity.UserDemo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lwz on 2018/2/28.
 * desc: @FeignClient注解定义了该接口是一个Feign客户端，name指定了注册到Eureka上的服务名，fallback是服务降级后的接口实现类。
 */
@FeignClient(name = "demo-feign-freeservice", fallback = DemoFeignFallback.class)
public interface DemoFeignService {
    @RequestMapping(value="/feign-service/serviceGet",method= RequestMethod.GET)
    String helloService(@RequestParam("name") String name);

    @RequestMapping(value="/feign-service/serviceHead", method=RequestMethod.HEAD)
    String helloService(@RequestHeader("name") String name,
                        @RequestHeader("password") String password);

    @RequestMapping(value="/feign-service/servicePost", method=RequestMethod.POST)
    String helloService(@RequestBody UserDemo userDemo);

}
