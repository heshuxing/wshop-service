package com.hsx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloContoller
 *
 * @author shuxing.he
 * @date 2021/11/27
 */
@RestController
public class HelloContoller {
    @RequestMapping("/help")
    public String hello(){
        return "hello";
    }
}
