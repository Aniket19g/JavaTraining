<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Form</h1>

<form action="welcome.jsp" method="post">
 <br/>
         <label for="aId">User Name:</label>
         <input type="text" name="name" required><br/><br/>
         <label for="uname">User Password:</label> 
         <input type="text" name="password" required><br/><br/>
         <label for="acadd">User Email</label> 
         <input type="text"  name="email" required><br/><br/>
         <input type="submit" value="SUBMIT"><br/>  
         
</form>
</body>
</html>