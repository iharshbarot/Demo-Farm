<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
          	  <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
            <tr>
            <td >
                <label>Farm Name <font color="red">*</font></label> 
				 <input type="text" name="farm_name" id="farm_name" class="form-control" value="${v.farm_name}">
				 <input type="hidden" name="u_id" value=<%=(Integer)session.getAttribute("u_id") %>>
            </td>
            <td>
                <label>Farm Address <font color="red">*</font></label>
               
               <textarea class="form-control" name="farm_address" id="farm_address">
               ${v.farm_address}
               </textarea>
       
            </td>
             <td>
               <label>District  </label>
                 <input type="text" name="district" id="district" class="form-control" value="${v.distrit}" />
             </td>
             <td>
               <label>State  </label>
                 <input type="text" name="state" id="state" class="form-control"  value="${v.state}" >
             </td>
            </tr>
            <tr>
            <td >
                <label>Farm Email <font color="red">*</font></label> 
				 <input type="text" name="farm_email" id="farm_email" class="form-control" value="${v.farm_email}">
				 
            </td>
            <td>
               <label>Farm Contact Number<font color="red">*</font></label>
                <input type="text" name="farm_contact_no" id="farm_phone_no" class="form-control"  value="${v.farm_contact_no}" >
             </td>
           
              <td>
               <label>Farm Registration Number<font color="red">*</font></label>
                <input type="text" name="farm_reg_no" id="farm_reg_no" class="form-control"  value="${v.farm_reg_no}">
             </td>

             <td>
               <label>Owner Name<font color="red">*</font></label>
                <input type="text" name="owner_name" id="owner_name" class="form-control" value="${v.owner_name}">
             </td>
            </tr>
              <tr>
              	 <td>
               <label>Owner Contact Number<font color="red">*</font></label>
                <input type="text" name="owner_contact_no" id="owner_contact_no" class="form-control" value="${v.owner_contact_no}" >
             </td>

                    	 <td>
               <label>Owner ID proof<font color="red">*</font></label>
                <input type="file" name="oid" id="oid" class="form-control" >
             </td>
                    </tr>
            <tr><td colspan="3">
           		<button type="submit" name="action" value="update" class="btn btn-primary">Update</button>
               <button type="reset" name="cl" class="btn btn-primary">Clear</button>
            	       
      	     </td></tr>
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
