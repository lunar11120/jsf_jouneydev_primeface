<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<style type="text/css">
.zui-table {
    border: none;
    border-right: solid 1px #DDEFEF;
    border-collapse: separate;
    border-spacing: 0;
    font: normal 13px Arial, sans-serif;
}
.zui-table thead th {
    background-color: #DDEFEF;
    border: none;
    color: #336B6B;
    padding: 10px;
    text-align: left;
    text-shadow: 1px 1px 1px #fff;
    white-space: nowrap;
}
.zui-table tbody td {
    border-bottom: solid 1px #DDEFEF;
    color: #333;
    padding: 10px;
    text-shadow: 1px 1px 1px #fff;
    white-space: nowrap;
}
.zui-wrapper {
    position: relative;
}
.zui-scroller {
    margin-left: 141px;
    overflow-x: scroll;
    overflow-y: visible;
    padding-bottom: 5px;
    width: 300px;
}
.zui-table .zui-sticky-col {
    border-left: solid 1px #DDEFEF;
    border-right: solid 1px #DDEFEF;
    left: 0;
    position: absolute;
    top: auto;
    width: 120px;
}
</style>
</head>
<body>
	<h2>Spring JSF Integration Project</h2>
	
	<div class="container">
		
		<h2>Current Emp : from FrontController</h2>
		<ul class="list-group">
  			<li class="list-group-item"><label>EMP ID:</label><span>${employee.employeeId }</span></li>
  			<li class="list-group-item"><label>NAme:</label><span>${employee.employeeName }</span></li>
		</ul>
		
	</div>
		
	
   <div class="container">
		<h2>${msg1}</h2>
		<%
         Date date = new Date();
	 	 out.print( "<p align=\"center\">current date : Date java</p>");
         out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
        %>
	</div>	
	
	<nav>
		<p>Link to other page<p>
	    <a href="index.xhtml" >sample_jsf_page</a>	    
	    
	    <p>Link to CSS Practice page<p>
	    <spring:url value="/about" var="about"/>
	    <a href="${about}" >about page</a>
	    
	    <p>go w3school ajax 1<p>
	    <spring:url value="/w3ajax1" var="w3ajax1"/>
	    <a href="${w3ajax1}" >w3school ajax 1</a>	
	    
	    <p>Link lesson1<p>
	    <spring:url value="/lesson1" var="lesson1"/>
	    <a href="${lesson1}" >employee table</a>	        
	    
	    <p>Link emp test table<p>
	    <spring:url value="/emp" var="emp"/>
	    <a href="${emp}" >employee table</a>	 	    	
	</nav>
</body>
</html>