package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 * 后台首页相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class IndexController {

    @RequestMapping("home/index")
    public String toIndex(){
        return "home/index";
    }

}
