using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Utility
{
    public class CommandExecution
    {
        public static Common.Logger logger = new Common.Logger();
        public void RunCommand(string arguments)
        {
            logger.LogMessage(string.Format("Command execution started the arguments are: {0}", arguments));
            Process process = new Process();
            process.StartInfo.FileName = "cmd.exe";
            process.StartInfo.UseShellExecute = true;
            //process.StartInfo.RedirectStandardOutput = true;
            process.StartInfo.Arguments = arguments;
            process.Start();

            // Synchronously read the standard output of the spawned process. 
            //StreamReader reader = process.StandardOutput;
            //string output = reader.ReadToEnd();

            // Write the redirected output to this application's window.
            //Console.WriteLine(output);

            process.WaitForExit();
            process.Close();

            logger.LogMessage("Command execution is completed");
        }
    }
}
