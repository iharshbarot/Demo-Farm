<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="text/javascript">

function vew(id)
{
	window.location.href= "heatphase?a=3&id="+id;
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
                     &nbsp;  &raquo;  &nbsp; <a href="">View</a>
                    </li>
                    
                    <li>
                     &nbsp;  &raquo;  &nbsp; <a href="#">Pregnancy List</a>
                    </li>
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-header well">
             <h2><i class="glyphicon glyphicon-list"></i> <%=request.getAttribute("type") %> pregnancy List </h2>
                 <div class="box-icon">
                </div>
            </div>
            <div class="box-content">
       
        
             	<table class="table table-striped table-bordered bootstrap-datatable  datatable responsive">
                <thead>
                <tr>
               
 

                	<th>SrNo</th>
                    <th>Animal Bread</th>
                    <th>Animal Tag Id</th>
                    <th>Cloase Heat Phase</th> 
                   
                </tr>
                </thead>
               <tbody>
               
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                                         
                            <tr>
                               <td>${count.count}</td>
                	<td><c:out value="${v.animalBread}"></c:out></td>
                    <td>${v.animalTagid}</td>
                    <td>
                 			<input type="button" value="View" class="btn btn-info" onclick="vew(${v.a_id})"/>
                    </td>
                   </tr>
                   
</c:forEach>
</c:when>
</c:choose>
			      </tbody> </table>
 <div style="padding-left: 35%">
 				
 </div>
            </div>
        </div>
    </div>
</div>
    <!-- content ends -->
   </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->
</div>
<%@include file="footer.jsp" %>