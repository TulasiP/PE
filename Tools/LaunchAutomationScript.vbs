set shell=CreateObject("WScript.Shell")
shell.Run "DeltePatientData.bat"

Set App = CreateObject("QuickTest.Application")
App.Launch
App.Visible = True
App.WindowState = "Minimized" ' Minimize the Unified Functional Test window
App.ActivateView "ExpertView" ' Display the Expert View
App.open "C:\Users\Rameshbabu-P\Documents\GitHub\PE\TestCode\PatientExplorerAutomation", False 'Opens the test in editable mode
set uftTest=App.test
uftTest.Run

WScript.sleep 10000

uftTest.close
App.quit
set uftTest = nothing
set App=nothing
