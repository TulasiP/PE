using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PatientExplorer
{
    internal class DataAccessLayer
    {
        internal void SaveToDatabase(PatientInformation patientInformation)
        {
            string insertQuery = "insert into patient(UID, Name, DOB, Age, Sex, Height, Weight, BirthDay, Address, AadhaarNo) values({0},{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}";
        }
    }
}