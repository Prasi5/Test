<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/login.js"></script>
<title>EXAMPLE-1</title>


</head>
<body>
	<input type="hidden" value="<%=request.getContextPath()%>;" id="contextPath">
	<br>
	<br>
	<center>
		<font size="8" color="black" style="font-style: italic"><b>Sample</b></font>
	</center>
	<br>
	<br>
	<table border=0 align="center">
		<tr align="left">
			<td>
				<font color="black" size="5">USERID</font>
				 <input type="text" name="userid" id="UserId" placeholder=" Enter User Id" style="height: 29px;width: 249px;margin-left: 41px;">
			</td>
		</tr>
		<tr>
			<td>
			<font color="black" size="5">PASSWORD</font> 
			<input type="password" name="password" id="Password" placeholder=" Enter Password" style="height: 29px; width: 249px">
			</td>
		</tr>
		<tr>
			<td>BODY</td>
			 <td><textarea id="mailBody"></textarea></td>
			<!-- <td><div style="width: 400px;height: 100px;border:1px solid black;margin-left: -257px; overflow:auto;" contenteditable="true" id="mailBody" ></div></td>
			 --></tr>
		<tr>
			<td align="center" class="classLogin">
			<input id="loginButton" type="button"  value="Login" style="background-color: blue; border-radius: 10px; height: 33px; width:77px; outline: none" />
		
		</tr>

	</table>
</body>
</html>