   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Services List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Charge</th><th>Area</th><th>Service</th></tr>  
   <c:forEach var="ServiceProvider" items="${list}">   
   <tr>  
   <td>${ServiceProvider.name}</td>  
   <td>${ServiceProvider.charge}</td>  
   <td>${ServiceProvider.area}</td>  
   <td>${ServiceProvider.service}</td>  
 
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
 