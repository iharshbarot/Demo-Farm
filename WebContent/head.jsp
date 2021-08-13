<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html d>
<head>
   
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>hach</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- The styles -->
    <link id="bs-css" href="css/bootstrap-spacelab.min.css" rel="stylesheet">

    <link href="css/charisma-app.css" rel="stylesheet">
    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='css/jquery.noty.css' rel='stylesheet'>
    <link href='css/noty_theme_default.css' rel='stylesheet'>
    <link href='css/elfinder.min.css' rel='stylesheet'>
    <link href='css/elfinder.theme.css' rel='stylesheet'>
    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='css/uploadify.css' rel='stylesheet'>
    <link href='css/animate.min.css' rel='stylesheet'>
    
  <!-- Start vertical menu-->
      <!-- SmartMenus core CSS (required) -->
    <link href="css/sm-core-css.css" rel="stylesheet" type="text/css" />

    <!-- "sm-blue" menu theme (optional, you can use your own CSS, too) -->
    <link href="css/sm-blue.css" rel="stylesheet" type="text/css" />
    
   <!-- End vertical menu-->

    <!-- jQuery -->
    <script src="bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="img/big_cow.png"> 
    
    <!-- Script for date time picker -->

	
		<link rel="stylesheet" href="css/bootstrap-material-datetimepicker.css" />
		<!--<link href='http://fonts.googleapis.com/css?family=Roboto:400,500' rel='stylesheet' type='text/css'>-->
		<!--<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"> -->

	<link rel="stylesheet" media="screen" href="">
		<script type="text/javascript" src="js/moment-with-locales.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-material-datetimepicker.js"></script>
		
		<script>
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o),
					m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

			ga('create', 'UA-60343429-1', 'auto');
			ga('send', 'pageview');
		</script>
        
        
<!-- for webcame -->
    	
    <script type="text/javascript" src="js/webcam.js"></script>
	<script>
		$(function(){
			//give the php file path
			webcam.set_api_url( 'saveimage.php' );
			webcam.set_swf_url( 'js/webcam.swf' );//flash file (SWF) file path
			webcam.set_quality( 80 ); // Image quality (1 - 100)
			webcam.set_shutter_sound( true ); // play shutter click sound
			
			var camera = $('#camera');
			camera.html(webcam.get_html(300, 300)); //generate and put the flash embed code on page
			
			$('#capture_btn').click(function(){
				//take snap
				webcam.snap();
				
			});
				//after taking snap call show image
			webcam.set_hook( 'onComplete', function(img){
				
				$('#vimg').attr("src",img);
				$('#visimg').attr("value",img);
				
				//reset camera for the next shot
				webcam.reset();
			});
			
		});
	</script>
    
    
    <!-- webcame-->
    <style>
	a.back-to-top {
	display:none;
	width: 50px;
	height: 50px;
	text-indent: -9999px;
	position: fixed;
	z-index: 999;
	right: 20px;
	bottom: 20px;
	background: #27AE61 url("up-arrow.png") no-repeat center 43%;
	-webkit-border-radius: 30px;
	-moz-border-radius: 30px;
	border-radius: 30px;
}
	</style>
  
</head>
