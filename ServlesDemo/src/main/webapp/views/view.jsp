<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<%
		//allow access only if session exists
		String email = null;
		if (session.getAttribute("email") == null) {
			response.sendRedirect("views/login.jsp");
		} else {
			email = (String) session.getAttribute("email");

		}
		%>
		<p align="right">
			Welcome :<%=email%></p>

		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">

			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> User
					Management App </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/add"
					class="btn btn-success">Add New User</a></li>
				<li><a href="<%=request.getContextPath()%>/list"
					class="btn btn-success">List Users</a></li>
					<li><a href="<%=request.getContextPath()%>/updatePassword"
					class="btn btn-success">UpdatePassword</a></li>
				<li><a href="<%=request.getContextPath()%>/logout"
					class="btn btn-success">Logout</a></li>

			</ul>

		</nav>
	</header>
	<br>
</body>

</html>