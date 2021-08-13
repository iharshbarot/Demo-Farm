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
             <h2><i class="glyphicon glyphicon-list"></i>  <%=request.getAttribute("type") %>  Milk Update <% 
             int c = Integer.parseInt(request.getParameter("c"));
             if(c == 1)
             {
            	 out.println("(Morning Shift)");
             }
             else
             {
            	 out.println("(Evening Shift)");
             }
             %></h2>
                 <div class="box-icon">
                </div>
            </div>
            <div class="box-content">
       
        <form action="milkController" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
             	<table class="table table-striped table-bordered bootstrap-datatable  datatable responsive">
                <thead>
                <tr>
               
 

                	<th>SrNo</th>
                    <th>Animal Bread</th>
                    <th>Animal Tag Id</th>
                    <th>Milk Entry</th> 
                   
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
                    <td><input type="hidden" value="${v.a_id}" name="a_id"><input type="text" name="milk">
                   <input type="hidden" value="<%=Integer.parseInt(request.getParameter("c")) %>" name="Shift">
                  
 				
                    </td>
                   </tr>
                   
</c:forEach>
</c:when>
</c:choose>
			      </tbody> </table>
 <div style="padding-left: 35%">
 				<input type="Date" name="date" >
				<button type="submit" name="action" value="insert" class="btn btn-primary">update Milk</button> 
                <button type="reset" class="btn btn-primary">Clear</button> 
 </div>
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