<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Add patient</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shadow Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files --> 
<!-- web font --> 
<link href="//fonts.googleapis.com/css?family=Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>

	<!-- main --> 
	<div class="main-agileinfo slider ">
		<div class="items-group">
			<div class="item agileits-w3layouts">
				<div class="block text main-agileits"> 
					<span class="circleLight"></span> 
					
					<!-- login form -->
					<div class="login-form loginw3-agile"> 
						<div class="agile-row">
							<h1>Add Details</h1> 
							<a href="search.jsp">add new reminder</a>
							<div class="login-agileits-top"> 	
								<form action="Add_patservlet" method="post"> 
								
									<p>Medical ID</p>
									<input type="text" class="name" name="Mid" required=""/>
									<p>Fingerprint ID</p>
									<input type="text" class="name" name="Fid" required=""/> 
									<p>Name</p>
									<input type="text" class="name" name="Name" required=""/> 
									<p>Age</p>
									<input type="text" class="name" name="Age" required=""/>
									<p>Sex</p>
									<input type="text" class="name" name="Sex" required=""/>
									<p>Weight</p>
									<input type="text" class="name" name="Wt" required=""/>
									<p>Records</p>
									<textarea name="Rcd" class="name"cols="50" rows="5" ></textarea>
									<label class="anim">
										
									</label>   
									<input type="submit" value="Submit"name="operation"> 
								</form> 	
							</div> 
							
						</div>  
					</div>   
				</div>
				
			</div>   
		</div>
	</div>	 
	
	<!-- //main --> 
</body>
</html>