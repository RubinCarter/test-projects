package com.rubin.test.service.demo.controller;

import com.rubin.test.remote.api.ComputeApi;
import com.rubin.test.service.demo.service.ComputeService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * Created by rubin on 16-9-22.
 */
@Slf4j
@RestController
public class ComputeController implements ComputeApi {

    @Setter
    @Resource
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer result = computeService.add(a, b);
        return result;
    }

}
