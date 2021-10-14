package com.example.springbootproject.service;

import com.example.springbootproject.entity.User;

import java.util.List;

/**
 * created by on 2021/10/14
 * 描述：用户业务接口
 *
 * @author ZSAndroid
 * @create 2021-10-14-19:34
 */
public interface UserService {
    //步骤3：这个类 有 “interface”,所以只定义抽象接口方法，需要实现类UserServiceImpl去与MySQL数据交互
    List<User> findAllUserInfo();
}
