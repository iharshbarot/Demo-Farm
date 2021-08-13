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
                        <a href="insertData?a=16">Home</a> 
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
             <h2><i class="glyphicon glyphicon-list"></i> <%=request.getAttribute("type") %> Heatphase </h2>
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
                    <form action="heatphase" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
                    <input type="hidden" value="${v.a_id}" name="a_id">
                    	<div class="col-md-12">
                    	<div class="col-md-4">
						<label>End Date: <font color="red">*</font></label><input type="date" name="date" class="form-control">
						</div>
						<div class="col-md-4">
						<label>Sex: <font color="red">*</font></label><input type="text" name="sexualActivity"class="form-control">
						</div>
						<div class="col-md-4">
						<label>pregnancy: <font color="red">*</font></label>
							<select name="preg" class="form-control">
							<option value="">Select</option>
							<option value="0">No</option>
							<option value="2">Yes</option>	
							</select>
						</div>
						<button type="submit" name="action" value="close" class="btn btn-primary">close Heatphase</button>
						</div>
						</form>
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