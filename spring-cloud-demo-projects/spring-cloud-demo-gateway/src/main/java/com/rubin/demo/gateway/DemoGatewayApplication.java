package com.rubin.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 使用@EnableZuulProxy注解激活zuul，同时跟进入该注解可以看到该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置。
 */
@EnableZuulProxy
@SpringBootApplication
public class DemoGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGatewayApplication.class, args);
	}

}
