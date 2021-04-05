package com.ljf.repostitory;

import com.ljf.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepostiory  extends JpaRepository<User,Integer> {

}
