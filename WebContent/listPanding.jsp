<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="text/javascript">
function view(id)
{
	
		   window.location.href= "insertData?a=12&b=2&id="+id;

}
function active(id)
{
	if(confirm("You Want to active this Account"))
		{
		   window.location.href= "insertData?a=5&id="+id;
		}
}
function del(id)
{
	if(confirm("You Want to Delete this Account"))
		{
		   window.location.href= "insertData?a=1&id="+id;
		}
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
                        <a href="dashboard.jsp">Home</a> 
                    </li>
                     <li>
                     &nbsp;  &raquo;  &nbsp; <a href="">View</a>
                    </li>
                    
                    <li>
                     &nbsp;  &raquo;  &nbsp; <a href="#">Panding Farm list</a>
                    </li>
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-header well">
             <h2><i class="glyphicon glyphicon-list"></i> Panding Farm List</h2>
                 <div class="box-icon">
                </div>
            </div>
            <div class="box-content">
         
        
             	<table class="table table-striped table-bordered bootstrap-datatable  datatable responsive">
                <thead>
                <tr>
                	<th>SrNo</th>
                    <th>Farm Name</th>
                    <th>Owner Name</th>
                    <th>Farm Address</th>
                    <th>Farm Contact Number</th> 
                    <th>Action</th>
                </tr>
                </thead>
               <tbody>
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                                         
                            <tr>
                               <td>${count.count}</td>
                	<td><c:out value="${v.farm_name}"></c:out></td>
                    <td>${v.owner_name}</td>
                    <td>${v.farm_address}</td>
                    <td>${v.farm_contact_no}</td>
                    <td>
              <input type="button" value="View Details" class="btn btn-info" onclick="view(${v.u_id})" />     
            <input type="button" value="Active" class="btn btn-success" onclick="active(${v.u_id})" />
            <input type="button" value="Delete" class="btn btn-danger" onclick="del(${v.u_id})" />
           
           
            
                    </td>
                     
</c:forEach>
</c:when>
<c:otherwise>
<div class="alert alert-danger">
              	<button type="button" class="close" data-dismiss="alert">&times;</button>
                	Record Not Found
                </div>

</c:otherwise>
</c:choose>
                                        </tbody> </table>
 
              
                
             
             
            </div>
        </div>
    </div>
</div>
    <!-- content ends -->
   </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->
</div>
<%@include file="footer.jsp" %>