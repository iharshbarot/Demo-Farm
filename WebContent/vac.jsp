<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="text/javascript">


function bornCow(id)
{
	
	
	   window.location.href= "animal?a=6&b=2&id="+id;
	
}
function bornBuffalo(id)
{
	
	
	   window.location.href= "animal?a=6&b=1&id="+id;
	
}
function purCow(id)
{
	
	   window.location.href= "animal?a=7&b=2&id="+id;
	
}
function purBuffalo(id)
{
	
	   window.location.href= "animal?a=7&b=1&id="+id;
	
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
             <h2><i class="glyphicon glyphicon-list"></i> Existing <%=request.getAttribute("type") %>  List</h2>
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
                    <th>age</th> 
                    <th>Action</th>
                </tr>
                </thead>
               <tbody>
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                          <c:set var="test" value="${v.age}"/>
      <%
        
        int age = (Integer)pageContext.getAttribute("test");  //in this line I got an  Exception.
       
        if(age<=1)
        {
       %>                
                            <tr>
                            
                               <td>${count.count}</td>
                	<td><c:out value="${v.animalBread}"></c:out></td>
                    <td>${v.animalTagid}</td>
                    <td>
                    ${v.age}
					</td>
                    				   <c:set var="animalType" value="${v.animalType}"/>
      <%
        
        String animalType = (String)pageContext.getAttribute("animalType");  //in this line I got an  Exception.
       
        String Buffalo = "Buffalo";
        if(animalType.equals(Buffalo))
        {
       %>   
                    <td>
           				<input type="button" value="Buffalo" class="btn btn-info" onclick="purBuffalo(${v.a_id})"/>
                    </td>
                  <%}
        else{
        
        	
        %>  
        <td>
      
           				<input type="button" value="Cow" class="btn btn-info" onclick="purCow(${v.a_id})"/>
                    </td><%} %>
                    
                     </tr>
                     <%} %>
                     
</c:forEach>
</c:when>
</c:choose>
<c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">
                          <c:set var="test" value="${v.age}"/>
      <%
        
        int age = (Integer)pageContext.getAttribute("test");  //in this line I got an  Exception.
       
        if(age<=1)
        {
       %>           <tr>
                            
                               <td>${count.count}</td>
                	<td><c:out value="${v.animalBread}"></c:out></td>
                    <td>${v.animalTagid}</td>
                    <td>
                    ${v.age}
					</td>
					
					
					   <c:set var="animalType" value="${v.animalType}"/>
      <%
        
        String animalType = (String)pageContext.getAttribute("animalType");  //in this line I got an  Exception.
       	String Buffalo = "Buffalo";
        if(animalType.equals(Buffalo))
        {
        	
       %>   
     
                    <td>
           				<input type="button" value="Buffalo" class="btn btn-info" onclick="bornBuffalo(${v.a_id})"/>
                    </td>
                  <%}
        else{
        	out.println(animalType);
        %>  
        
        <td>
           				<input type="button" value="Cow" class="btn btn-info" onclick="bornCow(${v.a_id})"/>
                    </td><%} %>
                     </tr>
                     <%} %>
                     
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