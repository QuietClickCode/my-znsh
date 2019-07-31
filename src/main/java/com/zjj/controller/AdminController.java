package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("/{parameter}")
    public String parameter(@PathVariable("parameter") String parameter) {

        return parameter;
    }




}