package com.yamanda.springbootdemo.pojo;


import javax.persistence.*;
import java.util.Date;

@Entity
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String password;
    private Date last_login;
    private Date date_joined;
    private Integer is_superuser;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private Integer is_staff;
    private Integer is_active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public Date getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Date date_joined) {
        this.date_joined = date_joined;
    }

    public Integer getIs_superuser() {
        return is_superuser;
    }

    public void setIs_superuser(Integer is_superuser) {
        this.is_superuser = is_superuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(Integer is_staff) {
        this.is_staff = is_staff;
    }

    public Integer getIs_active() {
        return is_active;
    }

    public void setIs_active(Integer is_active) {
        this.is_active = is_active;
    }
}
