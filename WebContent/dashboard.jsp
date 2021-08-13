<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                     &nbsp;  &raquo;  &nbsp; <a href="dashboard.jsp">Dashboard</a>
                    </li>
                </ul>
            </div>
           


<div class="row">
    <div class="box col-md-12">
   	<div style="width:100%;text-align:center; font-style:oblique; font-stretch:extra-expanded;">		
   <h1>Welcome to hach(Stable Managment System)</h1></br>
   <h2>Welcome to <%= session.getAttribute("farmName") %></h2>
   </div>
   <%
    int r = (Integer)session.getAttribute("role");
    if(r == 0)
    {
    %>
	 <center>
     
    
      <a href=""><button class="btn btn-lg" style="background-image: -webkit-linear-gradient(#efce83, #ffca4f 50%, #f5b92d); border: 1px solid #af7d09;"> 
      <img src="img/big_cow.png" style="height:70px;" /> <br />
      <label style="color:#ffffff;">
      		 <c:choose>
<c:when test="${pist ne null}">
<c:forEach items="${requestScope.pist}" var="v" varStatus="count">

Existing Farm: ${v.cc}</br>
</c:forEach>
</c:when>
</c:choose>
       </label></button></a> &nbsp;&nbsp;&nbsp;&nbsp;     
    
     <a href=""><button class="btn btn-info btn-lg" style="background-image: -webkit-linear-gradient(#74bbb4 , #529892 50%, #1b6962);
    border: 1px solid #1b6962;"> <img src="img/big_cow.png" style="height:70px;" /><br />
     <label style="color:#ffffff;"> 
     <c:choose>
<c:when test="${pist1 ne null}">
<c:forEach items="${requestScope.pist1}" var="v" varStatus="count">

Pandding Farm Request: ${v.cc}</br>

</c:forEach>
</c:when>
</c:choose>
     </label></button></a>&nbsp;&nbsp;&nbsp;&nbsp;
     
     
     <a href=""><button class="btn btn-warning btn-lg" style="background-image: -webkit-linear-gradient(#9693bd, #7974a7 50%, #67629e);  border: 1px solid #615aa2;"> <img src="img/big_cow.png" style="height:70px;" /> <br />
     <label style="color:#ffffff;">
<c:choose>
<c:when test="${pist2 ne null}">
<c:forEach items="${requestScope.pist2}" var="v" varStatus="count">

Deactive Farm: ${v.cc}</br>
</c:forEach>
</c:when>
</c:choose>

 </label></button></a> &nbsp;&nbsp;&nbsp;&nbsp;
    
     <a href="" ><button class="btn btn-lg" style="border: 1px solid #19406f;background-image: linear-gradient(#5964af, #515cab 50%, #465092);"> <img src="img/big_cow.png" style="height:70px;" /> <br />
     <label style="color:#ffffff;">
     <c:choose>
<c:when test="${pist3 ne null}">
<c:forEach items="${requestScope.pist3}" var="v" varStatus="count">
Trash Farm List: ${v.cc}</br>

</c:forEach>
</c:when>
</c:choose>
      </label></button></a> 
      &nbsp;&nbsp;&nbsp;&nbsp;
         </center>
	
    <%
    }
    else if(role == 1)
    {
    %>
   <center>
     
    
      <a href=""><button class="btn btn-lg" style="background-image: -webkit-linear-gradient(#efce83, #ffca4f 50%, #f5b92d); border: 1px solid #af7d09;"> 
      <img src="img/big_cow.png" style="height:70px;" /> <br />
      <label style="color:#ffffff;">
      		 <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">

Existing Cow: ${v.cow}</br>
Existing Buffalo: ${v.buffalo}
</c:forEach>
</c:when>
</c:choose>
       </label></button></a> &nbsp;&nbsp;&nbsp;&nbsp;     
    
     <a href=""><button class="btn btn-info btn-lg" style="background-image: -webkit-linear-gradient(#74bbb4 , #529892 50%, #1b6962);
    border: 1px solid #1b6962;"> <img src="img/big_cow.png" style="height:70px;" /><br />
     <label style="color:#ffffff;"> 
     <c:choose>
<c:when test="${list1 ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">

Cow's Heatphashe: ${v.cow}</br>
Buffalo's Heatphase: ${v.buffalo}
</c:forEach>
</c:when>
</c:choose>
     </label></button></a>&nbsp;&nbsp;&nbsp;&nbsp;
     
     
     <a href=""><button class="btn btn-warning btn-lg" style="background-image: -webkit-linear-gradient(#9693bd, #7974a7 50%, #67629e);  border: 1px solid #615aa2;"> <img src="img/big_cow.png" style="height:70px;" /> <br />
     <label style="color:#ffffff;">
<c:choose>
<c:when test="${list2 ne null}">
<c:forEach items="${requestScope.list2}" var="v" varStatus="count">

Pregnate Cows: ${v.cow}</br>
Pregnate Buffalos: ${v.buffalo}
</c:forEach>
</c:when>
</c:choose>

 </label></button></a> &nbsp;&nbsp;&nbsp;&nbsp;
    
     <a href="" ><button class="btn btn-lg" style="border: 1px solid #19406f;background-image: linear-gradient(#5964af, #515cab 50%, #465092);"> <img src="img/big_cow.png" style="height:70px;" /> <br />
     <label style="color:#ffffff;">
     <c:choose>
<c:when test="${list3 ne null}">
<c:forEach items="${requestScope.list3}" var="v" varStatus="count">
Selled Cows: ${v.cow}</br>
Selled Buffalos: ${v.buffalo}
</c:forEach>
</c:when>
</c:choose>
      </label></button></a> 
      &nbsp;&nbsp;&nbsp;&nbsp;
     <a href="" ><button class="btn btn-info btn-lg"> <img src="img/big_cow.png" style="height:70px;" /> <br />
     <label style="color:#ffffff;">
 <c:choose>
<c:when test="${list4 ne null}">
<c:forEach items="${requestScope.list4}" var="v" varStatus="count">


Dead Cows: ${v.cow}</br>
Dead Buffalos: ${v.buffalo}
</c:forEach>
</c:when>
</c:choose>
</label></button></a>
     &nbsp;&nbsp;&nbsp;&nbsp;
  
     </center>
     </div>
     </div>
     </div>
     <%} %>
  </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->

<%@include file="footer.jsp" %>
