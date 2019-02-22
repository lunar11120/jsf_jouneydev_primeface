<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<h2>employee table</h2>
	
<div class="zui-wrapper">
    <div class="zui-scroller">
        <table class="zui-table">
            <thead>
                <tr>
                    <th class="zui-sticky-col">Name</th>
                    <th>Number</th>
                    <th>Position</th>
                    <th>Height</th>
                    <th>Born</th>
                    <th>Salary</th>
                    <th>Prior to NBA/Country</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="zui-sticky-col">DeMarcus Cousins</td>
                    <td>15</td>
                    <td>C</td>
                    <td>6'11"</td>
                    <td>08-13-1990</td>
                    <td>$4,917,000</td>
                    <td>Kentucky/USA</td>
                </tr>
                <tr>
                    <td class="zui-sticky-col">Isaiah Thomas</td>
                    <td>22</td>
                    <td>PG</td>
                    <td>5'9"</td>
                    <td>02-07-1989</td>
                    <td>$473,604</td>
                    <td>Washington/USA</td>
                </tr>
                <tr>
                    <td class="zui-sticky-col">Ben McLemore</td>
                    <td>16</td>
                    <td>SG</td>
                    <td>6'5"</td>
                    <td>02-11-1993</td>
                    <td>$2,895,960</td>
                    <td>Kansas/USA</td>
                </tr>

            </tbody>
        </table>
    </div>
</div>

 <div class="tab" id="ViewList" name="ViewList" style="width: 100%;">                
        <div class="zui-wrapper">
            <div class="zui-scroller">
                <div class="widget stacked widget-table action-table">
                    <div class="widget-content">
                        <table id="showData" class="table table-striped table-bordered">
                            <thead>
                                <tr >            
                                    <th align="center">PID</th>
                                    <th align="center">name</th>
                                    <th align="right">11</th>
                                    <th align="right">22</th>
                                    <th align="center" >stmt1</th>
                                    <th align="center" >stmt2</th>
                                    <th align="center" >remaek</th>  
                                </tr>
                            </thead>
                            <tbody id="myTable">

                                <tr>
                                    <td align="center" id="pid_ftable">5555</td>
                                    <td align="left">name emp kdkdjd000111</td>
                                    <td align="center">aaaa</td>
                                     <td align="center">aaaafffffff001111</td>
									 <td align="center">aaaaffffffffff</td>
									 <td align="center">aaaa</td>
                                      <td align="center">aaaa</td>
                                 </tr>
                                                                 <tr>
                                    <td align="center" id="pid_ftable">5555</td>
                                    <td align="left">name emp ffr5778y45</td>
                                    <td align="center">aaaa</td>
                                     <td align="center">data11</td>
									 <td align="center">data2</td>
									 <td align="center">bbb</td>
                                      <td align="center">aaaa</td>
                                 </tr>
                             </tbody>
                            </table>
                          </div>
                        </div>
                       </div>
                     </div>
                    </div>            


<table border="1">
  <tr>
    <th scope="col">Header</th>
    <th scope="col">Header</th>
    <th scope="col" colspan="2">Header</th>
  </tr>
  <tr>
    <th scope="row">wgattttt</th>
    <td>&nbsp;</td>
    <!-- The following two cells will appear under the same header -->
    <td>Col 1</td>
    <td>Col 2</td>
  </tr>
</table>


<table style="width: 75%; margin-top: 10px; font-size: 0.8em;" border="1px">
    <tr align="center" >
        <th style="padding:2.5px; width: 10%;" rowspan="2">Item No</th>
        <th style="padding:2.5px; width: 55%;" rowspan="2">DESCRIPTION</th>
        <th style="padding:2.5px;" rowspan="2">Quantity</th>
        <th style="padding:2.5px;" colspan="3">Rate per Item</th>
        <th style="padding:2.5px;" rowspan="2">AMOUNT</th>
    </tr>
    <tr>
        <th>Rs.</th>
        <th>P.</th>
        <th>Rs.</th>

    </tr>
</table>

	
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