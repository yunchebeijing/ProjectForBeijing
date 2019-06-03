package com.ghl.login2.Controllers;

import com.alibaba.fastjson.JSONObject;
import com.ghl.login2.Models.Result;
import com.ghl.login2.Models.User;
import com.ghl.login2.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
//@Controller

public class UserController {

    @Autowired
    UserService userService;

    /*public Result<Long> login(@RequestParam("name") String name, @RequestParam("password") String password) {
        return userService.login(name, password);
    }*/

    /*@CrossOrigin
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Result<Long> login(@RequestParam(value = "name", required = true) String name,
                              @RequestParam(value = "password", required = true) String password){
        Result<Long> result=userService.login(name,password);
        return result;*/
    @CrossOrigin
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Result<Long> login(@RequestBody Map<String, String> uu) {
        String name = uu.get("name");
        String password = uu.get("password");
        Result<Long> result = userService.login(name, password);
        return result;

    }

   /* @RequestMapping(value = "/user")
    public String getLoginCl(@RequestParam("name") String name,
                             @RequestParam("password") String password) {
        Result<Long> result=userService.login(name,password);
        int code =result.getErrCode();
        if (code==0) {
            return "wel";
        }
        return "login";
    }*/
}