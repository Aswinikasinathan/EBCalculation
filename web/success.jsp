<%-- 
    Document   : success
    Created on : Apr 12, 2015, 3:53:00 PM
    Author     : Elcot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String  name;%>
<% name = session.getAttribute("u_name").toString();%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Value page</title>
    </head>
    <body>
       
          <form action="/EBCalculation1/UpdateServlet" method="POST">
            
        <%  if(name.equals(" "))
        {%>
            <h1>Click here to <a href="/EBCalculation1/index.html">Login</a> again</h1>
        <%}
        else
        {%>
         <center><h1>Welcome<%=name%></h1></center>
         
             <center>  <table>
                 <tr>
                     <td>
                         User_id::
                     </td>
                     <td>
                     <input type="text" name="id" value=""/>    
                     </td>
                 </tr>
                 <tr><br/>
                     <td>
                         Unit_consumed::
                     </td>
                     <td>
                     <input type="text" name="units" value=""/>    
                     </td>
                 </tr>
                 </table></center><br/>
             
             <center><input type="submit" name="submit"/></center>
            
        </form>
        <%}%>
    </body>
</html>
 
            
            
            
             