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
			<b>Animal Name</b>:&nbsp;${v.animalName}
		</td>
	</tr>
	<tr>
		<td>
			<b>Owner Name</b>:&nbsp;${v.owner_name} 	
		</td>
		<td>
			<b>Owner Contact Number</b>:&nbsp;${v.owner_contact_number}
		</td>
	</tr>
	<tr>
		<td>
			<b>Owner Address</b>:&nbsp;${v.owner_add} 	
		</td>
		<td>
			<b>Animal DOB</b>:&nbsp;${v.dob} 
		</td>
	</tr>
	<tr>
		<td>
			<b>Purchase DOB</b>:&nbsp;${v.pur_dob} 	
		</td>
		<td>
			<b>Average Milk</b>:&nbsp;${v.avgMilk} 
		</td>
	</tr>
	<tr>
		<td>
			<b>Ideal Milk</b>:&nbsp;${v.idealMilk} 	
		</td>
		<td>
			<b>Before Pregnancy</b>:&nbsp;${v.beforePregnancy}
		</td>
	</tr>	
	<tr>
		<td>
			<b>Medical Issue</b>:&nbsp;${v.medical_issues}
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<div class="container-fluid">
  			 <div class="text-center">
     		  <img src="https://chart.googleapis.com/chart?cht=qr&chl=Animal Type:${v.animalType},
     																Animal Bread: ${v.animalBread},
     																Animal Tag ID:${v.animalTagid},
     																Animal DOB:${v.dob},
     																Animal Purches Date:${v.pur_dob},
     																Animal Avrage Milk:${v.avgMilk}Ltr/year,
     																Animal Ideal Milk:${v.idealMilk}Ltr/year	
     																****Purchesd Animal*****
     																&chs=160x160&chld=L|0"
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