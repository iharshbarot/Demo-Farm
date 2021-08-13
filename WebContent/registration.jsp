<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<div class="ch-container">
    <div class="row">


        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            <div>
                <ul class="breadcrumb">
                   
                     <li>
                        <a href="registration.jsp">Registration Page</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Registration Details</h2>
            </div>
            <div class="box-content">
           
            <form action="insertData" method="post" name="f1" class="form-horizontal" onSubmit="return registration()">
          	<table width="100%">
            <tr>
            <td >
                <label>Farm Name <font color="red">*</font></label> 
				 <input type="text" name="farm_name" id="farm_name" class="form-control" placeholder="Enter farm name">
				 
            </td>
            <td>
                <label>Farm Address <font color="red">*</font></label>
               
               <textarea class="form-control" name="farm_address" id="farm_address"></textarea>
       
            </td>
             <td>
               <label>District  </label>
                 <input type="text" name="district" id="district" class="form-control"  placeholder="Enter District" />
             </td>
             <td>
               <label>State  </label>
                 <input type="text" name="state" id="state" class="form-control"  placeholder="Enter state" >
             </td>
            </tr>
            <tr>
            <td >
                <label>Farm Email <font color="red">*</font></label> 
				 <input type="text" name="farm_email" id="farm_email" class="form-control"  placeholder="Enter farm Email">
				 
            </td>
            <td>
               <label>Farm Contact Number<font color="red">*</font></label>
                <input type="text" name="farm_contact_no" id="farm_phone_no" class="form-control"  placeholder="Enter farm contact number" >
             </td>
           
              <td>
               <label>Farm Registration Number<font color="red">*</font></label>
                <input type="text" name="farm_reg_no" id="farm_reg_no" class="form-control"  placeholder="Farm Registration Numbe">
             </td>

             <td>
               <label>Owner Name<font color="red">*</font></label>
                <input type="text" name="owner_name" id="owner_name" class="form-control" placeholder="Enter Owner Name">
             </td>
            </tr>
              <tr>
              	 <td>
               <label>Owner Contact Number<font color="red">*</font></label>
                <input type="text" name="owner_contact_no" id="owner_contact_no" class="form-control" placeholder="Enter Owner Contact Number" >
             </td>
              <td>
               <label>Username<font color="red">*</font></label>
                <input type="text" name="username" id="username" class="form-control" placeholder="Enter Username " >
             </td>
              <td>
               <label>Password<font color="red">*</font></label>
                <input type="password" name="password" id="password" class="form-control" placeholder="Enter password">
             </td>
              <td>
               <label>Confirm Password<font color="red">*</font></label>
                <input type="password" name="re-password" id="rpassword" class="form-control" placeholder="Enter Confirm password" >
             </td>
              </tr>       
                 
            <tr><td colspan="3">
           		<button type="submit" name="action" value="registartion" class="btn btn-primary">Add</button>
               <button type="reset" name="cl" class="btn btn-primary">Clear</button>
            	       
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
