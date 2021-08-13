<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<style>

.double {border-style: double;}
.fontSize{font-size: medium;}
.side{padding-top: 10px;padding-left: 5Px}
.qr-code {
  max-width: 200px;
  margin: 10px;
</style>
<script type="text/javascript">

function print(id,b)
{
	if(confirm("You Want to Print this Animal Details"))
		{
		window.open("sell?a=7&id="+id);
		}
}
var qrcode = new QRCode("qrcode");

$("#text").on("keyup", function () {
    qrcode.makeCode($(this).val());
}).keyup().focus();
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
                   
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-content">
         
       <div class="double"  width="100%">
               <c:choose>
<c:when test="${list1 ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">

<div>
	<h2 style="padding-left: 30%"> Welcome to <%= session.getAttribute("farmName") %></h2>
</div>
    <div style="padding-top: 25Px;padding-bottom: 25Px" class="fontSize">
       <div class="side">
           <div style="float:left; width: 50%;">
              <b>Animal Type</b>:&nbsp; ${v.animalType}
            </div>
             <div>
                <b>Animal Bread</b>:&nbsp; ${v.animalBread}
              </div>  
       </div>
           <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Animal Name</b>:&nbsp;${v.animalName}
              </div>
              <div>
                   <b>Animal Tag Id</b>:&nbsp;${v.animalTagid} 
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
   <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

  <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Dead Date</b>:&nbsp;2018-11-15
              </div>
              <div>
                   <b>Dead Reason</b>:&nbsp; ${v.death_Reason} 
              </div>   		
            </div>
            
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Dorman By</b>:&nbsp;${v.dormanBy}
              </div>
              		
            </div>
            
             
           </div>
           <div class="container-fluid">
  <div class="text-center">
    <img src="https://chart.googleapis.com/chart?cht=qr&chl=harsh&chs=160x160&chld=L|0"
         class="qr-code img-thumbnail img-responsive">
  </div>
   <div style="padding-left: 48%;padding-top: 15px">
            	  <input type="button" value="Print" class="btn btn-info" onclick="print(${v.a_id})"/> 
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