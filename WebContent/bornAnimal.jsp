<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script>

function ValidateForm()
{
	if(f1.p_id.value=="")
	{
		alert("Please Select Animal Perent ID");
		f1.p_id.focus();
		return false;
	}
	
	if(f1.date.value=="")
  {
    alert("Please Enter Date");
    f1.date.focus();
    return false;
  }
    if(f1.avg_milk.value=="")
  {
    alert("Please Enter Animal Ideal Average Milk");
    f1.avg_milk.focus();
    return false;
  }
   if(f1.Actual_avg_milk.value=="")
  {
    alert("Please Enter Animal Actual Average Milk");
    f1.Actual_avg_milk.focus();
    return false;
  }
  else
    return true;
    }
	
	
		

function getr()
{
 	var selectedDesi = $("#designation_rank option:selected").text();
		
	//alert (selectedDesi);
	  $("#force_designation").val(selectedDesi);
}
</script>
<div class="ch-container">
    <div class="row">
    
<%@include file="leftMenu.jsp" %>

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            <div>
                <ul class="breadcrumb">
                    <li>
                        <a href="insertData?a=16">Home</a> 
                    </li>
                     <li>
                        <a href="">bornAnimal</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Born Animal Details</h2>
            </div>
            <div class="box-content">
           
            <form action="animal" method="post" name="f1" class="form-horizontal" onSubmit="return loginValidate()">
          	<table width="100%">
          	  <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
  
            <tr>
            <td >
                <label>Animal Type</label> 
				<input type="text" name="animalBread" class="form-control" readonly="readonly" value="${v.animalType}"/>
				 <input type="hidden" name="a_id" value="${v.a_id}">
				
            </td>
            <td>
                <label>Animal Type</label>
              	<input type="text" name="animalBread"  class="form-control" readonly="readonly" value="${v.animalBread}"/>
            </td>
            
             <td>
               <label>Animal Name</label>
                 <input type="text" name="animalName" class="form-control" readonly="readonly" value="${v.animalName}"/> 
             </td>
             <td>
                <label>Tag ID</label> 
				 <input type="text" name="animalTagid" class="form-control" readonly="readonly" value="${v.animalTagid}"/>
            </td> 
            </tr>
            </c:forEach>
</c:when>
</c:choose>
            <tr>
            <td >
                <label>Parent ID<font color="red">*</font></label> 
                 <input type="hidden" name="u_id" value=<%= session.getAttribute("u_id") %>>
				 <select class="form-control" name="p_id" id="p_id">
				 	<option value="">Select Animal Perent ID</option>
				 	  <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.pist}" var="c" varStatus="count">
	<option value="${c.a_id}">${c.animalTagid}</option>
</c:forEach>
</c:when>
</c:choose>
				 </select>
				 
            </td>
            <td>
                <label>Date of Brith<font color="red">*</font></label>
                <input type="Date" name="bornDate"  id="bornDate" class="form-control" >

            </td>
           
             <td>
               <label>Ideal Average Milk<font color="red">*</font>  </label>
                 <input type="text" name="bornidelMilk" id="bornidelMilk" class="form-control"  placeholder="Enter animal Ideal Average Milk" />
             </td>
             <tr>
              <td>
             <label>Actual Average Milk <font color="red">*</font> </label>
                 <input type="text" name="avg_milk" id="avg_milk" class="form-control"  placeholder="Enter Animal Actual Average Milk" />
             </td>
           </tr>
            
               
            </tr>
            
            <tr><td colspan="3">
           		<button type="submit" name="action" value="borned" class="btn btn-primary">Submit</button>
               
               <button type="reset" class="btn btn-primary">Clear</button>
            	       
      	     </td></tr>
                  
     		</table>
            </form>
                          
	
            </div>
          
        </div>
    </div>
    
   
    
</div>
    <!-- content ends -->
 
   </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->
</div>
<%@include file="footer.jsp" %>
