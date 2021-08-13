<%@include file="head.jsp" %>
<%@include file="topbar.jsp" %>
<script type="application/javascript">
	function loginValidate()
	{
				
		if(f1.userName.value.trim()=="")
		{
			alert("Please Enter the User Name ");
			f1.userName.value="";
			f1.userName.focus();
			return false;
		}
		if(f1.password.value.trim()=="")
		{
			alert("Please Enter the Password ");
			f1.password.value="";
			f1.password.focus();
			return false;
		}
	
		else
			return true;
	}
</script>
<body>
<div class="ch-container">
    <div class="row">
        
    <div class="row">
        <div class="col-md-12 center login-header">
            <h2>Welcome to hach(SMS)
           
            </h2>
        </div>
        <!--/span-->
    </div><!--/row-->

    <div class="row">
        <div class="well col-md-5 center login-box">
       <div class="box-content">
          
      
        			<div class="alert alert-info">
                		Please login with your Username and Password.
                		
            		</div>
        	       <form action="insertData" method="post" name="f1" class="form-horizontal" onSubmit="return loginValidate()">
                <fieldset>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user nblue"></i></span>
                        <input type="text" class="form-control" placeholder="please enter your username" name="username" id="userName">
                    </div>
                    <div class="clearfix"></div><br>

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock nblue"></i></span>
                        <input type="password" class="form-control" placeholder="please enter your password" name="password" id="password">
                    </div>

                    <p class="center col-md-5">
                        <button type="submit" name="action" value="login" class="btn btn-primary" >Login</button>
                        
                    </p>
                    
                </fieldset>
            </form>
             <p class="center col-md-5">
            <a href="registration.jsp"><input type="submit" class="btn btn-primary" value="Sign Up"></a>
            </p>
           </div>
        <!--/span-->
    </div><!--/row-->
</div><!--/fluid-row-->

</div><!--/.fluid-container-->

<!-- external javascript -->

<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='bower_components/moment/min/moment.min.js'></script>
<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="js/charisma.js"></script>


</body>
</html>
