<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script>

function ValidateForm()
{
	if(f1.h_one.value=="")
	{
		alert("Please Enter Food for Heatphase Interval one");
		f1.h_one.focus();
		return false;
	}
  if(f1.h_two.value=="")
  {
    alert("Please Enter Food for Heatphase Interval two");
    f1.h_two.focus();
    return false;
  }if(f1.p_one.value=="")
  {
    alert("Please Enter Food for Pregnant Interval one");
    f1.p_one.focus();
    return false;
  }if(f1.p_two.value=="")
  {
    alert("Please Enter Food for Pregnant Interval Two");
    f1.p_two.focus();
    return false;
  }if(f1.p_three.value=="")
  {
    alert("Please Enter Food for Pregnant Interval Three");
    f1.p_three.focus();
    return false;
  }if(f1.p_four.value=="")
  {
    alert("Please Enter Food for Pregnant Interval Four");
    f1.p_four.focus();
    return false;
  }if(f1.p_five.value=="")
  {
    alert("Please Enter Food for Pregnant Interval five");
    f1.p_five.focus();
    return false;
  }if(f1.Norml_food.value=="")
  {
    alert("Please Enter Food for Norml");
    f1.Norml_food.focus();
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
                        <a href="">food.jsp</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i>Animal Food Details</h2>
            </div>
            <div class="box-content">
           
            <form name="f1" role="form" action="" method="post" enctype="multipart/form-data" onSubmit="return ValidateForm()">
          	<table width="100%">
            <tr>
            <td >
               <label>Heatphase Interval One <font color="red">*</font></label> 
         <input type="text" name="h_one" id="h_one" class="form-control" placeholder="Enter Food for Heatphase Interval one">
          </td>
        </tr>
          <tr>
           <td >
               <label>Heatphase Interval Two <font color="red">*</font></label> 
         <input type="text" name="h_two" id="h_two" class="form-control" placeholder="Enter Food for Heatphase Interval two">
          </td>
        </tr>
        <tr>
           <td >
               <label>Pregnant Interval One <font color="red">*</font></label> 
         <input type="text" name="p_one" id="p_one" class="form-control" placeholder="Enter Food for Pregnant Interval one">
          </td>
        </tr>
        <tr>
           <td >
               <label>Pregnant Interval Two <font color="red">*</font></label> 
         <input type="text" name="p_two" id="p_two" class="form-control" placeholder="Enter Food for Pregnant Interval two">
          </td></tr>
           <tr><td >
               <label>Pregnant Interval Three <font color="red">*</font></label> 
         <input type="text" name="p_three" id="p_three" class="form-control" placeholder="Enter Food for Pregnant Interval Three">
          </td></tr>
           <tr><td >
               <label>Pregnant Interval Four <font color="red">*</font></label> 
         <input type="text" name="p_four" id="p_four" class="form-control" placeholder="Enter Food for Pregnant Interval Four">
          </td></tr>
           <tr><td >
               <label>Pregnant Interval five <font color="red">*</font></label> 
         <input type="text" name="p_five" id="p_five" class="form-control" placeholder="Enter Food for Pregnant Interval five">
          </td></tr>
           <tr><td >
               <label>Norml <font color="red">*</font></label> 
         <input type="text" name="Norml_food" id="Norml_food" class="form-control" placeholder="Norml  Food">
          </td></tr>
          

          
        


          
             
            
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
