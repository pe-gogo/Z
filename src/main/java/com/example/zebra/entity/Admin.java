package com.example.zebra.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author SHEN
 * @since 2023-06-09
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

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

    @Override
    public String toString() {
        return "Admin{" +
            "id = " + id +
            ", username = " + username +
            ", password = " + password +
        "}";
    }
}
