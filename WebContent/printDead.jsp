<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<style>
.qr-code {
  max-width: 200px;
  margin: 10px;
</style>
<script type="text/javascript">
var qrcode = new QRCode("qrcode");

$("#text").on("keyup", function () {
    qrcode.makeCode($(this).val());
}).keyup().focus();
</script>

<table width="100%">
	  <c:choose>
<c:when test="${list1 ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">
	
	<tr>
		<td style="text-align: center;" colspan="2">
			<h1>Hach Stable Manegment System</h1>
		</td>
	</tr>
	<tr>
		<td style="text-align: center;" colspan="2">
			<h1> <%= session.getAttribute("farmName") %></h1>
		</td>
	</tr>
	<tr>
		<td style="text-align: center;" colspan="2">
			<b>ANIMAL DEAD REPORT CARD</b>
			
		</td>
	</tr>
	<tr>
		<td>
			 <b>Animal Type</b>:&nbsp; ${v.animalType}
		</td>
		<td>
			<b>Animal Name</b>:&nbsp;${v.animalName}
		</td>
	</tr>
	<tr>
		<td>
			 <b>Animal Bread</b>:&nbsp; ${v.animalBread}
		</td>
		<td>
			<b>Animal Tag Id</b>:&nbsp;${v.animalTagid} 
		</td>
	</tr>
 <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

<tr>
		<td>
			 <b>Dead Date</b>:&nbsp;2018-11-15
		</td>
		<td>
			 <b>Dead Reason</b>:&nbsp; ${v.death_Reason} 
		</td>
	</tr>
	<tr>
		<td>
			 <b>Dorman By</b>:&nbsp;${v.dormanBy}
		</td>
	
	</tr>
</c:forEach>
</c:when>
<c:otherwise>
<div class="alert alert-danger">
              	<button type="button" class="close" data-dismiss="alert">&times;</button>
                	Record Not Found
                </div>

</c:otherwise>
</c:choose>
	<tr>
		<td colspan="2">
			<div class="container-fluid">
  			 <div class="text-center">
     		  <img src="https://chart.googleapis.com/chart?cht=qr&chl=harsh&chs=160x160&chld=L|0"
         										class="qr-code img-thumbnail img-responsive">
  				</div>
  				</div>
  				</td>
  	</tr>
	</c:forEach>
</c:when>
<c:otherwise>
<div class="alert alert-danger">
              	<button type="button" class="close" data-dismiss="alert">&times;</button>
                	Record Not Found
                </div>

</c:otherwise>
</c:choose>
</table>
<script>
	function PrintWindow() {                   
		window.print();           
		CheckWindowState();
		}
		
	function CheckWindowState()    {          
		if(document.readyState=="complete") {
		window.close();
		} else {          
		setTimeout("CheckWindowState()", 10)
		}
		}

	PrintWindow();
</script>