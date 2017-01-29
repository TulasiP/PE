<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registered</title>
</head>
<body style="background-color: green;">
	<h1 style="color: blue; font-size: 1000%; text-align: center;">
		Successfully Registered: ${patientLog.getUUID()}</h1>
		
	<table>
		<tr>
			<td>Patient Address: </td>
			<td>country: ${patientLog.patientAddress.country}
				city: ${patientLog.patientAddress.city}
				street: ${patientLog.patientAddress.street}
				pincode: ${patientLog.patientAddress.pincode}</td>
		</tr>
		
	</table>
	<h2></h2>
</body>
</html>