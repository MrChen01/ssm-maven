package com.company.ssmmaven.controller;

import com.company.ssmmaven.model.User;
import com.company.ssmmaven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 陈卓信
 * Date: 2019/12/2
 * Time: 21:05
 */
@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/selectAllUser")
    @ResponseBody
    public List<User> selectAllUser() {
        System.out.println("selectAllUser");
        return userService.selectAllUser();
    }
}
