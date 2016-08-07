using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PatientExplorer
{
    internal class DayOfTheWeek
    {
        internal string GetDayOfTheWeek(string date)
        {
            string[] x = date.Split('/');
            int day = Convert.ToInt32(x[0]);
            if (!day.ToString().All(c => char.IsDigit(c)))
                throw new Exception("Date is not in correct format");

            int month = Convert.ToInt32(x[1]);
            if (!month.ToString().All(c => char.IsDigit(c)))
                throw new Exception("Month is not in correct format");
            int year = Convert.ToInt32(x[2]);

            if (!year.ToString().All(c => char.IsDigit(c)))
                throw new Exception("Year is not in correct format");

            string givenDate = day + "-" + month + "-" + year;
            int Numberoddaysinmonth = CalculatedaysofMonth(year, month);
            int NumberOfOddDaysInYear = CalculateDaysAccordingToYear(year);
            int final = day + Numberoddaysinmonth + NumberOfOddDaysInYear;
            int res = final % 7;
            string dow = CalculateDayOfTheWeek(res);
            return dow;
        }

        private string CalculateDayOfTheWeek(int res)
        {
            string day = "";
            switch (res)
            {
                case 0:
                    day = "Sunday";
                    break;
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
            }
            return day;
        }

        private int CalculateDaysAccordingToYear(int year)
        {
            int x = year - 1;
            int yearfhr = x % 400;
            int yearthq = yearfhr / 300;
            int yearthr = yearfhr % 300;
            int yeartohq = yearthr / 200;
            int yeartohr = yearthr % 200;
            int yearohq = yeartohr / 100;
            int yearohr = yeartohr % 100;
            int noddaysinleapyear = (yearohr / 4) * 2;
            int noddaysinnormalyear = yearohr - (yearohr / 4);
            int result = noddaysinleapyear + noddaysinnormalyear + yearthq * 1 + yeartohq * 3 + yearohq * 5;
            return result;
        }

        private int CalculatedaysofMonth(int year, int month)
        {
            int days = 0;
            for (int i = 1; i <= month - 1; i++)
            {
                switch (i)
                {
                    case 1:
                        days = days + 31;
                        break;
                    case 2:
                        if (year % 4 == 0)
                            days = days + 29;
                        else
                            days = days + 28;
                        break;
                    case 3:
                        days = days + 31;
                        break;
                    case 4:
                        days = days + 30;
                        break;
                    case 5:
                        days = days + 31;
                        break;
                    case 6:
                        days = days + 30;
                        break;
                    case 7:
                        days = days + 31;
                        break;
                    case 8:
                        days = days + 31;
                        break;
                    case 9:
                        days = days + 30;
                        break;
                    case 10:
                        days = days + 31;
                        break;
                    case 11:
                        days = days + 30;
                        break;
                    case 12:
                        days = days + 31;
                        break;
                }
            }
            return days;
        }

    }
}