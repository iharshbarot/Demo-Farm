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
                  <b>Owner Name</b>:&nbsp;${v.owner_name}
              </div>
              <div>
                   <b>Owner Contact Number</b>:&nbsp;${v.owner_contact_number}
              </div>   		
            </div>
           
           <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Owner Address</b>:&nbsp;${v.owner_add}
              </div>
              <div>
                   <b>Animal DOB</b>:&nbsp;${v.dob} 
              </div>   		
            </div>
            
             <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Purchase DOB</b>:&nbsp;${v.pur_dob}
              </div>
              <div>
                   <b>Average Milk</b>:&nbsp;${v.avgMilk} 
              </div>   		
            </div>
            
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Ideal Milk</b>:&nbsp;${v.idealMilk}
              </div>
              <div>
                   <b>Before Pregnancy</b>:&nbsp;${v.beforePregnancy} 
              </div>   		
            </div>
            
            <div class="side">
              <div style="float:left; width: 50%;">
                  <b>Medical Issue</b>:&nbsp;${v.medical_issues}
              </div>
               		
            </div>
          
            
            
            
            
           </div>
           <div class="container-fluid">
  <div class="text-center">
     <img src="https://chart.googleapis.com/chart?cht=qr&chl=Animal Type:${v.animalType},
     	Animal Bread: ${v.animalBread},
     	Animal Tag ID:${v.animalTagid},
     	Animal DOB:${v.dob},
     	Animal Purches Date:${v.pur_dob},
     	Animal Avrage Milk:${v.avgMilk}Ltr/year,
     	Animal Ideal Milk:${v.idealMilk}Ltr/year
     	****Purchesd Animal*****
     	&chs=160x160&chld=L|0"
         class="qr-code img-thumbnail img-responsive">
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