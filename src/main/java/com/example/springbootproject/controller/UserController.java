package com.example.springbootproject.controller;
import com.example.springbootproject.entity.User;
import com.example.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by on 2021/10/14
 * 描述：用户业务控制层
 *
 * @author ZSAndroid
 * @create 2021-10-14-19:35
 */
@RestController
public class UserController {
    //固定写法，用到什么Service就@Autowired来获取，才能调用xml中id对应的方法，就会执行SQL语句，查询数据库，才能返回数据结果
    @Autowired
    UserService userService;

    /**
     * 查询User表中全部用户信息
     * @return
     */
    @RequestMapping("/QueryAllUserInfo")
    public List<User> QueryAllUserInfo(){
        //根据SQL语句，开始查询数据库，返回全部用户信息，放到List集合中
        return userService.findAllUserInfo();
    }
}
