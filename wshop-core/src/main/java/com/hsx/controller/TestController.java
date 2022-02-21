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

    @RequestMapping("/")
    public String toIndex(Model model){
        model.addAttribute("msg","hello,shiro");
        return "login";
    }

    @RequestMapping("/user/add")
    public String add(){
        return "user/add";
    }

    @RequestMapping("/user/updata")
    public String updata(){
        return "user/updata";
    }

    @RequestMapping("/login")
    public String login(String username, String password, Model model){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            //执行登录的方法
            subject.login(token);
            return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("msg", "用户名错误");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("/noauth")
    public String noauth(Model model){
        model.addAttribute("msg","未授权");
        return "noauth";
    }
}
