<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<h1> ${v.farm_name}</h1>
		</td>
	</tr>
	<tr>
		<td style="text-align: center;" colspan="2">
			<b>Farm Owner Name:</b>${v.owner_name} 
			
		</td>
	</tr>
	<tr>
		<td>
			<br><b>Farm Contact Number:</b>${v.farm_contact_no} 	
		</td>
		<td>
			<br><b>Owner Contact Number:</b>${v.owner_contact_no}
		</td>
	</tr>
	<tr>
		<td>
			<br><b>State:</b>${v.state} 	
		</td>
		<td>
			<br><b>District:</b>${v.distrit}
		</td>
	</tr>
	<tr>
		<td>
			<br><b>Farm Address:</b>${v.farm_address} 	
		</td>
		<td>
			<br><b>Farm E-mail:</b>${v.farm_email}
		</td>
	</tr>
	<tr>
		<td>
			<br><b>Farm Registration Number:</b>${v.farm_reg_no} 	
		</td>
		<td>
			 <%if(Integer.parseInt(request.getParameter("b")) == 1) {%>
                  <br><b>Status</b>: Active
                    <%}else if(Integer.parseInt(request.getParameter("b")) == 2){ %>
                     <br><b>Status</b>: Panding
                     <%} 
                    else
                     {%>
                    <br><b>Status</b>: Deactive
                     <%} %>
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