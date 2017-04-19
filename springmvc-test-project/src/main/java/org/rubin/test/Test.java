package org.rubin.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rubin
 * @date 2017年04月19日
 */
@RestController
public class Test {

    @RequestMapping(value = "test1")
    public Map<String, Object> test_1() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", "rubin");
        result.put("data", "data");
        return result;
    }

}
