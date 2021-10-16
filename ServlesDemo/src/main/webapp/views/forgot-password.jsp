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
			<h2>Reset-Password</h2>
		</div>
		<hr>
		<div class="row col-md-10 col-md-offset-3">

			<div class="card card-body">

				<h2>Reset-Password</h2>
				<div class="col-md-8 col-md-offset-3">

					<form action="<%=request.getContextPath()%>/reset_password" method="post">

						

						<div class="form-group">
							<label for="email">E-Mail:</label> <input type="text"
								class="form-control" name="email" required>
						</div>
						

						<button type="submit" class="btn btn-primary">Reset</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>