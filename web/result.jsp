<%-- 
    Document   : result.jsp
    Created on : Apr 13, 2015, 10:48:01 AM
    Author     : Elcot
--%>

<%@page import="com.hiber.Customer_det"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html
<%! Customer_det details; %>
<% details =(Customer_det) session.getAttribute("detail");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <body>
    <center> <h1>YOUR ELECTRICITY BILL</h1></center>
    <center><table>
            <tr>
                <td>
                     ID::
                </td>
                <td><%=details.getId()%></td>
            </tr>
            <tr>
                <td> NAME::</td>
                <td><%=details.getUname()%></td>
            </tr>
            <tr>
                <td>ADDRESS::</td>
                <td><%=details.getAddress()%></td>
            </tr>
            <tr>
                <td> NO_OF_UNITS::</td>
                <td><%=details.getNo_of_units()%></td>
            </tr>
            <tr>
                <td>AMOUNT::</td>
                <td> <%=details.getAmount()%></td>
            </tr>
            
       
      
       
      
         </table>         
    </center>
    <center><a href="/EBCalculation1/index.html">Logout</a></center>
        
    </body>
</html>
