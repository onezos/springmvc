package net.kokwind.springmvc.controller;

import net.kokwind.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

//@Controller注解可以看做是servlet的替代品，它可以把一个类标识为一个controller
//@RequestMapping注解用在类上指定请求的全局映射路径，之后的get和post方法都会被映射到这个路径下
//localhost/method/get
//localhost/method/post
//@RequestMapping注解用在方法上表示不再区分get和post请求
@Controller
public class URLMappingController {
    //get请求也是可以通过?manager_name=lily这样的方式接收参数的，
    //这时需要使用@RequestParam把名字注入到参数里
    @GetMapping("/get")
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName, Date createTime) {
        return "manager_name" + ":" + managerName + ":" + createTime;
    }
    @PostMapping("/post")
    @ResponseBody
    public String postMapping(String username, String password, @DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime) {
        return username + ":" + password + ":" + createTime;
    }

    @PostMapping("/post1")
    @ResponseBody
    public String postMapping1(User user){
        return user.getUsername() + ":" + user.getPassword() + ":" + user.getCreateTime();
    }
}