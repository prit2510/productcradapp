<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-3">
<h1 class="text-center mb-3">Fill the product detail</h1>
<form action="handle-product" method="post">
  <div class="form-group">
    <label for="name">Name</label>
    <input type="text" 
    class="form-control" 
    id="name" 
    aria-describedby="emailHelp" 
    name="Name"
    placeholder="Enter product name">
  </div>
  
  <div class="form-group">
    <label for="description">Example textarea</label>
    <textarea 
    class="form-control" 
    id="description" 
    name="description"
    placeholder="Enter product description here"
    rows="5"
    ></textarea>
  </div>
  
  <div class="form-group">
    <label for="price">product price</label>
    <input type="text" 
    class="form-control" 
    id="price"  
    name="price"
    placeholder="Enter product price">
  </div>
  
  <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</div>


</div>
</div>
</body>
</html>