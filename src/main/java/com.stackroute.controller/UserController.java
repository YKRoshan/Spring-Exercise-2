package com.stackroute.controller;

import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/")
    public String userInfo(ModelMap map){
        User user = new User("Yashawant","male");
        map.addAttribute("user",user.getName());
        return "index";
    }

    @RequestMapping(value = "/user")
    public ModelAndView showName(@RequestParam("uname") String username){
        User user= new User();
        user.setName(username);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("showData");
        String name = user.getName();
        mv.addObject("userName",name);
       return  mv;

    }
}
