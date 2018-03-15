package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务消费方
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DemoFeignApiconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignApiconsumerApplication.class, args);
	}
}
