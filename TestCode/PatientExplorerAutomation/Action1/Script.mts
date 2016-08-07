
'=====================================================================================================reading from excel=======================================================================================================================================
Set xl=CreateObject("Excel.Application")
Set wb=xl.Workbooks.Open("C:\Users\Rameshbabu-P\OneDrive\Patient Explorer Project\TestCode\AutomationInput.xls")
xl.Visible= true
Set ws=wb.worksheets(1)
rows=ws.usedrange.rows.count
columns=ws.usedrange.columns.count

For row = 2 to rows
	 	uid = ws.cells(row,1)
	 	name = ws.cells(row,2)
	 	dob = ws.cells(row,3)
	 	age = ws.cells(row,4)
	 	sex = ws.cells(row,5)
	 	height = ws.cells(row,6)
	 	weight = ws.cells(row,7)
	 	address = ws.cells(row,9)
	 	aadhaarno = ws.cells(row,10)
'	 	aadhaarno2 = vartype(ws.cells(row,10))
	 	
	 	SystemUtil.Run("C:\Users\Rameshbabu-P\OneDrive\Patient Explorer Project\SourceCode\PatientExplorer\bin\Release\PatientExplorer")
		SwfWindow("PatientExplorer").SwfEdit("UID").Type ""
		SwfWindow("PatientExplorer").SwfEdit("UID").Type uid
		SwfWindow("PatientExplorer").SwfEdit("Name").Set name
		SwfWindow("PatientExplorer").SwfEdit("DOB").Set dob
		SwfWindow("PatientExplorer").SwfEdit("Age").Set age
		SwfWindow("PatientExplorer").SwfEdit("Sex").Set sex
		SwfWindow("PatientExplorer").SwfEdit("Height").Set height
		SwfWindow("PatientExplorer").SwfEdit("Weight").Set weight
		SwfWindow("PatientExplorer").SwfEdit("Address").Set address
		SwfWindow("PatientExplorer").SwfEdit("AadhaarNo").Set aadhaarno
		SwfWindow("PatientExplorer").SwfButton("Save").Click
		SwfWindow("PatientExplorer").Close
Next

'wb.Close
Set wb=nothing
Set xl=nothing
'================================================================================================================end==============================================================================================================================================='
'

' Read uid value from excel
' Store uid value into a variable
' Pass this variable to application
' Repead above step for all fields
' Click on save button

