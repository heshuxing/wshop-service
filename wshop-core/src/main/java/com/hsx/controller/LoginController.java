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
 * LoginController
 * 登录相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String toLogin(Model model){
        return "login";
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
            return "main";
        }catch (UnknownAccountException e){
            model.addAttribute("msg", "用户名错误");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

}
