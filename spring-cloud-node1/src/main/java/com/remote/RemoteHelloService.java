package com.remote;

import com.common.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/9 17:53
 * @Description:
 */
@FeignClient(name= "spring-cloud-producer" ,fallback = HelloRemoteHystrix.class)
public interface RemoteHelloService {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
