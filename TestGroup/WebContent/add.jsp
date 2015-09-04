<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form role="form" action="ConfirmServlet" method="POST">
    <div class="form-group">
      <label for="itemName">itemName:</label>
      <input type="text" class="form-control" name="itemName" id="itemName">
    </div>
    
    <div class="form-group">
      <label for="description:">description:</label>
      <input type="text" class="form-control" name="description:" id="description:">
    </div>
    
    <div class="form-group">
      <label for="price">price:</label>
      <input type="text" class="form-control" name="price" id="price">
    </div>
    
    <div class="form-group">
      <label for="shipcost">shipCost:</label>
      <input type="text" class="form-control" name="shipCost" id="shipCost">
    </div>
    
    <div class="form-group">
      <label for="avail">avail:</label>
      <input type="text" class="form-control" name="avail" id="avail">
    </div>
    
    <div class="form-group">
      <label for="piclink">piclink:</label>
      <input type="text" class="form-control" name="piclink" id="piclink">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
    
   
  </form>
</body>
</html>