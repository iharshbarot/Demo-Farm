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
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
	
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
			<b>ANIMAL DETAIL REPORT CARD</b>
			
		</td>
	</tr>
	<tr>
		<td>
			<b>Animal Type</b>:&nbsp; ${v.animalType} 	
		</td>
		<td>
			<b>Animal Bread</b>:&nbsp; ${v.animalBread}
		</td>
	</tr>
	<tr>
		<td>
			<b>Animal Name</b>:&nbsp;${v.animalName} 	
		</td>
		<td>
			<b>Animal Tag Id</b>:&nbsp;${v.animalTagid}
		</td>
	</tr>
	<tr>
		<td>
			 <b>Born Date</b>:&nbsp; ${v.bornDate} 	
		</td>
		<td>
			<b>Perent Tag Id</b>:&nbsp;${v.perentId} 
		</td>
	</tr>
	<tr>
		<td>
			<b>Idel Milk</b>:&nbsp;${v.avg_milk} 	
		</td>
		<td>
			<b>Born Avrage Milk(Probaly)</b>:&nbsp; ${v.bornidelMilk} 
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<div class="container-fluid">
  			 <div class="text-center">
     		  <img src="https://chart.googleapis.com/chart?cht=qr&chl=Animal Type:${v.animalType},
    						Animal Tag Id:${v.animalTagid},
    						Animla Perent Tag Id:${v.perentId},
    						Animal Bread:${v.animalBread},
    						Avrage Milk:${v.avg_milk} Ltr/year,
    						Ideal Milk:${v.bornidelMilk} Ltr/year
    						****Born Animal****&chs=160x160&chld=L|0"
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