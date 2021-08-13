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
                        <a href="insertData?a=16">Home</a> 
                    </li>
                    
                    <li>
                 &nbsp;  &raquo;  &nbsp; <a href="">Change Password</a>
                    </li>
                     
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-3"></div>
    <div class="box col-md-6">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-edit"></i> Change Password </h2>
            </div>
            <div class="box-content">
            
			 <form  action="insertData" method="post" name="f1"  onSubmit="return ValidateForm()">
                  <table width="70%">
                  <tr>
                    <td width="50%">
                    
                        <label>Recent Password</label>
                        <input type="password" name="OldPassword" id="OldPassword" class="form-control" />
                        <input type="hidden" value=<%=request.getAttribute("password") %> id="existPass">
                        <input type="hidden" value=<%=session.getAttribute("u_id") %> name="u_id" >
                        
                    </td>
                    </tr>
                    <tr>
                     <td width="50%">
                        <label>New Password</label>
                        <input type="password" name="Password" id="Password" class="form-control" />
                    </td>
                    </tr>
                    
                     <tr>
                    <td width="50%">
                        <label>Confirm Password</label>
                        <input type="password" name="CPassword" id="CPassword" class="form-control" />
                    </td>
                    </tr>
                     
                      <tr><td>
                   <button type="submit" name="action" value="updatePassword" class="btn btn-primary">Chang Password</button>
                    <button type="reset" class="btn btn-primary">Cancel</button>
                <!--   <a href="complaintReport.php"><button type="button" class="btn btn-primary">View All</button></a>-->
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
</div>
<%@include file="footer.jsp" %>