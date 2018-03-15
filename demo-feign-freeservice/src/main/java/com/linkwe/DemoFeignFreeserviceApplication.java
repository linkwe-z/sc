package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供方：https://github.com/yejingtao/forblog/tree/master/demo-feign-freeservice
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoFeignFreeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignFreeserviceApplication.class, args);
	}
}
