package com.ljf.controller;

import com.ljf.bean.User;
import com.ljf.serviceInf.UserServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("data")
@RestController
public class UserController {
    
    @Autowired
    private UserServiceInf userServiceInf;
    
    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        List<User> users = this.userServiceInf.GetAll();
        return users;
    }


    @RequestMapping(value = "/getUserById",params = "id")
    public User getUserById(Integer id){

        User user = this.userServiceInf.GetById(id);
        return user;
    }

    @RequestMapping(value = "/delUserById",params = "id")
    public String delUserById(Integer id){
        this.userServiceInf.delUser(id);
        return "success";
    }
}
