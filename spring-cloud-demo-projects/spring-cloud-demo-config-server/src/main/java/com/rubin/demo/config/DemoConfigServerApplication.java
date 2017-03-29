package com.rubin.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 *
 * Created by rubin on 17-2-9.
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class DemoConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigServerApplication.class, args);
    }

}
