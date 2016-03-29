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
public class Customer_det {
    
    private int id,no_of_units,amount;
    private String uname,pwd,address;

    public Customer_det(int no_of_units, int amount, String uname, String pwd, String address) {
        this.no_of_units = no_of_units;
        this.amount = amount;
        this.uname = uname;
        this.pwd = pwd;
        this.address = address;
    }
    
    public Customer_det()
    {
        
    }

    Customer_det(String uname, String pwd, String address, int no_of_units, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_of_units() {
        return no_of_units;
    }

    public void setNo_of_units(int no_of_units) {
        this.no_of_units = no_of_units;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
