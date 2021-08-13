<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="text/javascript">
function Deactive(id)
{
	if(confirm("You Want to Deactive this Account"))
		{
		   window.location.href= "insertData?a=3&id="+id;
		}
}
function deleteDataa(id)
{
	if(confirm("kharekhar temporary udad vo 6 patang??"))
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
                     &nbsp;  &raquo;  &nbsp; <a href="#">Existing Caretakers list</a>
                    </li>
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-header well">
             <h2><i class="glyphicon glyphicon-list"></i> Existing Farm List</h2>
                 <div class="box-icon">
                </div>
            </div>
            <div class="box-content">
         
        
             	<table class="table table-striped table-bordered bootstrap-datatable  datatable responsive">
                <thead>
                <tr>
                	<th>SrNo</th>
                    <th>Caretakers Name</th>
                    <th>Caretakers Contact Number</th>
                    <th>Caretakers Address</th> 
                    <th>Action</th>
                </tr>
                </thead>
               <tbody>
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                                         
                            <tr>
                               <td>${count.count}</td>
                	<td><c:out value="${v.caretakersName}"></c:out></td>
                    <td>${v.caretakersContact}</td>
                    <td>${v.caretakers_address}</td>
                    <td>
                   
          <input type="button" value="Edit" class="btn btn-info" onclick="Deactive(${v.c_id})" />
            <input type="button" value="Deactive" class="btn btn-info" onclick="Deactive(${v.c_id})" />
           <a class="btn btn-danger" onClick="return ConfirmDel('')" href="?did=<?php echo $res['profile_id']; ?>" >
               Delete
            </a> 
           
            
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
<%@include file="footer.jsp" %>