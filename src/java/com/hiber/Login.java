/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

/**
 *
 * @author Elcot
 */
public class Login {
    
    private String name,pwd;

    public String getName() {
        return name;
    }

    public void setName(String uname) {
        this.name = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Login(String uname, String pwd) {
        this.name = uname;
        this.pwd = pwd;
    }
    
    public boolean Validate()
    {
        if(name.equals("Aswini")&& pwd.equals("achu"))
            return true;
        else
            return false;
    }
  
    
}
