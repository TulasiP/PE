using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PatientExplorer
{
    public partial class PatientExplorer : Form
    {
        public PatientExplorer()
        {
            InitializeComponent();
        }

        private void Save_Click(object sender, EventArgs e)
        {
            try
            {
                DayOfTheWeek dow = new DayOfTheWeek();
                BirthDay.Text = dow.GetDayOfTheWeek(DOB.Text);

                PatientInformation patientInfo= FillDataToPatientInformation();
                DataAccessLayer dal = new DataAccessLayer();
                dal.SaveToDatabase(patientInfo);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private PatientInformation FillDataToPatientInformation()
        {
            PatientInformation patientInfo = new PatientInformation();
            patientInfo.UID = UID.Text;
            patientInfo.Name = Name.Text;
            DateTime result;
            if (DateTime.TryParseExact(DOB.Text, "dd/MM/yyyy", CultureInfo.InvariantCulture, DateTimeStyles.None, out result))
            {
                patientInfo.DOB = result;
            }

            patientInfo.Age = Convert.ToInt32(Age.Text);
            patientInfo.Sex = Sex.Text;
            patientInfo.Height = Height.Text;
            patientInfo.Weight = Weight.Text;
            patientInfo.BirthDay = BirthDay.Text;
            patientInfo.Address = Address.Text;
            patientInfo.AadhaarNo = AadhaarNo.Text;

            return patientInfo;
        }

        private void UID_Leave(object sender, EventArgs e)
        {
            // UID Validation
            long uid;
            if (!long.TryParse(UID.Text, out uid))
            {
                MessageBox.Show("UID is not a valid number");
                UID.Focus();
            }
            else
            if (uid < 1 || uid > 9999999999)
            {
                MessageBox.Show("UID is not between the range");
                UID.Focus();
            }
        }

        private void Name_Leave(object sender, EventArgs e)
        {
            // Name Validation
            if (!Name.Text.ToString().All(c => char.IsLetter(c) || c == ' '))
            {
                MessageBox.Show("Name should have only charactors and spaces");
                Name.Focus();
            }
        }

        private void DOB_Leave(object sender, EventArgs e)
        {
            // DOB Validation
            try
            {
                string dateOfBirth = DOB.Text;
                string[] dob = dateOfBirth.Split('/');
                int date = Convert.ToInt32(dob[0]);
                int month = Convert.ToInt32(dob[1]);
                int year = Convert.ToInt32(dob[2]);
                
                if (year < 1866)
                {
                    MessageBox.Show("DOB should not be less than 1866");
                    DOB.Focus();
                }

                if (year > DateTime.Now.Year || (year == DateTime.Now.Year && month > DateTime.Now.Month) || (year == DateTime.Now.Year && month == DateTime.Now.Month && date > DateTime.Now.Day))
                {
                    MessageBox.Show("DOB should not be greater than today");
                    DOB.Focus();
                }

                DateTime result;
                string format = "dd/MM/yyyy";
                if (!DateTime.TryParseExact(DOB.Text, format, CultureInfo.InvariantCulture, DateTimeStyles.None, out result))
                {
                    MessageBox.Show("Enter a valid date");
                    DOB.Focus();
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Date is not in correct format");
                DOB.Focus();
            }
        }

        private void Age_Leave(object sender, EventArgs e)
        {
            // Age
            int result;
            if (int.TryParse(Age.Text, out result))
            {
                if (result > 150)
                {
                    MessageBox.Show("Age should not be greater than 150");
                    Age.Focus();
                }
                if (result < 0)
                {
                    MessageBox.Show("Age should not accept negative values");
                    Age.Focus();
                }
            }
            else
            {
                MessageBox.Show("Age is not in a correct format");
                Age.Focus();
            }
        }

        private void Sex_Leave(object sender, EventArgs e)
        {
            // Sex
            if (Sex.Text.ToString().All(c => char.IsLetter(c)) && (Sex.Text.Contains("Male") || Sex.Text.Contains("Female") || Sex.Text.Contains("Other")))
            {
                // do nothing
            }
            else
            {
                MessageBox.Show("Sex should be either one of the following Male, Female or Other");
                Sex.Focus();
            }

        }

        private void Height_Leave(object sender, EventArgs e)
        {
            bool flag = true;

            try
            {
                // Height 5'6" || 5'12"
                string height = Height.Text;
                int result;
                if (!int.TryParse(height[0].ToString(), out result))
                {
                    flag = false;
                }

                if (!height[1].ToString().Equals("'"))
                {
                    flag = false;
                }

                if (height.Length < 4 || height.Length > 5)
                {
                    flag = false;
                }

                if (height.Length == 4)
                {
                    if (!int.TryParse(height.Substring(2, 1), out result))
                    {
                            flag = false;
                    }
                    
                    if (height[3].CompareTo('"')!=0)
                    {
                        flag = false;
                    }
                }

                if (height.Length == 5)
                {
                    if (!int.TryParse(height.Substring(2, 2), out result))
                    {
                        flag = false;
                    }
                    else
                    {
                        if (result > 12 || result <0)
                        {
                            flag = false;
                        }
                    }

                    if (height[4] != '"')
                    {
                        flag = false;
                    }
                }

            }
            catch (Exception ex)
            {
                flag = false;
            }

            if (flag == false)
            {
                MessageBox.Show("Height is not in correct format");
                Height.Focus();
            }
        }

        private void Weight_Leave(object sender, EventArgs e)
        {
            float result;
            if(!float.TryParse(Weight.Text,out result))
            {
                MessageBox.Show("Weight is not in correct format");
                Weight.Focus();
            }
            else if(result >300 || result<0)
            {
                MessageBox.Show("Weight should not be greater than 300 kgs");
                Weight.Focus();
            }
        }

        private void AadhaarNo_Leave(object sender, EventArgs e)
        {
            if (!AadhaarNo.Text.All(c => char.IsNumber(c)))
            {
                MessageBox.Show("Aadhaar shall accept only numbers");
                AadhaarNo.Focus();
            }
        }
    }
}
