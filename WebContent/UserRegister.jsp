<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <form:form method="post" action="saveUser">    
        <table > 
        <h1>User can Register here...</h1>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Address :</td>    
          <td><form:input path="address" /></td>  
         </tr>   
         <tr>    
          <td>Contact No. :</td>    
          <td><form:input path="contactNo" /></td>  
         </tr>   
         <tr>    
          <tr>    
          <td>Password :</td>    
          <td><form:input path="password" /></td>  
         </tr>   
         <tr>
          <td> </td>    
          <td><input type="submit" value="Register" /></td>    
         </tr>    
        </table>    
       </form:form>    
