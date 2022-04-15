package net.kokwind.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller注解可以看做是servlet的替代品，它可以把一个类标识为一个controller
//@RequestMapping注解用在类上指定请求的全局映射路径，之后的get和post方法都会被映射到这个路径下
//localhost/method/get
//localhost/method/post
//@RequestMapping注解用在方法上表示不再区分get和post请求
@Controller
@RequestMapping("/method")
public class URLMappingController {
    @GetMapping("/get")
    @ResponseBody
    public String getMapping() {
        return "This is a get mapping";
    }
    @PostMapping("/post")
    @ResponseBody
    public String postMapping() {
        return "This is a post mapping";
    }
}