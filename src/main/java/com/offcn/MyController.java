package com.offcn;


import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class MyController {
    @RequestMapping("/index")
    public String index(Model model){
    String message ="hello thymeleaf";
    model.addAttribute("message",message);
        return "index";
    }
    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1, "luck", 18);
        model.addAttribute("user",user);
        Map<String ,Object> map = new HashMap<>();
        map.put("src1","1.png");
        map.put("src2","timg.png");
        map.put("src3","ball.png");
        model.addAttribute("s",map);
        return "index2";
    }
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"luck",24));
        list.add(new User(2,"sht",53));
        list.add(new User(3,"jjy",44));
        list.add(new User(4,"oou",15));
        model.addAttribute("list",list);
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","你好");
        model.addAttribute("src","www.baidu.com");

        return "index4";
    }
    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","admin");
        model.addAttribute("manage","manager");
        return "index5";
    }
    @RequestMapping("/index6")
    public String index6(Model model){
        System.out.println("进入");
        return "index6";
    }
    @RequestMapping("/index7")
    public String index7(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        model.addAttribute("num", 123.456);
        String str= "aajsfoqi;wehf[qe0fjqgnaefv;oifjafasnfj";
        return "index7";
    }
}
