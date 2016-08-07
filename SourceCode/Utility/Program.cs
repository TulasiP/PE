using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
                    logger.LogMessage(string.Format("The argument is: {0}",argument));
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
