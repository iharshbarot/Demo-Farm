<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>

<script type="text/javascript">
function ValidateForm()
{
	if(f1.animalType.value=="")
	{
		
		alert("Please Select Animal Type");
		f1.animalType.focus();
		return false;
	}
  
	if(f1.animalBread.value=="")
	{
		alert("Please Enter Animal  Bread");
		f1.animalBread.focus();
		return false;
	}
	if(f1.animalTagid.value=="")
	{
		alert("Please Enter Animal  Tag ID");
		f1.animalTagid.focus();
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
                        <a href="insertData?a=16">Home</a> 
                    </li>
                     <li>
                     &nbsp;  &raquo;  &nbsp;    <a href="animal_reg.jsp">Add new Animal</a> 
                    </li>
                 
                </ul>
            </div>
            
   <div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
        
            <div class="box-header well">
                <h2><i class="glyphicon glyphicon-plus"></i> Enter Your Aminal Registration Details</h2>
            </div>
            <div class="box-content">
           
            <form action="animal" method="post" name="f1" class="form-horizontal" onSubmit="return ValidateForm()">
          	<table width="100%">
            <tr>
            <td >
                <label>Animal Type<font color="red">*</font></label> 
                <input type="hidden" name="u_id" value=<%= session.getAttribute("u_id") %>>
				 <select class="form-control" name="animalType" id="animalType">
				 	<option value="">Select Animal type</option>
				 	<option value="Cow">Cow</option>
				 	<option value="Buffalo">Buffalo</option>
				 </select>
				 
            </td>
            <td>
                <label>Animal Type <font color="red">*</font></label>
              	<input type="text" name="animalBread" id="animalBread" class="form-control"  placeholder="Enter other type animal Bread" />
            </td>
            
             <td>
               <label>Animal Name <font color="red">*</font></label>
                 <input type="text" name="animalName" id="animalName" class="form-control"  placeholder=" Enter name of Animal"> 
             </td>
            </tr>
            <tr>
            <td >
                <label>Tag ID <font color="red">*</font></label> 
				 <input type="text" name="animalTagid" id="animalTagid" class="form-control"  placeholder="Enter tag_id ">
				 
            </td>
           
                    </tr>
            <tr><td colspan="3">
             
           	   <button type="submit" name="action" value="purches" class="btn btn-primary">Purchase</button>
               <button type="submit" name="action" value="born" class="btn btn-primary">Born</button>
               <button type="reset" class="btn btn-primary">Clear</button>
            	       
      	     </td></tr>
                  
     		</table>
            </form>
                          
	
            </div>
          
        </div>
    </div>
    
   
    
</div>
 </div>
</div>
</div>
<%@include file="footer.jsp" %>
