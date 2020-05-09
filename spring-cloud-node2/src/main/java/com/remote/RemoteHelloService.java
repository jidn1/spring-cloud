package com.remote;

import com.common.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/9 16:19
 * @Description:
 */
@FeignClient(name= "spring-cloud-producer2" ,fallback = HelloRemoteHystrix.class)
public interface RemoteHelloService {
    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}
