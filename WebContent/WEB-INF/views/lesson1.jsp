<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>
</head>


<script type="text/javascript">

var textmsg3 = "No NOT This TEXt";
console.log(textmsg3.toLowerCase() );

textshow1();
textshow2();

function textshow1(){
	document.write("<h2>JavaScript Running</h2>")
}

function textshow2(){
	msg1 = "<p>runtime JS complete 0012245</p>";
	document.write(msg1);
}

const myHeader = document.getElementsByTagName('h3');

console.log(myHeader);

</script>
<body>

<h3>Event CLICK</h3>

	<nav>
		<p>Link to other page<p>
	    <a href="index.xhtml" >sample_jsf_page</a>	    
	    
	    <p>Link to CSS Practice page<p>
	    <spring:url value="/about" var="about"/>
	    <a href="${about}" >about page</a>	
	    
	    <p>Back to first page<p>
	    <spring:url value="/" var="index1"/>
	    <a href="${index1}" >index page</a>	    	
	</nav>

</body>
</html>