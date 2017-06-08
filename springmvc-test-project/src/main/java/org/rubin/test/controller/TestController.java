package org.rubin.test.controller;

import org.rubin.test.verapi.ApiVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rubin
 * @date 2017年06月06日
 */
@RestController
@RequestMapping("api/{version}")
public class TestController {

    @GetMapping("test")
    public HashMap<String, Object> getTestText() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("error", "401");
        return result;
    }

    @ApiVersion(2)
    @RequestMapping(value = "test")
    public Map<String, Object> test_2() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", "rubin2");
        result.put("data", "data2");
        return result;
    }

    @ApiVersion(1)
    @RequestMapping(value = "test")
    public  Map<String, Object> test_1() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", "rubin1");
        result.put("data", "data1");
        return result;
    }

    @ApiVersion(5)
    @RequestMapping(value = "test")
    public Map<String, Object> test_5() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", "rubin5");
        result.put("data", "data5");
        return result;
    }

}
