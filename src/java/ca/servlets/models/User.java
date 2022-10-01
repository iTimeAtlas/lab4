/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.servlets.models;

import java.io.Serializable;

/**
 * Reps the User
 * @author Timle
 */
public class User implements Serializable {
    private String username;
    private String password;

   
    
    public User() {
    
    }
    
    public User(String reqUsername, String reqPassword) {
        username = reqUsername;
        password = reqPassword;
    
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
    
    
    public String toString() {
    
        return getUsername();
    }
}
