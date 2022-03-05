package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * StaffController
 * 员工管理相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class StaffController {

    @RequestMapping("/staff/staff")
    public String toStaff(){
        return "staff/staff";
    }

    @RequestMapping("staff/payroll")
    public String toPayroll(){
        return "staff/payroll";
    }

}
