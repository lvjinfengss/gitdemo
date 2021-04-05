package com.ljf.serviceImpl;

import com.ljf.bean.User;
import com.ljf.repostitory.UserRepostiory;
import com.ljf.serviceInf.UserServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInf {


    @Autowired
    UserRepostiory userRepostiory;

    @Override
    public List<User> GetAll() {
        List<User> userList = userRepostiory.findAll();
        if(userList.isEmpty()){
            return new ArrayList<>();
        }
        return userList;
    }

    @Override
    public User GetById(Integer id) {
        User user = userRepostiory.getOne(id);
        if(user!=null) {
            return user;
        }
        return new User();
    }

    @Override
    public boolean SaveOrUpdateUser(User user) {
        User userBean = userRepostiory.saveAndFlush(user);
        if(userBean!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean delUser(Integer id) {
        userRepostiory.deleteById(id);
        return true;
    }
}
