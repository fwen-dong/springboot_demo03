package cn.com.fwen.springboot.controller;

import cn.com.fwen.springboot.entity.User;
import cn.com.fwen.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuickStartController {

    @Autowired
    UserService userService;

    @RequestMapping("/loadAllUser")
    public @ResponseBody List<User> loadAllUser(){
        try {
            return userService.findAllUser();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
