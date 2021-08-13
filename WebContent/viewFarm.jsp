<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<style>

.double {border-style: double;}
.fontSize{font-size: medium;}
.side{padding-top: 10px;padding-left: 5Px}
</style>
<script type="text/javascript">
function beackRegistration()
{
	
		   window.location.href= "insertData?a=0";
}
function print(id,role)
{
	if(confirm("You Want to Print this Account"))
		{
		window.open("insertData?a=13&b="+role+"&id="+id);
		}
}
function backPanding()
{
	
		   window.location.href= "insertData?a=4";
		
}
function backDeactive()
{
	
		   window.location.href= "insertData?a=6";
		
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
                    <%if(Integer.parseInt(request.getParameter("b")) == 1) {%>
                     <li>
                     &nbsp;  &raquo;  &nbsp; <a href="insertData?a=0">Registration List</a>
                    </li>
                    <%}else if(Integer.parseInt(request.getParameter("b")) == 2){ %>
                     <li>
                     &nbsp;  &raquo;  &nbsp; <a href="insertData?a=4">Panding List</a>
                    </li>
                     <%} else if(Integer.parseInt(request.getParameter("b")) == 3)
                     {%>
                     <li>
                     &nbsp;  &raquo;  &nbsp; <a href="insertData?a=6">Deactive List</a>
                     <%} %>
                    </li>
                    <li>
                     &nbsp;  &raquo;  &nbsp; <a href="#">Farm Details </a>
                    </li>
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-content">
         
       <div class="double"  width="100%">
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

<div>
	<h2 style="padding-left: 30%">Details of ${v.farm_name}</h2>
</div>
    <div style="padding-top: 25Px;padding-bottom: 25Px" class="fontSize">
       <div class="side">
           <div style="float:left; width: 50%;">
              <b>Farm Name</b>:&nbsp; ${v.farm_name}
            </div>
             <div>
                <b>Owner Name</b>:&nbsp; ${v.owner_name}
              </div>  
       </div>
           <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Farm Contact Number</b>:&nbsp; ${v.farm_contact_no}
              </div>
              <div>
                   <b>Owner Contact Number</b>:&nbsp; ${v.owner_contact_no}
              </div>   		
            </div>
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>State</b>:&nbsp; ${v.state}
              </div>
              <div>
                   <b>District</b>:&nbsp; ${v.distrit}
              </div>   		
            </div>
             <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Farm Address</b>:&nbsp; ${v.farm_address}
              </div>
              <div>
                   <b>Farm E-Mail Address</b>:&nbsp; ${v.farm_email}
              </div>   		
            </div>
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Farm Registration Number</b>:&nbsp; ${v.farm_reg_no}
              </div>
              <div>
                   <script type="text/javascript">
                    var active = ${v.role}
                    if(active == 1)
                    	{
                    	 document.write("<b>Status:</b> Active");
                    	}
                    else if(active == 2)
                    	{
                   	 		document.write("<b>Status:</b> Panding");
                   		}
                    else
                    	{
                    	document.write("<b>Status:</b> Deactive");
                    	}
                    </script>
              </div> 		
            </div>
            <div style="padding-left: 35%;padding-top: 15px">
            	 <%if(Integer.parseInt(request.getParameter("b")) == 1) {%>
            	  <input type="button" value="Back To Registration List" class="btn btn-info" onclick="beackRegistration()"/>
            	 <input type="button" value="Print" class="btn btn-info" onclick="print(${v.u_id},1)"/>
            	 <%} 
            	 else if(Integer.parseInt(request.getParameter("b")) == 2){
            	 %>
            	 <input type="button" value="Back To Panding List" class="btn btn-info" onclick="backPanding()"/>
            	  <input type="button" value="Print" class="btn btn-info" onclick="print(${v.u_id},2)"/>
            	 <% }else if(Integer.parseInt(request.getParameter("b")) == 3){%>
            	 <input type="button" value="Back To Deactive List" class="btn btn-info" onclick="backDeactive()"/>
            	  <input type="button" value="Print" class="btn btn-info" onclick="print(${v.u_id},3)"/>
            	 <%} %>
            	 
            </div>
  	</div>
</c:forEach>
</c:when>
<c:otherwise>
<div class="alert alert-danger">
              	<button type="button" class="close" data-dismiss="alert">&times;</button>
                	Record Not Found
                </div>

</c:otherwise>
</c:choose>
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