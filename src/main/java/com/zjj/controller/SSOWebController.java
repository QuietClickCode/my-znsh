package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SSO-web")
public class SSOWebController {
   /* @RequestMapping("/{parameter}")
    public String parameter(@PathVariable("parameter") String parameter) {

        System.out.println(parameter);
        return parameter;
    }*/

   private static final String FIRSTURL = "/SSO-web/";
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        System.out.println(page);
        return FIRSTURL + page;
    }

   /* @RequestMapping("/manage/index")
    public String parameter() {

        return "manage/index";
    }*/




}