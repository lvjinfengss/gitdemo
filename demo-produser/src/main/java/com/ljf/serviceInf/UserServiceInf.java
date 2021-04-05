package com.ljf.serviceInf;

import com.ljf.bean.User;

import java.util.List;

public interface UserServiceInf {

    List<User> GetAll();

    User GetById(Integer id);

    boolean SaveOrUpdateUser(User user);

    boolean delUser(Integer id);
}
