package com.rubin.demo.web1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoWeb1Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoWeb1Application.class).web(true).run(args);
	}

}