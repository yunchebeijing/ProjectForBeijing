package com.ghl.login2.Models;


import javax.persistence.*;

@Entity //实体注入
@Table(name = "user") //映射对应表明
public class User {
    @Id //主键Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name="username" )
    private String name;
    @Column( name="hashedpassword" )
    private String userPassword;


    //省略getter和setter
    public Long getId() {
        return id;
    }
    public String getUserName() {
        return name;
    }

    public String getuserPassword() {
        return userPassword;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public void setuserPassword(String hashedPassword) {
        this.userPassword = hashedPassword;
    }

    //重写toString方法便于后期调试查看数据
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + name + '\'' +
                ", hashedPassword='" + userPassword + '\'' +
                '}';
    }
}