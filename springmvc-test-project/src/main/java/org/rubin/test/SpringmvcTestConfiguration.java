package org.rubin.test;

import org.rubin.test.verapi.CustomRequestMappingHandlerMapping;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.boot.autoconfigure.web.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author rubin
 * @date 2017年06月07日
 */
@Configuration
public class SpringmvcTestConfiguration extends WebMvcAutoConfiguration.EnableWebMvcConfiguration {

    public SpringmvcTestConfiguration(ObjectProvider<WebMvcProperties> mvcPropertiesProvider, ObjectProvider<WebMvcRegistrations> mvcRegistrationsProvider, ListableBeanFactory beanFactory) {
        super(mvcPropertiesProvider, mvcRegistrationsProvider, beanFactory);
    }

    public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new CustomRequestMappingHandlerMapping();
    }

}
