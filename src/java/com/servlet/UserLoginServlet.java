/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.hiber.Customer_det;
import com.hiber.UserManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elcot
 */
public class UserLoginServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      int id;
      String pwd;
      
      id=Integer.parseInt(request.getParameter("u_id"));
      pwd=request.getParameter("password");
      PrintWriter out=response.getWriter();
      out.println("Inside servlet");
      UserManager um=new UserManager();
      if(um.isExist(id, pwd))
      {
          /*Customer_det cd=um.returndet(id);
          out.println(cd.getId());
          out.println(cd.getUname());
          out.println(cd.getAddress());
          out.println(cd.getNo_of_units());
          out.println(cd.getAmount());*/
           Customer_det cd=um.returndet(id);
          request.getSession().setAttribute("detail",cd);
          response.sendRedirect("/EBCalculation1/result.jsp"); 
         
      }
      else
          out.println("Failed");
      
      
    }

   
}
