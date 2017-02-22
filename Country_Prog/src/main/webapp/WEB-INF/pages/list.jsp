<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
<title> Country Details</title>
</head>
<body>
 <center>
  <div style="color: teal; font-size: 30px"> Country Details</div>

  <c:if test="${!empty countryList}">
   <table border="1" bgcolor="black" width="600px">
    <tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
     
     <td>Name</td>
     <td>Area</td>
     <td>Population</td>
     <td>Currency</td>
     <td>Edit</td>
     <td>Delete</td>
    </tr>
    <c:forEach items="${countryList}" var="ctr">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      
      <td><c:out value="${ctr.name}" />
      </td>
      <td><c:out value="${ctr.area}" />
      </td>
      <td><c:out value="${ctr.population}" />
      </td>
      <td><c:out value="${ctr.currency}" />
      </td>
      <td><a href="edit?id=${ctr.id}">Edit</a></td>
      <td><a href="delete?id=${ctr.id}">Delete</a></td>
     </tr>
    </c:forEach>
   </table>
  </c:if>


  <a href="form.html"><input type="button" value="Click Here to add new Country"></a>
 </center>
</body>
</html>
