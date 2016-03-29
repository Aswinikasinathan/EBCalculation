<%-- 
    Document   : userlogin
    Created on : Apr 12, 2015, 9:09:24 PM
    Author     : Elcot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
    </head>
    <body><center><h1> User Login</h1></center>
        <form action="/EBCalculation1/UserLoginServlet" method="POST">
            <center><table>
                <tr>
                    <td>User_id::</td>
                    <td>
                        <input type="text" name="u_id" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>password</td>
                    <td>
                        <input type="text" name="password" value=""/>
                    </td>
                </tr>
                
                </table></center><br/><br/>
            <center><input type="submit" name="Login"/></center>
        </form>
        
    </body>
</html>    
                    
                    
