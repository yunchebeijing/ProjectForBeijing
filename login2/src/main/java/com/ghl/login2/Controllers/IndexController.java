package com.ghl.login2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
public class IndexController {
    @RequestMapping(value = {"/login.go"})
    public String userLogin(){
        //System.out.println("userLogin.do");
        return "login";
    }
   /* public ModelAndView index() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }*/
}
