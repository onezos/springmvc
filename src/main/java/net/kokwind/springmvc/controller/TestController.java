package net.kokwind.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test") //把test方法映射到路径为//localhost/test
    @ResponseBody //直接向相应输出字符串，不跳转页面
    public String test() {
        return "SUCCESS";
    }
}
