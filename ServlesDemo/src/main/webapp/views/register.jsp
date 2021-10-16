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
			<h2>User Register</h2>
		</div>
		<hr>
		<div class="row col-md-10 col-md-offset-3">

			<div class="card card-body">

				<h2>User Register Form</h2>
				<div class="col-md-8 col-md-offset-3">

					<form action="<%=request.getContextPath()%>/register" method="post">

						<div class="form-group">
							<label for="userName">UserName:</label> <input type="text"
								class="form-control" name="username" required>
						</div>

						<div class="form-group">
							<label for="password">Password:</label> <input type="password"
								class="form-control" name="password" required>
						</div>

						<div class="form-group">
							<label for="email">E-Mail:</label> <input type="text"
								class="form-control" name="email" required>
						</div>
						<div class="form-group">
							<label for="dob">DOB:</label> <input type="date"
								class="form-control" name="dob" required>
						</div>
						<div class="form-group">
							<label for="mobile">Mobile:</label> <input type="mobile"
								class="form-control" name="mobile" required>
						</div>
						<div class="form-group">
							<label for="city">City:</label> <select id="city"
								class="form-control" name="city" required>
								<option value="">---choose---</option>
								<option value="Bangalore">Bangalore</option>
								<option value="Hyderabad">Hyderabad</option>
								<option value="Mumbai">Mumbai</option>
								<option value="Pune">Pune</option>

							</select>
						</div>

						<div class="form-group">
							<label for="state">State:</label> <select id="state"
								class="form-control" name="state" required>
								<option value="">---choose---</option>
								<option value="KA">Karnataka</option>
								<option value="TS">Telangana</option>
								<option value="MH">Maharastra</option>
								<option value="MH">Maharastra</option>

							</select>
						</div>
						<div class="form-group">
							<label for="country">Country:</label> <select id="country"
								class="form-control" name="country" required>
								<option value="">---choose---</option>
								<option value="IN">India</option>

							</select>
						</div>

						<button type="submit" class="btn btn-primary">Register</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>