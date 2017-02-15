<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>
Train List
</title>
</head>
<body>
 <fieldset >
 <legend>Train List </legend>

<table align="center" width="500" border="dotted" >


<c:forEach items="${trains}" var="train">
<tr bgcolor="#ebf1e7">
<td align="center">
<a href="TrainDetails.html?id=${train.id}">
${train.name}
</a>
</td>
</tr>
</c:forEach>
</table>
 </fieldset>
</body>
</html>