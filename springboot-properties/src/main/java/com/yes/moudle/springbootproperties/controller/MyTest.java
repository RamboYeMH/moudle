package com.yes.moudle.springbootproperties.controller;

import com.yes.moudle.springbootproperties.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Created by yemingheng
 * @Classname MyTest
 * @Date 2020/2/8 17:23
 */
@RestController
public class MyTest {

    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello World";
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("name", "test");
        return map;
    }


    @GetMapping("/testjson")
    public Object testjson(){

        return new User(111, "abc123", "10001000", new Date());
    }
}
