package com.ccz.xingtian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Created By zcc
 * Date: 2019/7/9
 * Time: 20:09
 */
@RestController
@RequestMapping("/test")
public class ConsulProducerController {

    /**
     * 服务接口
     * @param name
     * @return
     */
    @GetMapping("/name")
    public String getName(@RequestParam("name")String name) {
        return "My name is: " + name;
    }
}
