package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangf
 * @title: MyController
 * @projectName demo
 * @description: TODO
 * @date 2019/4/25 16:38
 */
@RestController
@RequestMapping(value = "hello")
public class MyController {

    @RequestMapping(value = "/world")
    public String sayHello(HttpServletRequest request){
        Map<String,String> map = new HashMap<String,String>();
        map.put("userName","zhangf");
        return "helloWorld";
    }
}
