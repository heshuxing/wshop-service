package com.hsx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * GoodsController
 * 商品管理相关
 * @author shuxing.he
 * @date 2022/3/1
 */
@Controller
public class GoodsController {

    @RequestMapping("goods/goods")
    public String toGoods(){
        return "goods/goods";
    }

    @RequestMapping("goods/warehouse")
    public String toWareHouse(){
        return "goods/warehouse";
    }

}
