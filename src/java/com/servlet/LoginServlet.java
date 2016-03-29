/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.hiber.Login;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elcot
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uname,pwd;
        
        uname=request.getParameter("user_name");
        pwd=request.getParameter("password");
        
       
        
        
        Login log=new Login(uname,pwd);
        if(log.Validate())
        {
            request.getSession().setAttribute("u_name",uname);
            response.sendRedirect("/EBCalculation1/success.jsp");
        }
        else
        {
            response.sendRedirect("/EBCalculation1/fail.jsp");
        }
        
        
        
      
       
    }
   

   

}
