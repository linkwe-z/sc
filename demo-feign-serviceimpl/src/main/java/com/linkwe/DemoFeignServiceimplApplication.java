package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供方
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoFeignServiceimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignServiceimplApplication.class, args);
	}
}
