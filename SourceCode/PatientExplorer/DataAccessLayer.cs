using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PatientExplorer
{
    internal class DataAccessLayer
    {
        internal void SaveToDatabase(PatientInformation patientInformation)
        {
            try
            {
                string insertQuery = "insert into patient(UUID, Name, DOB, Age, Sex, Height, Wheight, BirthDay, Addres, AadhaarNo) values('{0}','{1}','{2}',{3},'{4}','{5}','{6}','{7}','{8}','{9}');";
                string query = string.Format(insertQuery,
                    patientInformation.UID,
                    patientInformation.Name,
                    patientInformation.DOB,
                    patientInformation.Age,
                    patientInformation.Sex,
                    patientInformation.Height.Replace("'","''"),
                    patientInformation.Weight,
                    patientInformation.BirthDay,
                    patientInformation.Address,
                    patientInformation.AadhaarNo
                    );

                SqlConnectionStringBuilder connectionStringBuilder = new SqlConnectionStringBuilder();
                connectionStringBuilder.IntegratedSecurity = true;
                connectionStringBuilder.InitialCatalog = "pcidb";
                connectionStringBuilder.ApplicationName = "PE";
                SqlConnection conn = new SqlConnection(connectionStringBuilder.ConnectionString);
                conn.Open();
                SqlCommand cmd = new SqlCommand(query, conn);
                //MessageBox.Show(query);
                int result = cmd.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}