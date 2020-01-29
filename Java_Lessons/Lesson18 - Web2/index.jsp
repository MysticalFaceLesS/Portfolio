<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
h2 {
	text-align: left;
	padding-bottom: 20px;
}
label {
	min-width: 80px;
}
#form-container {
	width: 450px;
	margin: 20px auto;
}
</style>
</head>
<body>
	<div id="user-info">
		<h2>User Info</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Age</th><th>Phone</th><th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><span>${user.name}</span></td>
					<td><span>${user.age}</span></td>
					<td><span>${user.phone}</span></td>
					<td><span>${user.email}</span></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div id="form-container">
		<h2>Add user</h2>
		<form action="http://localhost:8080/web/user" method="POST">
			<div class="form-group"><label>Name:</label><input name="name" type="text"></div>
			<div class="form-group"><label>Age:</label><input name="age" type="text"></div>
			<div class="form-group"><label>Phone:</label><input name="phone" type="text"></div>
			<div class="form-group"><label>Email:</label><input name="email" type="text"></div>
			<div class="form-group"><input type="submit" class="btn btn-info" value="Save"></div>
		</form>
	</div>
</body>
</html>