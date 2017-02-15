<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<fieldset >
 <legend>${train.name} Details</legend>
<table width="500" align="center" border="solid" bgcolor="#ebf1e7">

<tr>
<td>Train Name</td>
<td>${train.name}</td>
</tr>
<tr>
<td>Number of compartment</td>
<td><fmt:formatNumber type="number" value="${train.compartment}" /></td>
</tr>
<tr>
<td>Train Source</td>
<td>${train.source} </td>
</tr>
<tr>
<td>Train Destination</td>
<td>${train.destination }</td>
</tr>
<tr>
<td>Train Speed</td>
<td><fmt:formatNumber type="number" value="${train.speed}"/></td>
</tr>
</table>

<a href="TrainList.html"><button type="button" name="back" >&lt;&lt;Back</button></a>
 
</fieldset>
</body>

</html>