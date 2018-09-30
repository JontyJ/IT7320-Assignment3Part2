<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>
<html>
<body>
<h2>Welcome to GameGear!</h2>
<h3>Register below</h3>
<form action="RegisterServlet" method="post">
Username: <input type="text" name="username"></br>
Password: <input type="password" name="password"></br>
<input type="submit" value="register">
</form>
<li><a href="login.jsp" >Don't want to register? Go back to the login screen here</a></li>
</body>
</html>