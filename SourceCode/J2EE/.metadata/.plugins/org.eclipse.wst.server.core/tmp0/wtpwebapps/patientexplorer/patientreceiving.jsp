<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		}
	</script>
</head>
<body onload="AlertMessage(<%= session.getAttribute("valid") %>)">
<form>
	<%
		String uid1=request.getParameter("uid");
		String firstname1=request.getParameter("firstname");
		String lastname1=request.getParameter("lastname");
		String age1=request.getParameter("age");
		String gender1=request.getParameter("gender");
		String dob1=request.getParameter("dob");
		String height1=request.getParameter("height");
		String weight1=request.getParameter("weight");
		String birthday1=request.getParameter("birthday");
		String address1=request.getParameter("address");
		String aadhaarno1=request.getParameter("aadhaarno");
		String mobilenumber1=request.getParameter("mobilenumber");
		String mailid1=request.getParameter("mailid");
		String studytype1=request.getParameter("studytype");
		
	%>

UID:<br><input type="text" name="UID" value=<%=uid1 %>>
<br><br>
FirstName:<br><input type="text" name="firstname" value=<%=firstname1 %> >
  <br><br>
LastName:<br><input type="text" name="lastname" value=<%=lastname1 %> >
  <br><br>
Age:<br><input type="text" name="age" value=<%=age1 %>>
<br><br>
Gender:<br><select name="gender"  value=<%=gender1 %>>
  
  <option value=""></options>
  <option value="Male">Male</options>
  <option value="Female">Female</option>
  <option value="Others">Others</option>
  </select>
  <br><br>
DOB:<br><input type="text" name="dob" value=<%=dob1%>>
<br><br>
Height:<br><input type="text" name="height" value=<%=height1 %>>
<br><br>
Weight:<br><input type="text" name="weight" value=<%=weight1 %>>
<br><br>
BirthDay:<br><input type="text" name="birthday" value=<%=birthday1 %>>
<br><br>
Address:<br><input type="text" name="address" value=<%=address1 %>>
<br><br>
AadhaarNo:<br> <input type="text" name="aadhaarno" value=<%=aadhaarno1 %>>
<br><br>
MobileNumber:<br><input type="text" name="mobilenumber" value=<%=mobilenumber1 %>>
  <br><br>
MailId:<br><input type="text" name="mailid" value=<%=mailid1 %>>
  <br><br>
Study Type:<br><select name=studytype value=<%=studytype1 %>>
  <option value="Coronary">Coronary</options>
  <option value="Pediatric">Pediatric</option>
  <option value="ElectroPhysiology">ElectroPhysiology</option>
 </select>
 <br><br> 
  <input type="submit" value="Register">
</form>

</body>
</html>