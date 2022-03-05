package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SecurityController
 * 安全管理相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class SecurityController {

    @RequestMapping("security/authority")
    public String toAuthority(){
        return "security/authority";
    }

    @RequestMapping("security/information")
    public String toInformation(){
        return "security/information";
    }
}
