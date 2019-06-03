package com.ghl.login2.Dao;

import com.ghl.login2.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {
    //根据用户名查找用户
     Optional<User> findByName(String name);
}
