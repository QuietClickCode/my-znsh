package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeleafController {
 
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		map.put("name", "朱建军");
		return "hello";
	}
	
}