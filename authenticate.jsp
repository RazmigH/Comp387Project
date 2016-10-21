<%-- 

Project Manager: Cuong Nguyen
Team ID: 8 
Class Number: SOEN 387
Name:
Aakash Patel            27503008
Mahinthien Ratnarajah	27186517
Michael Cabana          27527489
Mouad Bouras            27671083
Razmig Houssikian	40001040

Sprint 1
--%>

<%@page import="sun.misc.BASE64Encoder"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authenticate Page</title>
    </head>
    <body>
        <%
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
       
       
        MessageDigest setToMD5 = MessageDigest.getInstance("MD5");
        setToMD5.update(pass.getBytes());
      
        BASE64Encoder encode = new BASE64Encoder();
        String encodedpass = encode.encode(setToMD5.digest());
        
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin?"+"user=root");    
            PreparedStatement query = connection.prepareStatement("SELECT username, password FROM login WHERE username=? and password=?");
            query.setString(1, uname);
            query.setString(2, encodedpass);
            ResultSet result = query.executeQuery();                        
            if(result.next())
            {
               out.println("<br>Valid login credentials, you may go to reservation page");
             // response.sendRedirect("https://www.google.com");
            }
            else
            {
                  
               response.sendRedirect("http://localhost:8080/SOEN387Project/incorrectlogin.html");
               /*   out.print(pass);       
               out.print(encodedpass);*/
            }    
        
            %>
    </body>
</html>
