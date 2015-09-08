<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.min.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.min.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
<title>Edit Item</title>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div class="panle panel-primary col-sm-6 col-sm-offset-3">
		<div class="panel-heading">Edit Item</div>

		<div class="panel-body">
			<c:if test="${not empty errorMessage}">
				<div class="alert alert-danger">
					<c:out value="${errorMessage}" />
				</div>
			</c:if>
			<form role="form" action="Editnew" method="Post">
				<div class="form-group">
					<label for="itemName">Product Name:</label> <input type="text"
						class="form-control" name="itemName"
						value="${goshitem.itemName}" required />
				</div>

		
		   
		
		
		
           
              	<div class="form-group">
					<label for="piclink">Image Link:</label> <input type="text"
						class="form-control" name="piclink" value="${goshitem.piclink}"
						required />
				</div>

				<div class="form-group">
					<label for="description">Description:</label> <input
						type="text" class="form-control" name="description"
						value="${goshitem.description}" required />
				</div>

			

				<div class="form-group">
					<label for="price">Price:</label> <input type="text"
						class="form-control" name="price" value="${goshitem.price}"
						required />
				</div>

				<div class="form-group">
					<label for="shipCost">shipCost:</label> <input type="text"
						class="form-control" name="shipCost"
						value="${goshitem.shipCost}" required />
				</div>
           
           
           <div class="form-group">
					<label for="avail">avail:</label> <input type="text"
						class="form-control" name="avail"
						value="${goshitem.avail}" required />
				</div>
           
           
           <div class="form-group">
					<input
						type="hidden" name="itemId"
						value="${goshitem.itemId}"  />
				</div>



				<div class="form-group">
					<button type="submit" value="submit" class="btn btn-default">Edit
						Item</button>


				</div>

			</form>

		</div>
	</div>
</body>
</html>