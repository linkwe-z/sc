package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * https://www.cnblogs.com/shamo89/p/8036451.html
 * Created by lwz on 2018/1/26.
 * desc:
 */
@SpringBootApplication
//@EnableEurekaServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
