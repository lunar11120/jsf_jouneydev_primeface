<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
		<%
			String pid = "reb555";
		    String fname = "Henry";
		    String lname = "ford";
		    String date1 = "";
	
		%>
<script type="text/javascript"> <!--w3school tutorial JavaScript-->


function loadDoc(){
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
	    if (this.readyState == 4 && this.status == 200) {
	        document.getElementById("demo").innerHTML = this.responseText;
	       }
	};
	
	  xhttp.open("GET", "ajax_info.txt", true);
	  xhttp.send();
}

function fg1(){
	var msg1 = "FG1 Blaze of fire in the Land";
	console.log(msg1);
}

function fg2(){
	var $pid = "<%=pid%>" ;
	var msg2 = "send Request";
	console.log(msg2);
	console.log($pid);
	
	var xhttp = new XMLHttpRequest();
	xhttp.open("GET", "w3ajax1?fg2="+$pid, true);
	xhttp.send();
}	

function fg3(){
	var $fname2 = "<%=fname%>" ;
	var $lname2 = "<%=lname%>" ;
	var msg3 = "send Request 2 param: runfg3";
	console.log(msg3);
	console.log($fname2);
	console.log($lname2);
	
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
        	console.log("====> ready State OK");
       }
    };
	
	
	var url = "w3ajax1?fname="+$fname2+"&lname="+$lname2 ;
	xhttp.open("GET", url , true);
	xhttp.send();
	
	//document.getElementById("tx02").value = "Johnny Bravo";
	

}

</script>

<body>

	<div>
		<p>W3 school ajax lesson1 test</p>
	</div>
	
	<div id="demo">
		<h2>Let Ajax chang this text</h2>
		<button type="button" onclick="loadDoc()">click load Ajax</button>
	</div>
	
	<div id="demo2">
		<h2>run function1</h2>
		<button type="button" onclick="fg1()">Run FG1</button>
	</div>	
	
	<div id="demo3">
		<h2>send Request</h2>
		<input name="tx01 id="tx01" size="15"  value="<%=pid%>" />

		<button type="button" onclick="fg2()">Run FG2 send request</button>
	</div>	
	
	<div id="demo4">
		<h2>send Request 2 parameter</h2>
		<input name="tx01 id="tx02" size="15"  value="" />

		<button type="button" onclick="fg3()">Run FG3 send 2 param $_request</button>
	</div>	
	
    <div id="demo5">
		<input name="tx05 id="tx02" size="15"  value="<%=date1 %>" />
	</div>		
	




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