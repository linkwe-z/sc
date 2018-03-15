package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务调用方(消费者)
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DemoFeignFreeconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignFreeconsumerApplication.class, args);
	}
}
