package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwz on 2018/2/25.
 * desc:
 */
@SpringBootApplication
@RestController
public class INginxApplication {
    public static void main(String[] args) {
        SpringApplication.run(INginxApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hi(String name){
        return "Hello " +name;
    }
}
