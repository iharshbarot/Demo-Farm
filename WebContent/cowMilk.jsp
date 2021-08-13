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
function backCow()
{
	
		   window.location.href= "animal?a=2&b=Cow";
}
function backBuff() {
	 window.location.href= "animal?a=2&b=Buffalo";
}
function print(id,b)
{
	if(confirm("You Want to Print this Animal Details"))
		{
		window.open("animal?a=4&b="+b+"&id="+id);
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
                        <a href="insertData?a=16">Home</a> 
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
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

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
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Born Date</b>:&nbsp; ${v.bornDate} 
              </div>
              <div>
                   <b>Perent Tag Id</b>:&nbsp;${v.perentId}
              </div>   		
            </div>
             <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Idel Milk</b>:&nbsp;${v.avg_milk}
              </div>
              <div>
                   <b>Born Avrage Milk(Probaly)</b>:&nbsp; ${v.bornidelMilk}
                   
              </div>   		
            </div>
           </div>
   <div style="padding-left: 40%;padding-top: 15px">
            
            	 <input type="button" value="Back To Cow List" class="btn btn-info" onclick="backCow()"/>
            	 <input type="button" value="Back To Buffalo List" class="btn btn-info" onclick="backBuff()"/>
            
            	  <input type="button" value="Print" class="btn btn-info" onclick="print(${v.a_id},${v.animalEntry})"/> 
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