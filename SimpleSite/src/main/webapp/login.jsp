<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>
<html>
<body>
<h2>Welcome to GameGear!</h2>
<h3>Login below</h3>
<form action="LoginServlet" method="post">
Username: <input type="text" name="username"></br>
Password: <input type="password" name="password"></br>
<input type="submit" value="login">
</form>
<li><a href="register.jsp" >Don't have an account? Register here</a></li>
</body>
</html>