<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script>

function ValidateForm()
{
	if(f1.a_id.value=="")
	{
		alert("Please Select Animal Animal ID");
		f1.a_id.focus();
		return false;
	}
  if(f1.animal_name.value=="")
  {
    alert("Please Select Animal Name");
    f1.animal_name.focus();
    return false;
  }
	
	
    if(f1.D_date.value=="")
  {
    alert("Please Enter Animal Death Date");
    f1.D_date.focus();
    return false;
  }
   if(f1.Reason_death.value=="")
  {
    alert("Please Enter Reason of death");
    f1.Reason_death.focus();
    return false;
  }
  if(f1.Dorman_by.value=="")
  {
    alert("Please Enter Who declared death ");
    f1.Dorman_by.focus();
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
                        <a href="">Home</a> 
                    </li>
                     <li>
                        <a href="">death_animal.jsp</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Death Animal Details</h2>
            </div>
            <div class="box-content">
           
            <form action="sell" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
          	<table width="100%">
            <tr>
        	  <td>
                <label>Date of Death<font color="red">*</font></label>
                <input type="Date" name="Death_date"  id="Death_date" class="form-control"  >
                <input type="hidden" name="a_id" value="<%=Integer.parseInt(request.getParameter("id")) %>">

            </td>
            <td >
                <label>Reason Of Death <font color="red">*</font></label> 
       			<textarea rows="2" cols="2" name="death_Reason" id="death_Reason" class="form-control"></textarea>
         
            </td>
            <td >
                <label>Dorman By <font color="red">*</font></label> 
         		<input type="text" name="dormanBy" id="dormanBy" class="form-control" placeholder="Enter Dorman By ">
         
            </td>
            
          </tr> 
            <tr><td colspan="3">
           		<button type="submit" name="action" value="deth" class="btn btn-primary">Deth Animal</button>
               
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
<%@include file="footer.jsp" %>