using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace Utility
{
    class Program
    {
        public static Common.Logger logger = new Common.Logger();
        static void Main(string[] args)
        {
            try
            {
                int numberOfArguments = args.Count();
                string argument = string.Empty;

                if (numberOfArguments != 1)
                {
                    logger.LogMessage("Wrong number of arguments");
                    throw new Exception("Wrong number of arguments");
                }
                else
                {
                    logger.LogMessage(string.Format("The argument is: {0}", argument));
                    argument = args[0];
                }

                if (argument.Equals("/?"))
                {
                    logger.LogMessage("/tu: Test automation");
                    Console.WriteLine("/tu: Test automation");
                }
                else if (argument.Equals("/tu"))
                {
                    TestAutomation testAutomation = new TestAutomation();
                    testAutomation.RunTestAutomation();
                }
                else if (argument.Equals("/xml"))
                {
                    IEnumerable<string> allLines = File.ReadAllLines(@"C:\Users\Rameshbabu-P\Documents\GitHub\bin\xml\systemTestResults.txt");
                    bool isFailed = false;
                    string run = string.Empty;
                    string succeding = string.Empty;
                    string failures = string.Empty;
                    string errors = string.Empty;
                    List<string> reasonForErrors = new List<string>();

                    foreach (string line in allLines)
                    {
                        if (line.Contains("!!!FAILURES!!!"))
                        {
                            isFailed = true;
                        }

                        if (isFailed && line.Contains("Failures: "))
                        {
                            string[] stringSeparators = new string[] { "   " };
                            string[] results = line.Split(stringSeparators, StringSplitOptions.None);
                            run = results[0].Substring("Run:  ".Length);
                            succeding = results[1].Substring("Succeding: ".Length);
                            failures = results[2].Substring("Failures: ".Length);
                            errors = results[3].Substring("Errors: ".Length);
                        }

                        if (isFailed && line.Contains(" : error "))
                        {
                            reasonForErrors.Add(line);
                        }
                    }

                    if (isFailed)
                    {
                        XmlTextWriter xmlTextWriter = new XmlTextWriter(@"C:\Users\Rameshbabu-P\Documents\GitHub\bin\xml\SystemTestParsed.xml", Encoding.UTF8);
                        xmlTextWriter.WriteStartElement("SystemTest"); // SystemTest start

                        xmlTextWriter.WriteStartElement("Run"); // Run start
                        xmlTextWriter.WriteString(run);
                        xmlTextWriter.WriteEndElement(); // Run end

                        xmlTextWriter.WriteStartElement("Succeding"); // Succeding start 
                        xmlTextWriter.WriteString(succeding);
                        xmlTextWriter.WriteEndElement(); // succeding end

                        xmlTextWriter.WriteStartElement("Errors"); // Errors start
                        xmlTextWriter.WriteString(errors);
                        xmlTextWriter.WriteEndElement(); // Errors end

                        xmlTextWriter.WriteStartElement("Failures"); // Failures start
                        xmlTextWriter.WriteString(failures);
                        xmlTextWriter.WriteEndElement(); // Failures end

                        foreach (string error in reasonForErrors)
                        {
                            xmlTextWriter.WriteStartElement("ReasonForFailure"); // ReasonForFailure start
                            xmlTextWriter.WriteString(error.Replace('"', ' '));
                            xmlTextWriter.WriteEndElement(); // ReasonForFailure end
                        }

                        xmlTextWriter.WriteEndElement(); // SystemTest end
                        xmlTextWriter.Close();
                    }
                }
            }
            catch (Exception ex)
            {
                logger.LogMessage(ex.Message);
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("\n\nPress any key to exit.");
                //Console.ReadKey();
            }
        }
    }
}