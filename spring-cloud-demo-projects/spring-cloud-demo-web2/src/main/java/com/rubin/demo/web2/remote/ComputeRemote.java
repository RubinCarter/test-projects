package com.rubin.demo.web2.remote;

import com.rubin.demo.api.ComputeApi;
import com.rubin.demo.api.Web2ApiRemote;
import org.springframework.stereotype.Component;

/**
 *
 * Created by rubin on 16-11-26.
 */
@Web2ApiRemote(fallback = ComputeRemote.ComputeRemoteHystrix.class)
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
