<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/register.js"></script>

</head>
<body>
	<input type="hidden" value="<%=request.getContextPath()%>"id="contextPath">
	<br>
	<br>
	<center>
		<font size="8" color="black" style="font-style: italic"><b>Sample</b></font>
	</center>
	<br>
	<br>
	<table border=0 align="center">
		
		<tr>
			
			 <td><textarea rows="4" cols="50" id="mailBody1" style="margin-left: -258px;"></textarea></td>
		
		</tr>
<tr>
			<td align="center" class="classLogin">
			<input id="updateButton" type="button" value="update" style="background-color: blue; border-radius: 10px; height: 33px; width:77px; outline: none" />
		
		</tr>

	</table>
</body>
</html>