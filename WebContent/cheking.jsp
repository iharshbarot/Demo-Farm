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
	
	
  if(f1.date.value=="")
  {
    alert("Please Enter Date");
    f1.date.focus();
    return false;
  }
  if(f1.Remark.value=="")
  {
    alert("Please Enter Some Remark");
    f1.Remark.focus();
    return false;
  }
  if(f1.certificate.value=="")
  {
    alert("Please upload certificate ");
    f1.certificate.focus();
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
                        <a href="">cheking.jsp</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Animal Cheaking Details</h2>
            </div>
            <div class="box-content">
           
            <form name="f1" role="form" action="" method="post" enctype="multipart/form-data" onSubmit="return ValidateForm()">
          	<table width="100%">
            <tr>
            <td >
                <label>Animal Type<font color="red">*</font></label> 
				 <select class="form-control" name="a_id" id="a_id">
				 	<option value="">Select Animal</option>
				 	<option value="0">T1</option>
				 	<option value="1">T2</option>
				 </select>
				 
            </td>
            <td>
             <label>Animal Name<font color="red">*</font></label> 
            <select class="form-control" name="animal_name" id="animal_name">
          <option value="">Select Animal Name</option>
          <option value="0">T1</option>
          <option value="1">T2</option>
         </select>
       </td>
          <td>
                <label>Date<font color="red">*</font></label>
                <input type="Date" name="date"  id="date" class="form-control" placeholder="Enter date of cheaking" >

            </td>
          </tr>
          <tr>
            
            <td >
               <label>Remark <font color="red">*</font></label> 
         <input type="text" name="Remark" id="Remark" class="form-control" placeholder="Enter Remark">
         
            </td>
             <td>
                 <label> certificate<font color="red">*</font></label>
                <input type="file" name="certificate" id="certificate" class="form-control" placeholder="Enter Report or certificate">
              </td>
          </tr> 


          
             
            
            <tr><td colspan="3">
           		<button type="submit" name="purchase" class="btn btn-primary">Submit</button>
               
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