<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>注册页面</title>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
</head>
<body>
<h3>注册页面</h3>
<br>
<form action="register" method="post">
    <table>
        <tr>
            <td>
                <label>登录名：</label>
            </td>
            <td>
                <input type="text" id="loginname" name="loginname">
            </td>
        </tr>
        <tr>
            <td>
                <label>密码：</label>
            </td>
            <td>
                <input type="text" id="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                <label>真实姓名：</label>
            </td>
            <td>
                <input type="text" id="username" name="username">
            </td>
        </tr>
        <tr>
            <td>
                <input id="submit" type="submit" value="注册">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
