<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.*" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Write the username and password to a file
    try {
    	
        FileWriter writer = new FileWriter("D:\\Shubham\\eclipse\\Assignment 3\\src\\main\\webapp\\users.txt", true);
        writer.write(username + "\n" + password + "\n");
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>
    <h1>Thank you!</h1>
    <p>Your User Name and Password have been stored.</p>
</body>
</html>
