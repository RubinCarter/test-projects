package com.rubin.demo.web2.controller;

import com.rubin.demo.web2.facade.Test2Facade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * Created by rubin on 16-9-22.
 */
@Slf4j
@RestController
public class Test2Controller {

    @Resource
    private Test2Facade test2Facade;

    @RequestMapping("/test")
    public Integer test() {
        return test2Facade.test();
    }

}
