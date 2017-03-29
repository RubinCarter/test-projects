package com.rubin.demo.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DemoWeb2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoWeb2Application.class, args);
	}

}
