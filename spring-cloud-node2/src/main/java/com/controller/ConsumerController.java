package com.controller;

import com.remote.RemoteHelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/9 16:19
 * @Description:
 */
@RestController
public class ConsumerController {


    @Resource
    RemoteHelloService remoteHelloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return remoteHelloService.hello2(name);
    }
}
