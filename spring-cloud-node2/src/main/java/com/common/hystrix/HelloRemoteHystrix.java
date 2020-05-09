package com.common.hystrix;

import com.remote.RemoteHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/9 16:58
 * @Description:
 */
@Component
public class HelloRemoteHystrix implements RemoteHelloService {

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello" + name + ", this messge send node2 failed ";
    }
}
