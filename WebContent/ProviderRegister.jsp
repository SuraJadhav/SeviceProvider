<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <form:form method="post" action="saveProvider">    
        <table > 
        <h1>User can Register here...</h1>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Address :</td>    
          <td><form:input path="area" /></td>  
         </tr>   
         <tr>  
         <tr>    
          <td>Service :</td>    
          <td><form:input path="service" /></td>  
         </tr>  
         <tr>    
          <td>Contact No :</td>    
          <td><form:input path="contact" /></td>  
         </tr>   
         <tr>   
         <tr>    
          <td>Charge :</td>    
          <td><form:input path="charge" /></td>  
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