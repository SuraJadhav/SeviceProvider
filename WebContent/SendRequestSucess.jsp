<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<form:form method="post" action="/ServiceProvider/sendRequest1" >    
        <table >  
          <td>Provide Contact number on which provider will contact you :</td>    
          <td><input type='text' name='u_contact' /></td>  
         </tr>   
         
          <td> </td>    
          <td><input type="submit" value="Send Request" /></td>    
         </tr>    
        </table>    
       </form:form>    

