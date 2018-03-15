package com.linkwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring could web程序主入口
 */
@Configuration  //配置控制
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = {"com.linkwe"}) ////组件扫描
@EnableDiscoveryClient
public class SpringcloudappApplication {
	/**
	 * 顺序启动服务注册发现spingCloudEurekaServer、服务配置中心spingCloudConfServer、以及一个app应用springCloudApp测试与验证
	 	1.访问http://localhost:9999/eureka/  app是否已经注册上来
	 	2.访问 http://localhost:8080/swagger-ui.html 是否正常访问，如果正常访问说明争取读取到config配置中心的swagger.ui.enable配置项
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudappApplication.class, args);
	}
}
