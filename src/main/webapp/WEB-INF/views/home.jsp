<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Home</title>
</head>
<body>
	<c:if test="${empList.size() > 0 }">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#">Employee Listing</a>
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


		<section class="container-fluid p-4">
			<div style="padding-left: 50%;">

				<form action="home" method="post">
					<input type="hidden" value="${username}" name="username" />
					<button style="padding: 4px; border-radius: 4px;" type="submit">
						Upload Employee Details</button>
					<button style="padding: 4px; border-radius: 4px;">
						Download Employee Details</button>
				</form>
			</div>


			<div class="card  mt-5 mx-5 ">
				<table class="table">
					<thead class="thead-dark">
						<tr class="text-center">
							<th scope="col">EmployeeCode</th>
							<th scope="col">Employee Name</th>
							<th scope="col">Location</th>
							<th scope="col">Email</th>
							<th scope="col">Date Of Birth</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${empList }" var="list">


							<tr class="text-center">
								<td>${list.getEmpId() }</td>
								<td>${list.getEmpName() }</td>
								<td>${list.getLocation() }</td>

								<td>${list.getEmail()  }</td>
								<td>${list.getDateOfBirth() }</td>
								<td>
									<form action="update" method="post">
										<button type="submit" class="btn btn-primary">update</button>
									</form>
								</td>

							</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
	</c:if>
	<c:if test="${empList.size()<=0 }">
		<div
			class="container- p-5 h3 text-danger text-center border border-dark mt-5 mx-5">
			Server Error!</div>
	</c:if>
	</section>


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