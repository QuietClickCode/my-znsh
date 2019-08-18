package com.zjj.controller;

import com.zjj.model.ResultData;
import com.zjj.model.User;
import com.zjj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: znsh
 * @description: 用户控制器
 * @author: zjj
 * @create: 2019-6-4 21:15:58
 **/
@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String tologin() {

        return "login";
    }


    /**
     * @Description: login
     * @Param: []
     * @return: java.lang.String
     * @Author: zjj
     * @Date: 2019/7/6
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResultData login(String username, String password) {

        User user = userService.login(username, password);
        System.out.println(user);
        ResultData resultData = new ResultData();
        resultData.setStatus("200");
        resultData.setMsg("登录成功");
        return resultData;
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public ResultData userLogin(String username, String password) {
        // System.out.println(username + "-" + password);
        User user = userService.login(username, password);
        System.out.println(user);
        ResultData resultData = new ResultData();
        if (user != null) {
            resultData.setStatus("200");
            resultData.setMsg("登录成功");
        } else {
            resultData.setStatus("500");
            resultData.setMsg("用户名或密码错误");
        }
        return resultData;
    }
}
