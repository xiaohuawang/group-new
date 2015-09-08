<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/jquery.validate.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.14.0/additional-methods.min.js"></script>
<style>
	.item
	{
		padding:10px;
		margin-top:20px;
		border: 1px solid black;
		height: 250px;
	}
	img
	{
		margin:auto; 
		width:200px;
		display:block;
		float:right;
	}
</style>
<title>Product List</title>

</head>
<body>
	
	

	
	
	
	<c:forEach var="product" items="${list}">
		<div class="row col-sm-6 col-sm-offset-3">
		  <div class="item ">
				<div class="col-sm-5">
					<h2>${product.itemName}</h2>
					<p>${product.description}</p>
					<p>$ ${product.price}</p>
					
					<c:if test="${not empty user}">
						<c:if test="${product.avail eq 'Yes'}">
							<a href="#" class="btn btn-success">Item is being sold</a><br>
						</c:if>
 						<c:if test="${product.avail eq 'No'}">
							<a href="#" class="btn btn-danger">Item is not for Sale</a><br>
						</c:if> 
  						
  						
  						
  							
  						
  						
  						<a href="Editnew?itemId=${product.itemId}" class="btn btn-primary">Edit</a>
					</c:if>
				</div>
				<div class="col-sm-5 col-offset-5">
					<img src="${product.piclink}" alt="${product.itemName}" width=319 height=200/>
				</div>
		  </div>
		</div>
	</c:forEach>
	
</body>
</html>