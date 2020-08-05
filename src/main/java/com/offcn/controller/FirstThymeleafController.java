package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller //使用thymeleaf模板注解必须时controller
public class FirstThymeleafController {

    /**
     * 跳转方法  add by wenjiaxin
     * @return
     */
    @RequestMapping("/test01")
    //Model作用域对象，前端页面想controller传递参数的作用域
    public String test01(Model model){
        String str ="helloword!!!";
        model.addAttribute("message",str);
        //跳转到test01页面
        return "index";
    }
    @RequestMapping("/getPerson")
    public String getPerson(Model model){
        Person person = new Person(1L,"name01",55);
        model.addAttribute("person",person);
        return "index";
    }

    @RequestMapping("/findPersonList")
    public String findPersonList(Model model){
        Person person = new Person(1L,"name01",55);
        Person person2 = new Person(2L,"name02",60);
        Person person3 = new Person(3L,"name03",65);
        Person person4 = new Person(4L,"name04",70);
        Person person5 = new Person(5L,"name05",75);
        List<Person> list  = new ArrayList<>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        model.addAttribute("list",list);
        return "index";

    }

    //add by 温佳鑫
    public void fun1(){
        System.out.println("你好呀");
        if(true){
            System.out.println("嗯呐");

        }  else {
            System.out.println("不好");
        }
    }
}
