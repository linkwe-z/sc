package com.linkwe.controller;

import com.linkwe.entity.UserDemo;
import com.linkwe.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwz on 2018/2/28.
 * desc:
 */
@RestController
public class DemoFeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String demoServiceTest() {
        StringBuffer sb = new StringBuffer();
        sb.append(feignService.helloService("yuanyuan"));
        sb.append("\n");
        sb.append(feignService.helloService("yjt","xixihaha"));
        sb.append("\n");
        sb.append(feignService.helloService(new UserDemo("yejingtao","123456")));
        return sb.toString();

    }
}
