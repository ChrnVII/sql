<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./style/style.css">
</head>

<body>
    <div class="container">
        <div class="login-wrapper">
            <div class="header">图书管理系统</div>
            <div class="form-wrapper">
            <form action="login" method="post">
                <input type="text" id="username" name="username" placeholder="用户名" class="input-item">
                <input type="password" id="password" name="password" placeholder="密码" class="input-item">
                <input type="submit" class="btn" value="登录">
            </form>
            </div>

        </div>
    </div>
    <script src="./script/main.js"></script>
</body>

</html>