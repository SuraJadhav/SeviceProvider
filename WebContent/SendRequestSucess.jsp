<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  


<form:form action="sendRequest1">    
        <table >  
          <td>Provide Contact number on which provider will contact you :</td>    
          <td><form:input path="requestContact" /></td>  
         </tr>   
         
          <td> </td>    
          <td><input type="submit" value="Send Request" /></td>    
         </tr>    
        </table>    
       </form:form>    

