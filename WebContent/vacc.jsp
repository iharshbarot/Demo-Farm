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
                   
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-content">
         
       <div class="double">
        <form action="animal" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()"> 
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

<div>
	<h2 style="padding-left: 30%"><b> Welcome to <%= session.getAttribute("farmName") %></b></h2>
	<h4 style="font-style: italic; padding-left: 40%"><b></b></h4>
	
</div>

    <div style="padding-top: 25Px;padding-bottom: 25Px" class="fontSize">
       <div class="side">
           <div style="float:left; width: 50%;">
              <b>Animal Bread</b>:&nbsp; ${v.animalBread}
            </div>
             <div>
                <b>Animal Tag Id</b>:&nbsp;${v.animalTagid}
              </div>  
       </div>
           <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Animal Month</b>:&nbsp;${v.month}
              </div>
              <div>
                <b>Animal Birth date</b>:&nbsp;${v.dob}
              </div>
              <div>
                  
              </div>   		
            </div>
</div>
         
             <input type="hidden" value="${v.a_id}" name="a_id">	
</c:forEach>
</c:when>
</c:choose>

<table border="1 px solid" width="45%" style="float: left;margin-top: 25px">
  

    <thead>
    <tr>
    	<td colspan="3" style="text-align: center;">	
    		<b>Vaccination Schedual</b>
    	</td>
    </tr>
    	<tr>
    		<td>
    			<b>Sr.No</b>
    		</td>
    		<td>
    			<b>Age</b>
    		</td>
    		<td>
    			<b>Vaccination Type</b>
    		</td>
    	</tr>
    </thead>
     <tbody>   <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">
              <tr>
              <td>
              ${count.count}
              </td>
              <td>
               ${v.age} - Month
              </td>
              	<td>
              <input type="checkbox" name="v_id" value="${v.v_id}"> ${v.vaccination}
                 </td>
                 </tr>
	
</c:forEach>
</c:when>
</c:choose>
<tr>
	<td colspan="3">
 <button type="submit" name="action" value="Vaccination" class="btn btn-primary">Set Vaccination</button>
 </td>
 </tr>
  </tbody>
  </table> 

</form>

<table border="1 px solid" width="45%" style="float: left; margin-left: 10%; margin-top: 25px">
  

    <thead>
    <tr>
    	<td colspan="3" style="text-align: center;">	
    		<b>Injected Vaccination</b>
    	</td>
    </tr>
    	<tr>
    		<td>
    			<b>Sr.No</b>
    		</td>
    		<td>
    			<b>Age</b>
    		</td>
    		<td>
    			<b>Vaccination Type</b>
    		</td>
    	</tr>
    </thead>
     <tbody>   <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list2}" var="v" varStatus="count">
              <tr>
              <td>
              ${count.count}
              </td>
              <td>
               ${v.age} - Month
              </td>
              	<td>
              ${v.vaccination}
                 </td>
                 </tr>
                 
                 </tbody>
   
       
             	
</c:forEach>
</c:when>
</c:choose>
  </table>

			   </div>
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