package org.rubin.test;

import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "test/{version}")
    public Map<String, Object> test_1(@PathVariable String version) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("user", "rubin");
        result.put("data", "data");
        result.put("version", version);
        return result;
    }

}
