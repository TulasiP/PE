using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Utility
{
    public class TestAutomation
    {
        public static Common.Logger logger = new Common.Logger();
        public void RunTestAutomation()
        {
            logger.LogMessage("Execution of test is started...");

            CommandExecution commandExecution = new CommandExecution();
            string str = "/c sqlcmd -S RAMESHBABUP -U sa -P ABCD11!!aa -i {0}";
            str = string.Format(str, @"C:\Users\Rameshbabu-P\Documents\GitHub\PE\Tools\pci.sql");
            commandExecution.RunCommand(str);

            Type quickTest = Type.GetTypeFromProgID("QuickTest.Application");
            dynamic quickTestInstance = Activator.CreateInstance(quickTest);
            quickTestInstance.Launch();
            quickTestInstance.Visible = true;
            quickTestInstance.WindowState = "Minimized"; // Minimize the Unified Functional Test window
            quickTestInstance.ActivateView("ExpertView"); // Display the Expert View
            quickTestInstance.Open("C:\\Users\\Rameshbabu-P\\Documents\\GitHub\\PE\\TestCode\\PatientExplorerAutomation",true, false); //Opens the test in editable mode
            dynamic uftTest = quickTestInstance.Test;
            uftTest.Run(null,true,null);

            uftTest.Close();
            quickTestInstance.Quit();
            uftTest = null;
            quickTestInstance = null;

            logger.LogMessage("Execution of test is completed");

            //Set FSO = CreateObject("Scripting.FileSystemObject")
            //FSO.DeleteFolder "C:\Users\Rameshbabu-P\AppData\Local\Temp\TempResults\Report"
            //FSO.MoveFolder "C:\Users\Rameshbabu-P\Documents\GitHub\PE\TestCode\PatientExplorerAutomation\Res*.*", "C:\Users\Rameshbabu-P\Documents\GitHub\bin\Test"
        }
    }
}