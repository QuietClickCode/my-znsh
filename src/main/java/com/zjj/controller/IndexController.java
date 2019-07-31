package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @program: znsh
 * @description: 用户控制器
 * @author: zjj
 * @create: 2019-6-4 21:15:58
 **/
@Controller
public class IndexController {


    @RequestMapping("/index")
    public String login(Map<String, Object> map) {
        map.put("name", "智能生活商城");
        return "index";
    }


    @RequestMapping("/mindex")
    /*public String mlogin() {
        return "mindex_";
    }*/
    public String mlogin() {
        return "index";
    }

}
