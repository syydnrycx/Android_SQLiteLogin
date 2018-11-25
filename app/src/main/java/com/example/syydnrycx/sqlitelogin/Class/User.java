package com.example.syydnrycx.sqlitelogin.Class;

import java.io.Serializable;
//定义了一个User对象并实现序列化接口。序列化Serizable一般用于将该类的对象持久化到存储设备，以备系统停机之后恢复。
public class User implements Serializable{
    //内含以下成员变量。
    private int id;
    private String username;
    private String password;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    //自定义构造函数。
    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    //并实现get和set方法。
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    //该对象重写了Object类的toString()方法。
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + "]";
    }

}