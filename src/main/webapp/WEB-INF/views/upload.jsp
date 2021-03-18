<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Upload</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Add Employee Details</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<b class="text-white" style="padding-left: 75%">Welcome
				${username}!</b><span class="pl-2"></span>
			<form class="form-inline my-2 my-lg-0" action="logout" method="post">
				<input type="hidden" value="${username}" name="username" />
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</button>
			</form>
		</div>
	</nav>

	<div class="containe-fluid " Style="width: 80%; padding-left: 25%">
		<div class="container-fluid p-3">
			<form method="post" action="upload" modelAttribute="emp">
				<div class="form-group row">
					<label for="empCode" class="col-2 col-form-label">Employee
						Code</label>
					<div class="col-10">
						<input type="number" class="form-control" id="empCode"
							required="required" name="empId">
					</div>
				</div>
				<div class="form-group row">
					<label for="empName" class="col-2 col-form-label">Employee
						Name</label>
					<div class="col-10">
						<input type="text" class="form-control" id="empName"
							required="required" name="empName">
					</div>
				</div>

				<div class="form-group row">
					<label for="location" class="col-2 col-form-label">Location</label>
					<div class="col-10">
						<input type="text" class="form-control" id="location"
							required="required" name="location">
					</div>
				</div>

				<div class="form-group row">
					<label for="email" class="col-2 col-form-label">Email</label>
					<div class="col-10">
						<input type="email" class="form-control" id="email"
							required="required" name="email">
					</div>
				</div>
				<div class="form-group row">
					<label for="dob" class="col-2 col-form-label">Date Of Birth</label>
					<div class="col-10">
						<input type="Date" class="form-control" id="dob"
							required="required" name="dateOfBirth">
					</div>
				</div>

				<div class="form-group row text-center">
					<div class="col">
						<button type="submit" class="btn btn-primary">Add</button>
						<button type="reset" class="btn btn-primary">Cancel</button>
					</div>
				</div>

			</form>
		</div>
	</div>

	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>