using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Common
{
    public class Logger
    {
        string filePath = @"C:\Users\Rameshbabu-P\Documents\GitHub\Log\PE.log";
        public void LogMessage(string message)
        {
            try
            {
                StreamWriter sw = new StreamWriter(filePath, true);
                string shortDate = DateTime.Now.ToShortDateString();
                string shortTime = DateTime.Now.ToShortTimeString();
                sw.WriteLine(string.Format("{0} {1} {2}", shortDate, shortTime, message));
                sw.Flush();
                sw.Close();
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}