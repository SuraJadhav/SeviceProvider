<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <form:form method="post" action="UserCheckLogin">    
        <table >  
        <h1>User has to Login First</h1>    
         <tr>    
          <td>Contact No : </td>   
          <td><form:input path="contactNo"  /></td>  
         </tr>    
         <tr>    
          <td>Password :</td>    
          <td><form:input path="password" /></td>  
         </tr>   
         
          <td> </td>    
          <td><input type="submit" value="Login" /></td>    
         </tr>    
        </table>    
       </form:form>    

