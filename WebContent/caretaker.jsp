<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<div class="ch-container">
    <div class="row">    
<%@include file="leftMenu.jsp" %>

        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            <div>
                <ul class="breadcrumb">
                    <li>
                        <a href="dashboard.jsp">Home</a> 
                    </li>
                     <li>
                      &nbsp;  &raquo;  &nbsp;   <a href="">Add New Caretackers</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Caretakers Details</h2>
            </div>
            <div class="box-content">
           
            <form action="caretakers" method="post" name="f1" class="form-horizontal" > 
            <table width="100%">
            <tr>
            <td >
                <label>Name Of Caretaker<font color="red">*</font></label>
                <input type="text" name="caretakersName"  id="caretakersName" class="form-control" placeholder="Enter Name of Caretaker" >
				<input type="hidden" name="u_id" value=<%= session.getAttribute("u_id") %>>
            </td>
        
          
            <td >
                <label>Contact Number <font color="red">*</font></label> 
         <input type="text" name="caretakersContact" id="caretakersContact" class="form-control" placeholder="Entet Contact Number">
         
            </td>
            <td >
                <label>Caretakers Address <font color="red">*</font></label> 
         <textarea  cols="2" name="caretakers_address" id="caretakers_address" class="form-control" placeholder="Enter Caretackers Address">
         
         </textarea>
         
            </td>
          </tr> 
            <tr><td colspan="3">
           		<button type="submit" name="action" value="insert" class="btn btn-primary" onSubmit="return caretakers()">Submit</button>
               
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
