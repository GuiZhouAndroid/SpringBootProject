package com.example.springbootproject.service.impl;

import com.example.springbootproject.entity.User;
import com.example.springbootproject.mapper.UserMapper;
import com.example.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by on 2021/10/14
 * 描述：用户业务接口实现类
 *
 * @author ZSAndroid
 * @create 2021-10-14-19:34
 */
@Service
public class UserServiceImpl implements UserService {
    //UserMapper引入了 UserMapper.xml 的SQL语句，所以需要进行这一步，把实现类与SQL语句进行关联
    @Autowired
    UserMapper userMapper;

    //步骤4：实现业务接口的接口方法List<User> findAllUserInfo()，现在是class了，可以让业务层controller去调用
    @Override
    public List<User> findAllUserInfo() {
        return userMapper.findAllUserInfo();
    }
}
