<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Provider Your Requests are:</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Contact Numbers</th>></tr>  
   <c:forEach var="User" items="${list}">   
   <tr>  
   <td>${contactnumber}</td>  
     
  
   </tr>  
   </c:forEach>  
</body>
</html>