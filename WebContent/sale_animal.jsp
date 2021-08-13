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
  if(f1.animal_type.value=="")
  {
    alert("Please Select Animal Sub Type");
    f1.animal_type.focus();
    return false;
  }
	
	
    if(f1.sale_avg_milk.value=="")
  {
    alert("Please Enter Animal Sale Time Average Milk");
    f1.sale_avg_milk.focus();
    return false;
  }
   if(f1.sale_owner_name.value=="")
  {
    alert("Please Enter sale Owner Name");
    f1.sale_owner_name.focus();
    return false;
  }
  if(f1.sale_phone_no.value=="")
  {
    alert("Please Enter sale Owner Name");
    f1.sale_phone_no.focus();
    return false;
  }
  if(isNaN(f1.sale_phone_no.value))
  {
    alert("Please Enter Only Digits for Mobile Number.");
    f1.sale_phone_no.focus();
    return false;
  }
  if(f1.sale_phone_no.value.length="")
  {
    alert("Mobile Number must be 10 digits only");
    f1.sale_phone_no.focus();
    return false;
  }
  if(f1.sale_avg_milk.value.length="")
  {
    alert("Please upload id proof");
    f1.sale_avg_milk.focus();
    return false;
  }
   if(f1.sale_avg_milk.value.length="")
  {
    alert("Please upload id proof");
    f1.sale_avg_milk.focus();
    return false;
  }
  if(f1.sale_doc.value.length="")
  {
    alert("Please upload Sale Document");
    f1.sale_doc.focus();
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
                        <a href="">sale_animal.jsp</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your sell Animal Details</h2>
            </div>
            <div class="box-content">
           
            <form action="sell" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
          	<table width="100%">
           <tr>
           	<td> 
                <label>Buyer Name <font color="red">*</font></label>
              	<input type="text" name="sell_owner_name" id="sell_owner_name" class="form-control"  placeholder="Enter Buyer Name" />
           		<input type="hidden" name="a_id" value="<%=Integer.parseInt(request.getParameter("id")) %>">
            </td>
            <td>
                <label>Buyer  Contact Number <font color="red">*</font></label>
              	<input type="text" name="sell_owner_contact_number" id="sell_owner_contact_number" class="form-control"  placeholder="Enter Buyer Contact Number" />
            </td>
            <td>
                <label>Buyer Address<font color="red">*</font></label>
              	<textarea cols="2" id="sell_owner_address" name="sell_owner_address" class="form-control"></textarea>
            </td>
           </tr>
           <tr>
           		<td>
                <label>Sell time avrage milk<font color="red">*</font></label>
              	<input type="text" name="sell_avg_milk" id="sell_avg_milk" class="form-control"  placeholder="Enter Buyer Sell avg milk" />
           		</td>
           		<td>
                <label>Selling Prices<font color="red">*</font></label>
              	<input type="text" name="sellingPrice" id="sellingPrice" class="form-control"  placeholder="Enter Selling Price" />
           		</td>
           		<td>
                <label>Selling Prices<font color="red">*</font></label>
              	<input type="date" name="sellDate" id="sellDate" class="form-control" />
           		</td>
           </tr>
           <tr>
           		<td>
           			 <label>Medical Issue<font color="red">*</font></label>
              		 <textarea cols="2" id="sellMedicalIssues" name="sellMedicalIssues" class="form-control"></textarea>
           		</td>
           		<td>
                <label>Id proof Of Buyer<font color="red">*</font></label>
              	<input type="file" name="sell_idProof" id="sell_idProof" class="form-control" />
           		</td>
           </tr>
           <tr><td colspan="3">
           		<button type="submit" name="action" value="sell" class="btn btn-primary">Sell Animal</button> 
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
