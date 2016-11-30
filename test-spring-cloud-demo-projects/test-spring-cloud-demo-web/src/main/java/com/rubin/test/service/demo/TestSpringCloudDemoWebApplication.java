package com.rubin.test.service.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestSpringCloudDemoWebApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TestSpringCloudDemoWebApplication.class).web(true).run(args);
	}

}
