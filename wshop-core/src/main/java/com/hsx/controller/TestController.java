package com.hsx.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController
 *
 * @author shuxing.he
 * @date 2022/2/12
 */
@Controller
public class TestController {

    @RequestMapping("/user/add")
    public String add(){
        return "user/add";
    }

    @RequestMapping("/user/updata")
    public String updata(){
        return "user/updata";
    }

    @RequestMapping("/noauth")
    public String noauth(Model model){
        model.addAttribute("msg","未授权");
        return "noauth";
    }
}
