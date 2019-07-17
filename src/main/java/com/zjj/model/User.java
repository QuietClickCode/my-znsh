package com.zjj.model;

/**
 * @program: znsh
 * @description: 用户实体
 * @author: zjj
 * @create: 2019-07-18 00:28:23
 **/
public class User {

    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
