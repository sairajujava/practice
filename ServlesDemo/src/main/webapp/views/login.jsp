<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="container">
		<div class="row text-center" style="color: tomato;">
			<h2>Login :</h2>
		</div>
		<hr>
		<div class="row col-md-10 col-md-offset-3">

			<div class="card card-body">

				<h2>User Login Form</h2>
				<div class="col-md-8 col-md-offset-3">

					<form action="<%=request.getContextPath()%>/login" method="post">

						

						<div class="form-group">
							<label for="email">E-Mail:</label> <input type="text"
								class="form-control" name="email" required>
						</div>
						<div class="form-group">
							<label for="password">Password:</label> <input type="password"
								class="form-control" name="password" required>
						</div>
					

						<button type="submit" class="btn btn-primary">Login</button>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="register.jsp"
							class="btn btn-primary">NewUser</a>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="forgot-password.jsp"
							class="btn btn-primary">Reset-Password</a>
							

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>