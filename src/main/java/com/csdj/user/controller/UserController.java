package com.csdj.user.controller;

import com.csdj.user.pojo.User;
import com.csdj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @version 1.0
 * @ClassName UserController
 * @Author wuzl
 * @Date 2019/9/3
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/dologin")
    public String dologin(String userCode, String userPassword, HttpServletRequest req){
        User user = new User(userCode,userPassword);
        boolean flag = userService.login(user);
        if (flag){
            HttpSession session = req.getSession();
            session.setAttribute("user",userCode);
            return "main";
        }else {
            req.setAttribute("error","用户明密码错误");
            return "login";
        }


    }
}
