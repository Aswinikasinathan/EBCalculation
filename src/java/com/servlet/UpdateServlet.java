/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.hiber.CustManager;
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
public class UpdateServlet extends HttpServlet {

   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id,unit;
        
        id=Integer.parseInt(request.getParameter("id"));
        unit=Integer.parseInt(request.getParameter("units"));
        
        
        CustManager cm=new CustManager();
         
             
         
       if(cm.updateUnit(id,unit))
       {
           response.sendRedirect("/EBCalculation1/storedsus.jsp");
       }
       else
       {
           response.sendRedirect("/EBCalculation1/storedfail.jsp");
       }
         
             
     
    }

    
}
