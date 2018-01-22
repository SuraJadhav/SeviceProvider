<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <form:form method="post" action="ProviderCheckLogin">    
        <table >  
        <h1>Provider has to Login First</h1>    
         <tr>    
          <td>Providers Contact No : </td>   
          <td><form:input path="contact"  /></td>  
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

