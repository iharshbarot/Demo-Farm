<%@page import="org.apache.el.lang.ELSupport"%>
<nav id="main-nav" style="margin-bottom: 5px;">
      <!-- Sample menu definition -->
     <% int role = (Integer)session.getAttribute("role"); 
	   	int id =(Integer)session.getAttribute("u_id");
	   //admin nav bar 
	   	if(role == 0){
	  %>
      <ul id="main-menu" class="sm sm-blue">
	  	<li><a href="insertData?a=16" class="">Dashboard</a></li>
        <li><a href="#" class="">Farm Registration</a>
         <ul>
      		<li><a href="insertData?a=0">Existing Farm List</a></li>
      		<li><a href="insertData?a=4">Panding Farm Request</a></li>
            <li><a href="insertData?a=6">Deactive Farm Request</a></li>
            <li><a href="insertData?a=8">Trash</a></li>
            <li><a href="existingAnimal.jsp">Track Record</a></li>
         </ul>
       	</li>
      
    	<li style="float:right;"><a href="#"  class=""></a>
         <ul>	
             <li><a href="changePsw.jsp">Change Password</a></li>
             <li><a href="insertData?a=2">Logout</a></li>
       	 </ul>
        </li>
                         
      </ul>
      <%}
	   //Member Navigation-bar	
	  else if(role == 1){
	  %>
      <ul id="main-menu" class="sm sm-blue">
	    <li><a href="insertData?a=16" class="">Dashboard</a></li>
        <li><a href="#" class="">Animal Registration</a>
         <ul>
            <li><a href="pageController?a=0&id=<%=id %>">Add new Animal</a></li>
      	  	<li><a href="">Existing Animal</a>
      	  		<ul>
      	  			<li><a href="animal?a=2&b=Cow">Cow</a></li>
      	  			<li><a href="animal?a=2&b=Buffalo">Buffalo</a></li>
      	  		</ul>
      	  	</li>
      	  	<li><a href="">Vaccination Animal</a>
      	  		<ul>
      	  		<li><a href="animal?a=5&b=Cow">Cow</a></li>
      	  		<li><a href="animal?a=5&b=Buffalo">Buffalo</a></li>
      	  		</ul>
      	  	</li>
          	<li><a href="">Sell Animal</a>
          		<ul>
      	  			<li><a href="sell?a=2&b=Cow">Cow</a></li>
      	  			<li><a href="sell?a=2&b=Buffalo">Buffalo</a></li>
      	  		</ul>
          	</li>
          	<li><a href="">Death Animal</a>
          		<ul>
      	  			<li><a href="sell?a=3&b=Cow">Cow</a></li>
      	  			<li><a href="sell?a=3&b=Buffalo">Buffalo</a></li>
      	  		</ul>
          	</li>
          
    	 </ul>
       	</li> 
       
       
        <li><a href="#" class="">Milk</a>
         <ul>
      	  	<li><a href="">Milk Update</a>
      	  		<ul>
      	  			<li><a href="">Cow Milk Update</a>
      	  				<ul>
      	  					<li><a href="milkController?a=0&b=Cow&c=1">Morning Shift</a></li>
      	  					<li><a href="milkController?a=0&b=Cow&c=2">Evening Shift</a></li>
      	  				</ul>
      	  			</li>
      	  			<li><a href="">Buffalo Milk Update</a>
      	  				<ul>
      	  					<li><a href="milkController?a=0&b=Buffalo&c=1">Morning Shift</a></li>
      	  					<li><a href="milkController?a=0&b=Buffalo&c=2">Evening Shift</a></li>
      	  				</ul>
      	  			</li>
      	  			
      	  		</ul>
      	  	</li>  
      	  	<li><a href="">Single Day Milk Report</a>
      	  				<ul>
      	  					<li><a href="milkController?a=1&b=Cow">Cow</a></li>
      	  					<li><a href="milkController?a=1&b=Buffalo">Buffalo</a></li>
      	  				</ul>
      	  			</li>
      	  	<li><a href="">Day wise Milk Report</a>
      	  				<ul>
      	  					<li><a href="milkController?a=4&b=Cow">Cow</a></li>
      	  					<li><a href="milkController?a=4&b=Buffalo">Buffalo</a></li>
      	  				</ul>
      	  			</li>		
      	  	<li><a href="">Today Day Milk Report</a>
      	  				<ul>
      	  					<li><a href="milkController?a=2&b=Cow">Cow</a></li>
      	  					<li><a href="milkController?a=2&b=Buffalo">Buffalo</a></li>
      	  				</ul>
      	  			</li>	
      	  			<li><a href="">Yesterday Day Milk Report</a>
      	  				<ul>
      	  					<li><a href="milkController?a=3&b=Cow">Cow</a></li>
      	  					<li><a href="milkController?a=3&b=Buffalo">Buffalo</a></li>
      	  				</ul>
      	  			</li>		
    	 </ul>
       	</li> 
       	
        <li><a href="#" class="">Caretakers</a>
 		 <ul>
            <li><a href="caretaker.jsp">Add new Caretakers</a></li>
      	    <li><a href="caretakers?a=0">Existing Caretakers List</a></li>
          	<li><a href="existingCaretaker.jsp">Track record</a></li>
          </ul>
        </li>
        <li><a href="#" class="">heatphase</a>
         <ul>
            <li><a href="">Ganrate Heatphase</a>
            	<ul>
            		<li><a href="heatphase?a=0&b=Cow">Cow</a></li>
            		<li><a href="heatphase?a=0&b=Buffalo">Buffalo</a></li>
            	</ul>
            </li>
        	<li><a href="">Existing Heatphase</a>
        		<ul>
            		<li><a href="heatphase?a=1&b=Cow">Cow</a></li>
            		<li><a href="heatphase?a=1&b=Buffalo">Buffalo</a></li>
            	</ul>
        	</li>
			<li><a href="uploadForcePhoto.jsp">Track Reord</a>
			
			</li>
		 </ul>
		</li>
        <li><a href="#" class="">Pregnancy</a>
         <ul>
          	<li><a href="">Existing Pregnancy</a>
          	<ul>
            		<li><a href="heatphase?a=2&b=Cow">Cow</a></li>
            		<li><a href="heatphase?a=2&b=Buffalo">Buffalo</a></li>
            	</ul>
          	</li>
		 </ul>
	  	</li> 
     
      
    	<li style="float:right;"><a href="#"  class=""></a>
         <ul>
        	<li><a href="insertData?a=14&id=<%=id %>">Update Profile</a></li>	
            <li><a href="insertData?a=15&id=<%=id %>">Change Password</a></li>
            <li><a href="insertData?a=2">Logout</a></li>	
       	 </ul>
        </li>
                         
     </ul>
      <%}
	   //new registration and panding navgiation bar
	  else if(role == 2)
	  {
	  %>
	   <ul id="main-menu" class="sm sm-blue">
	  	<li><a href="insertData?a=16" class="">Demo Video</a></li>
        <li><a href="#" class="">About Us</a></li>
        <li><a href="#" class="">Plan and Schem</a></li>
        <li><a href="#" class="">Contect Us</a></li>	
    	<li style="float:right;"><a href="#"  class=""></a>
         <ul>
            <li><a href="insertData?a=14&id=<%=id %>">Update Profile</a></li>	
            <li><a href="insertData?a=15&id=<%=id %>">Change Password</a></li>
             <li><a href="insertData?a=2">Logout</a></li>
       	 </ul>
        </li>                
       </ul>
	  <%} %>
</nav>
  


