package org.rubin.test;

import org.rubin.test.verapi.CustomRequestMappingHandlerMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *
 * @author rubin
 * @date 2017年04月19日
 */
@SpringBootApplication
public class SpringmvcTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcTestApplication.class, args);
    }

}
