package com.criss.travelweb.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {

    //浏览器输入http://localhost:8080/hello/hello2 ，会看到 hello cris!
    //如果端口是80，那么直接localhost/hello/hello2 就行
    @RequestMapping("/hello2")
    public String hi(){
        System.out.println("控制台spring boot 打印\"hello cris! \"...");
        return "hello cris! ";

    }
}
