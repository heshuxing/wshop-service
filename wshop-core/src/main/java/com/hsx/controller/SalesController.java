package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SalesController
 * 销售管理相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class SalesController {

    @RequestMapping("sales/sales")
    public String toSales(){
        return "sales/sales";
    }

}
