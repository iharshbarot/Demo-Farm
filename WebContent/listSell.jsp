<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="text/javascript">

function vew(id)
{
	window.location.href= "sell?a=4&id="+id;
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
                     &nbsp;  &raquo;  &nbsp; <a href="#">Existing Farm list</a>
                    </li>
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-header well">
             <h2><i class="glyphicon glyphicon-list"></i> Sell <%=request.getAttribute("type") %>  List</h2>
                 <div class="box-icon">
                </div>
            </div>
            <div class="box-content">
         
        
             	<table class="table table-striped table-bordered bootstrap-datatable  datatable responsive">
                <thead>
                <tr>
                	<th>SrNo</th>
                    <th>Animal Bread</th>
                    <th>Animal Name</th>
                    <th>Animal Tag Id</th>
                    <th>Purched/Born</th> 
                    <th>Action</th>
                </tr>
                </thead>
               <tbody>
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                                         
                            <tr>
                               <td>${count.count}</td>
                	<td><c:out value="${v.animalBread}"></c:out></td>
                    <td>${v.animalName}</td>
                    <td>${v.animalTagid}</td>
                    <td>
						<script type="text/javascript">
                    var active = ${v.animalEntry}
                    if(active == 0)
                    	{
                    	 document.write("<b>Purched</b>");
                    	}
                    else
                    	{
                    	document.write("<b>Born</b>");
                    	}
                    </script>
					</td>
                    <td>
           				<input type="button" value="View" class="btn btn-info" onclick="vew(${v.a_id})"/>
        			  
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