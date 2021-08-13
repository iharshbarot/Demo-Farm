<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
function print(id,b)
{
	if(confirm("You Want to Print this Animal Details"))
		{
		window.open("animal?a=4&b="+b+"&id="+id);
		}
}


$(function() {
	  $("#total").html(sumColumn(2));
	});

	function sumColumn(index) {
	  var total = 0;
	  $("td:nth-child(" + index + ")").each(function() {
	    total += parseInt($(this).text(), 10) || 0;
	  });  
	  return total;
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
                   
                </ul>
            </div>

<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
     
        
            <div class="box-content">
         
       <div class="double"  width="100%">
               <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list1}" var="v" varStatus="count">

<div>
	<h2 style="padding-left: 30%"><b> Welcome to <%= session.getAttribute("farmName") %></b></h2>
	<h4 style="font-style: italic; padding-left: 40%"><b>Milk Entry Today(<%= request.getAttribute("date") %>) Report</b></h4>
	
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
</div>
           
             	
</c:forEach>
</c:when>
</c:choose>

<c:choose>
				<c:when test="${list ne null}">
					<c:forEach items="${requestScope.list2}" var="v">
<div class="side">
              <div style="float:left;">
                <b>Avrage Milk:</b>&nbsp; <div id="avgMilk" style="float: left">  ${v.avg_milk}</div>
              </div>
             
            </div>
            </c:forEach>
</c:when>

</c:choose>
<c:choose>
				<c:when test="${list ne null}">
					<c:forEach items="${requestScope.list3}" var="v">
<div class="side">
              <div style="float:left;">
                <b>Avrage Milk:</b><div id="avgMilk"> <span>${v.avgMilk}</span></div>
              </div>
             
            </div>
            </c:forEach>
</c:when>

</c:choose>
<div  style="padding-left: 30%">
<table width=50%>
                <thead>
                <tr>
                	<th>SrNo</th>
                    <th>Milk</th>
                    <th>Shift</th>
                </tr>
                </thead>
               <tbody>
               
               <c:choose>
				<c:when test="${list ne null}">
					<c:forEach items="${requestScope.list}" var="v" varStatus="count">
                                         
                            <tr id="milkvalid">
                               <td>${count.count}</td>
                			   <td>${v.milk} Ltr
                			   <input type="hidden" id="harsh" value="${v.milk}"></td>
                   			   <td><script type="text/javascript">
                    var active = ${v.shift}
                    if(active == 1)
                    	{
                    	 document.write("<b>Morning Shift</b>");
                    	}
                    else
                    	{
                    	document.write("<b>Evening Shift</b>");
                    	}
                    </script>
                   
					</c:forEach>
				</c:when>
			   </c:choose>
			   <tr>
			   	<td>
			   	Total
			   
			   <td id="total">
			   </td>
			   </tr>
			   </tbody> 
			   </table>
			   </div>
			   
    <div id="chart_div" style="width: 900px; height: 500px; padding-left: 5%"></div>
  
</div>
            </div>
        </div>
    </div>
</div>

    <!-- content ends -->
   </div><!--/#content.col-md-0-->
</div><!--/fluid-row-->
</div>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);

      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var avrage = $("#avgMilk").text();
       var milkvalarry = [];
       $("#milkvalid input").each(function(){
    	   milkvalarry.push($(this).val());
       });
       var u = milkvalarry[0];
       var v = milkvalarry[1];
       var p = parseInt(u);
       var f = parseInt(v);
        sd=parseInt(avrage);
        dd = sd/300;
        ee = dd/2;
        var data = google.visualization.arrayToDataTable([
         ['Month', 'Morning', 'evning', 'avrage'],
         ['<%= request.getAttribute("date") %>',  p,      f, ee],
        
        
         
      ]);

    var options = {
      title : 'Today Graph',
      vAxis: {title: 'Milk(Ltr)'},
      hAxis: {title: 'Today'},	
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };

    var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
    </script>
<%@include file="footer.jsp" %>