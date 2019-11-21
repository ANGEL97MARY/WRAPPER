<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  action="/Student/sucess" method="post" >
 <label><b>Username</b></label> 
<input type="text" placeholder="Enter Username" name="name" required> <br>
  <label><b>Password</b></label> 
    <input type="password" placeholder="Enter Password" name="password" required> <br>
  
                <button type="submit">Login</button> 
<a href="Student/all">view</a>
</form>

</body>
</html>