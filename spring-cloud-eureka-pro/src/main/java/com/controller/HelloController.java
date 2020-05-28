package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright © 北京互融时代软件有限公司
 * @Author: Jidn
 * @Date: 2020/5/9 15:28
 * @Description:
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
//        logger.info("request two name is "+name);
//        try{
//            Thread.sleep(1000000);
//        }catch ( Exception e){
//            logger.error(" hello two error",e);
//        }
        return "hello "+name+"，this second fuck is send first messge";
    }
}
