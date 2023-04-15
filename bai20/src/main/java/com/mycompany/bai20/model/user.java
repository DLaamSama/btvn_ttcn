/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai20.model;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class user implements Serializable {

    private String username;
    private String pass;
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public user(String username, String pass, String role) {
        this.username = username;
        this.pass = pass;
        this.role = role;
    }

    public user() {
    }

}
