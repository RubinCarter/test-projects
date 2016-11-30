package com.rubin.test.service.demo.remote;

import com.rubin.test.remote.api.ComputeApi;
import com.rubin.test.remote.api.WebRemote;
import org.springframework.stereotype.Component;

/**
 *
 * Created by rubin on 16-11-26.
 */
@WebRemote(fallback = ComputeRemote.ComputeRemoteHystrix.class)
public interface ComputeRemote extends ComputeApi {

    @Component
    class ComputeRemoteHystrix implements ComputeRemote {
        @Override
        public Integer add(Integer a, Integer b) {
            System.out.println("ddddddd");
            return -9999;
        }
    }

}
