<%-- 
    Document   : login
    Created on : Jun 20, 2025, 2:04:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="main" method="post">
            <input  type="hidden" name="action" value="login"/>
            <label for="name">Tên đăng nhập:</label>
            <input type="text" id="name" name="user_name" required>
            <br>
            <label for="password">Mật khẩu:</label>
            <input type="password" id="password" name="password" required>
            <br>
            <button type="submit">Đăng nhập</button>
        </form>

    </body>
</html>
