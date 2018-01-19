<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h1>
 <td>Welcome ${firstname}</td></h1>
<form:form method="post" action="CheckServices">    

  <tr>   
          <td>Which Service you want :</td>    
          <td><form:input path="service" /></td>  
         </tr>   
         
          <td> </td>    
          <td><input type="submit" value="Search" /></td>    
     
         </form:form>
