<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script>
function ValidateForm()
{
	if(f1.owner_name.value=="")
	{
		alert("Please Enter Owner name");
		f1.owner_name.focus();
		return false;
	}
	 if(isNaN(f1.Owner_contact_number.value))
  	{
        alert("Please Enter Only Digits for Mobile Number.");
    f1.Owner_contact_number.focus();
    return false;
  }
  if(f1.Owner_contact_number.value.length!=10)
  {
    alert("Mobile Number must be 10 digits only");
    f1.Owner_contact_number.focus();
    return false;
  }
  if(f1.owner_add.value=="")
  {
    alert("Please Enter Owner Address");
    f1.owner_add.focus();
    return false;
  }
  if(isNaN(f1.age.value))
  {
    alert("Please Enter Only Digits for age.");
    f1.age.focus();
    return false;
  }
  if(f1.age.value.length>=100)
  {
    alert("Age must be 3 digits only");
    f1.age.focus();
    return false;
  }
  
  if(f1.breed.value=="")if(f1.date.value=="")
  {
    alert("Please Enter Date");
    f1.date.focus();
    return false;
  }
  {
    alert("Please Enter Date");
    f1.breed.focus();
    return false;
  }
  if(f1.Vaccination.value=="")
  {
    alert("Please Enter Vaccination");
    f1.Vaccination.focus();
    return false;
  }
  if(f1.avgMikl.value=="")
  {
    alert("Please Enter Average Milk");
    f1.avgMikl.focus();
    return false;
  }
  if(f1.Medical_issues.value=="")
  {
    alert("Please Enter Medical issues");
    f1.Medical_issues.focus();
    return false;
  }
  if(f1.Medical_certificate.value=="")
  {
    alert("Please upload Medical Certificate");
    f1.Medical_certificate.focus();
    return false;
  }
  if(f1.pur_doc.value=="")
  {
    alert("Please upload Purchase Document");
    f1.pur_doc.focus();
    return false;
  }
else
    return true;
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
                      &nbsp;  &raquo;  &nbsp;   <a href="">Purches Animal</a> 
                    </li>
                    
                 
                </ul>
            </div>
            
           
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your New purchase Animal Details</h2>
            </div>
            <div class="box-content">
           
            <form action="animal" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
          	<table width="100%">
          	             <c:choose>
<c:when test="${list ne null}">
<c:forEach items="${requestScope.list}" var="v" varStatus="count">
  
            <tr>
            <td >
                <label>Animal Type</label> 
				<input type="text" name="animalBread" class="form-control" readonly="readonly" value="${v.animalType}"/>
				 <input type="hidden" name="a_id" value="${v.a_id}">
				
            </td>
            <td>
                <label>Animal Type</label>
              	<input type="text" name="animalBread"  class="form-control" readonly="readonly" value="${v.animalBread}"/>
            </td>
            
             <td>
               <label>Animal Name</label>
                 <input type="text" name="animalName" class="form-control" readonly="readonly" value="${v.animalName}"/> 
             </td>
             <td>
                <label>Tag ID</label> 
				 <input type="text" name="animalTagid" class="form-control" readonly="readonly" value="${v.animalTagid}"/>
            </td> 
            </tr>
            </c:forEach>
</c:when>
</c:choose>
     	
            <tr>
             <td>
               <label>Owner Name <font color="red">*</font> </label>
                 <input type="hidden" name="u_id" value=<%= session.getAttribute("u_id") %>>
                 <input type="text" name="owner_name" id="owner_name" class="form-control"  placeholder="Enter Animal owner name" />
             </td>
             <td>
               <label>Owner Contact Number <font color="red">*</font></label>
                 <input type="text" name="Owner_contact_number" id="Owner_contact_number" class="form-control"  placeholder=" Enter Owner contact number"> 
             </td>
             <td>
               <label>Owner Address <font color="red">*</font> </label>
                 <input type="text" name="owner_add" id="owner_add" class="form-control"  placeholder=" Enter Owner Address"> 
             </td>          
            <td>
                <label>Date of bith<font color="red">*</font></label>
                <input type="Date" name="dob"  id="dob" class="form-control" >

            </td>
          </tr>
            
           <tr>
               <td>
                <label>Date of bith<font color="red">*</font></label>
                <input type="Date" name="pur_dob"  id="pur_dob" class="form-control" >

            </td>
               <td>
               
                <label>Average Milk(year)<font color="red">*</font></label> 
                <input type="text" name="avgMilk" id="avgMilk" class="form-control"  placeholder="Enter Animal Average Milk ">

              </td>
              
              
               <td>
               
                <label>Average Ideal Milk(year)<font color="red">*</font></label> 
                <input type="text" name="idealMilk" id="idealMilk" class="form-control"  placeholder="Enter Animal Ideal Milk ">

              </td>
            </tr>
           <tr>
              <td>
               
                <label>Animal Medical issues<font color="red">*</font></label> 
                <input type="text" name="Medical_issues" id="Medical_issues" class="form-control"  placeholder="Enter Animal Medical issues">

              </td>
              <td>
                 <label> Before Pregnancy<font color="red">*</font></label>
                <input type="text" name="beforePregnancy" id="beforePregnancy" class="form-control" placeholder="Enter how many time before pragnancy" >
              </td>
              
             
             
             </tr>
            
			<tr>
            <td colspan="3">
           		<button type="submit" name="action" value="purchesed" class="btn btn-primary">Submit</button>
               <button type="reset" name="cl" class="btn btn-primary">Clear</button>
            	       
      	     </td></tr>
                  
     		</table>
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
