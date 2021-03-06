package com.example.springbootproject.entity;

/**
 * created by on 2021/10/14
 * 描述：用户实体类
 *
 * @author ZSAndroid
 * @create 2021-10-14-19:36
 */
public class User {
    private Integer id;//自增id
    private String username;//用户名
    private String password;//密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
