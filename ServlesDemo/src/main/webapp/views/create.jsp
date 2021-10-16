<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

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
				<li><a href="<%=request.getContextPath()%>/logout"
					class="btn btn-success">Logout</a></li>

			</ul>

		</nav>
	</header>
	<br>


<div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${dbStu != null}">
                            <form action="<%=request.getContextPath()%>/update" method="post">
                        </c:if>
                        <c:if test="${dbStu == null}">
                            <form action="<%=request.getContextPath()%>/save" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${dbStu != null}">
                                    Edit User
                                </c:if>
                                <c:if test="${dbStu == null}">
                                    Add New User
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${dbStu != null}">
                            <input type="hidden" name="id" value="<c:out value='${dbStu.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Name :</label> <input type="text" value="<c:out value='${dbStu.username}' />" class="form-control" name="username" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Email :</label> <input type="text" value="<c:out value='${dbStu.email}' />" class="form-control" name="email">
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>DOB :</label> <input type="date" value="<c:out value='${dbStu.dob}' />" class="form-control" name="dob">
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>Mobile :</label> <input type="text" value="<c:out value='${dbStu.mobile}' />" class="form-control" name="mobile">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>course :</label> <input type="text" value="<c:out value='${dbStu.course}' />" class="form-control" name="course">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

</html>