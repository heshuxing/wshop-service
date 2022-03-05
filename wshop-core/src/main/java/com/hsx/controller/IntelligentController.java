package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IntelligentController
 * 智能管理相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class IntelligentController {

    @RequestMapping("intelligent/decision")
    public String toDecision(){
        return "intelligent/decision";
    }

    @RequestMapping("intelligent/preventionControl")
    public String toPreventionControl(){
        return "intelligent/preventionControl";
    }

}
