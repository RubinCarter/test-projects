package com.rubin.test.service.demo.facade;

import com.rubin.test.service.demo.remote.ComputeRemote;
import com.rubin.test.service.demo.service.MinusService;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * Created by rubin on 16-11-26.
 */
@Service
public class Test2Facade {

    @Setter
    @Resource
    private ComputeRemote computeRemote;

    @Setter
    @Resource
    private MinusService minusService;

    public Integer test(){
        Integer add = computeRemote.add(10, 20);
        Integer minus = minusService.minus(add);
        return minus;
    }


}
