package com.rubin.demo.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 *
 * Created by rubin on 16-11-28.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FeignClient(value = "demo-web3")
public @interface Web3ApiRemote {

    /**
     * Alias for {@link FeignClient#fallback}.
     */
    @AliasFor(annotation = FeignClient.class)
    Class<?> fallback() default void.class;

}
