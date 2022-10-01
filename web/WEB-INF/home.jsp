<%-- 
    Document   : home
    Created on : 30-Sep-2022, 3:30:14 PM
    Author     : Timle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Hello ${username}!</h1>
        
        <a href="home?action=logout">Logout</a>
    </body>
</html>
