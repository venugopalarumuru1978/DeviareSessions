<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="margin-top: 100px;" class="text-bg-primary">
<div class="container-fluid">
<div class="row">
		<div class="col-lg-3"></div>
		<div class="col-lg-6">
		<form method="post" action="Login">
		<div class="card text-bg-info">
				<div class="card-header">
					<b> Student Application - Login Here</b>
				</div>
				<div class="card-body">
					<label>Username</label>
					<input type="text"  name="txtUser" class="form-control" placeholder="User Name"/>
					<br />
					<label>Password</label>
					<input type="password"  name="txtPass"  class="form-control" placeholder="Password" />
					<br />
					<div class="row">
						<div class="col-lg-12"  style="text-align: center;">
					<input type="submit"  value="Login"  class="btn btn-success" />
					<input type="reset"  value="Clear"  class="btn btn-danger" />							
						</div>
					</div>
				</div>
			</div>
		</form>
		</div>
		<div class="col-lg-3"></div>
</div>
</div>
</body>
</html>