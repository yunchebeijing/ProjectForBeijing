package com.ghl.login2.Services;

import com.ghl.login2.Models.Result;
import com.ghl.login2.Models.User;
import com.ghl.login2.Dao.UserRepository;
import com.ghl.login2.Tools.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //Autowire装配UserRepository数据库操作类
    @Autowired
    UserRepository userRepository;

    /**
     * 基础登录逻辑
     *
     * @param userName 用户名
     * @param password MD5 hashed密码
     * @return
     */
    public Result<Long> login(String userName, String password) {
        Result<Long> result = new Result<>();
        User u = userRepository.findByName(userName).get();
        if (u == null) {
            result.setErrCode(-1);
            result.setErrMessage("用户不存在");
        } else if (u.getuserPassword().equals(password)) {
            System.out.println(u.toString());
            result.setErrCode(0);
            result.setData(u.getId());
        } else {
            result.setErrCode(1);
            result.setErrMessage("密码错误");
        }
        return result;
    }

    public Result<User> add(User user) {
        Result<User> result = new Result<>();
        User u = userRepository.save(user);
        if (u != null) {
            result.setErrCode(0);
            result.setData(u);
        } else {
            result.setErrCode(-1);
            result.setErrMessage("发生错误");
        }
        return result;
    }

    public void initUserData() {
        Iterable<User> users = userRepository.findAll();
        int sum = 0;
        while (users.iterator().hasNext()) {
            users.iterator().next();
            sum++;
        }
        if (sum == 0) {
            for (int i = 0; i < 5; i++) {
                User user = new User();
                user.setUserName("Admin" + i);
                String hashedPassword = Encrypt.stringMD5("Admin" + i);
                user.setuserPassword(hashedPassword);
                add(user);
            }
        }

    }
}