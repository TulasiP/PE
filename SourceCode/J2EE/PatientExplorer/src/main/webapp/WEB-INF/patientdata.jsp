<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>patient</title>
	<script type="text/javascript">
		function AlertMessage(result)
		{
		
			if(result==0)
			{
				alert("UID does not accept zero value");
			}
			if(result==5)
			{
				alert("UID does not accept negative numbers")
			}
			if (result==2)
			{
				alert("UID cannot be more than 9999999999");
			}
			if(result==3)
			{
				alert(" uid data is not filled in required fields");
			}
			if(result==4)
			{
			 	alert("UID accepts only numbers");	
			}
			if(result==6)
			{
				alert("firstname data is not filled in required fields");	
			}
			if(result==7)
			{
				alert("firstname does not accept numbers & special characters other than space");		
			}
			if(result==8)
			{
				alert("Length of the firstname cannot be more than 50 characters");	
			}
			if(result==9)
			{
				alert("lastname data is not filled in required fields");		
			}
			if(result==10)
			{
				alert("lastname does not accept numbers & special characters other than space");		
			}
			if(result==11)
			{
				alert("Length of the lastname cannot be more than 50 characters");		
			}
			if(result==12)
			{
				alert("age data is not filled in required fields");		
			}
			if(result==13)
			{
				alert("age accepts only numbers");		
			}
			if(result==14)
			{
				alert("age does not accept negative numbers");		
			}
			if(result==15)
			{
				alert("age does not accept zero value");		
			}
			if(result==16)
			{
				alert("age cannot be more than 150");		
			}
			if(result==17)
			{
				alert("Gender cannot be given other than Male, Female and Other")		
			}
			if(result==18)
			{
				alert("dob data is not filled in required fields");		
			}
			if(result==19)
			{
				alert("In dob year should not be less than 1866");		
			}
			if(result==20)
			{
				alert("Height data is not correct format");		
			}
			if(result==21)
			{
				alert("Weight data is not filled in required fields")		
			}
			if(result==22)
			{
				alert("Weight does not accept negative numbers");		
			}
			if(result==23)
			{
				alert("Weight does not accept more than 300");		
			}
			if(result==24)
			{
				alert("Birthday data is not filled in required fields");		
			}
			if(result==25)
			{
				alert("Birthday does not accept numbers & special characters");		
			}
			if(result==26)
			{
				alert("Length of the birthday cannot be more than 50 characters");		
			}
			if(result==27)
			{
				alert("Address data is not filled in required fields");		
			}
			if(result==28)
			{
				alert("Address does not accept any special characters other than #, .(dot) and @");		
			}
			if(result==29)
			{
				alert("Aadhaarno data is not filled in required fields");		
			}
			if(result==30)
			{
				alert("Aadhaarno accepts only numbers");		
			}
			if(result==31)
			{
				alert("Aadhaarno does not accept more than 16digits")		
			}
			if(result==32)
			{
				alert("MobileNumber data is not filled in required fields");		
			}
			if(result==33)
			{
				alert("MobileNumber accepts only numbers ");		
			}
			if(result==34)
			{
				alert("MobileNumber does not accept more than 10digits");		
			}
			if(result==35)
			{
				alert("Mailid data is not filled in required fields");		
			}
			if(result==36)
			{
				alert("Given mailid is not in correct format");		
			}
			if(result==37)
			{
				alert("Studytype cannot be given other than Coronary,Pediatric and Electrophysiology");		
			}
			if(result==38)
			{
				alert("registered succesfully")			
			}
			if(result==39)
			{
				alert("Given uid value already exists")	
			}
			
		}
	</script>
</head>
<body style="background-color:yellow;" onload="AlertMessage(<%= session.getAttribute("valid") %>)">
<h1 style="color:blue;font-size:300%;text-align:center;"> Welcome to Patient Registration </h1>
<h2>${welcomemessage}</h2>
<p style="text-align:left;"> Information is about the website , it was found in 2016 and purpose of www.patient.com is to sign-in and fix the doctors appointment ,is a framework to link various hospitals across the country for Aadhaar based online registration and appointment system, where counter based OPD registration and appointment system through Hospital Management Information System (HMIS) has been digitalized. The application has been hosted on the cloud services of NIC. Portal facilitates online appointments with various departments of different Hospitals using eKYC data of Aadhaar number, if patient's mobile number is registered with UIDAI. And in case mobile number is not registered with UIDAI it uses patient's name. New Patient will get appointment as well as Unique Health Identification (UHID) number. If Aadhaar number is already linked with UHID number, then appointment number will be given and UHID will remain same.</p>
<br><br>
<a href="">Doctors Appointment</a>
<a href="">Contact Us</a>
<a href="">Services</a>
<a href="">Feedback</a>
<br><br><br>
<a href="">Sign-In/Register</a>
<br><br>
<form action="patientisregisterdsuccessfully" method="post">
UID:<br><input type="text" name="UUID">
<br><br>
FirstName:<br><input type="text" name="firstname" value="tulasi">
  <br><br>
LastName:<br><input type="text" name="lastname" value=P>
  <br><br>
Age:<br><input type="text" name="age" value=31>
<br><br>
Gender:<br><select name="gender"> 
  <option value="Male">Male</options>
  <option value="Female">Female</option>
  <option value="Others">Others</option>
  <option value=""></options>
  </select>
  <br><br>
DOB:<br><input type="text" name="dob" value=12/09/2011>
<br><br>
Height:<br><input type="text" name="height" value= "5' 6"" >
<br><br>
Weight:<br><input type="text" name="Wheight" value=75>
<br><br>
BirthDay:<br><input type="text" name="birthday" value=sunday>
<br><br>
Address:<br><input type="text" name="address" value=bhjdshuihj>
<br><br>
AadhaarNo:<br> <input type="text" name="aadhaarno" value=645786937>
<br><br>
MobileNumber:<br><input type="text" name="mobilenumber" value=65784897>
  <br><br>
MailId:<br><input type="text" name="mailid" value=gydufgu@yahoo.com>
  <br><br>
Study Type:<br>
<select name=studytype>
	<option></options>
	<option>Coronary</options>
	<option>Pediatric</option>
	<option>ElectroPhysiology</option> 
</select>
 <br><br> 
  <input type="submit" value="Register">
</form>
</body>
</html>