package net.kokwind.springmvc.controller;

import net.kokwind.springmvc.entity.Delivery;
import net.kokwind.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FormController {
    @PostMapping("/apply")
    @ResponseBody
    //1.使用数组接收复合参数
    public String apply(@RequestParam(value = "name", defaultValue = "ANON") String name, String course, Integer[] purpose){
        System.out.println(name);
        System.out.println(course);
        for(Integer i:purpose){
            System.out.println(i);
        }
        return name + " " + course + " " + purpose.length;
    }

    @PostMapping("/apply1")
    @ResponseBody
    //2.使用List接收复合参数
    public String apply1(@RequestParam(value = "name", defaultValue = "ANON") String name, String course, @RequestParam List<Integer> purpose){
        System.out.println(name);
        System.out.println(course);
        for(Integer i:purpose){
            System.out.println(i);
        }
        return name + " " + course + " " + purpose.size();
    }

    @PostMapping("/apply2")
    @ResponseBody
    //2.使用List接收复合参数
    public String apply2(Form form){
        String name = form.getName();
        String course = form.getCourse();
        List<Integer> purpose = form.getPurpose();
        Delivery delivery = form.getDelivery();

        for(Integer i:purpose){
            System.out.println(i);
        }
        return name + " " + course + " " + purpose.size() + " " + delivery.getName() + " " + delivery.getMobile() + " " + delivery.getAddress();
    }
}
