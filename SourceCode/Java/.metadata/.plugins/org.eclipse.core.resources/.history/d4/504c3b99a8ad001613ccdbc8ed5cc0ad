import java.text.SimpleDateFormat;
import java.util.Date;

import calculateWeekday.CalculateWeekday;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BusinessLogicValidation 
{
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean uidValidation(String uidValue)//called method and method definition
	{
		Logger.LogMessage("BusinessLogicValidation.uidValidation started");
		try
		{
			int uid=Integer.parseInt(uidValue);
			if(uidValue==null)
			{
				System.out.println(uid);
			}
		}
		catch(Exception ex)
		{
			errorMessageBox(" uid Data is not filled in required fields");
			return false;
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
		try  
		{
			long uid=Long.parseLong(uidValue);
			if(uid==0)
			{
				errorMessageBox("UID can’t be zero ");
			}
			if(uid<=0)
			{
				errorMessageBox("UID doesn’t accept negative numbers ");
			}
			if(uid<=9999999999L)
			{
				return true;
			}
			else 
			{
				errorMessageBox("UID can’t be more than 9999999999");
				return false;
			}
		}
		catch(Exception ex)
		{
			errorMessageBox("UID accepts only numbers");
			return false;
		}
		
	} 

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void nameValidation(String nameValue)
	{
		Logger.LogMessage("BusinessLogicValidation.nameValidation started");
		String name=(nameValue);
		if(name.isEmpty())
		{
			errorMessageBox(" name Data is not filled in required fields");
			return;
		}
		int asciinumber=0;
		int ascii=name.charAt(0);
		System.out.println(ascii);
		for(int i=0;i<=name.length()-1;i++)
		{
			asciinumber=name.charAt(i);
			if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90 || asciinumber==32)
			{
				System.out.println("ascii value is avaliable");
			}
			else
			{
				errorMessageBox("Name doesn’t accept special characters other than space");
				break;
			}
		}
		if(name.length()>50)
		{
			errorMessageBox("Length of the name can’t be more than 50 characters");
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ageValidation(String ageValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.ageValidation started");
		try
		{
			int age=Integer.parseInt(ageValue);
			if(ageValue==null)
			{
				System.out.println(age);
			}
		}
		catch(Exception ex)
		{
			errorMessageBox(" age Data is not filled in required fields");
			return false;
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
		try  
		{
			long age=Long.parseLong(ageValue);
			if(age==00)
			{
				errorMessageBox(" age Data is not filled in required fields");
			}
			if(age<=150)
			{
				System.out.println("given age is accepted");
			}
			else
			{
				errorMessageBox("Age can’t exceed 150 years");
			}
			if(age<=0)
			{
				errorMessageBox("Age can’t accept negative numbers");;
			}
		}
		catch(Exception ex)
		{
			errorMessageBox("Age accepts only numbers");
			return false;
		}
		return false;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void sexValidation(String sexValue) 
	{
			Logger.LogMessage("BusinessLogicValidation.sexValidation started");
			String sex=(sexValue);
			if(sex.isEmpty())
			{
				errorMessageBox("sex Data is not filled in required fields");
				return;
			}
			
			String female="Female";
			String male="Male"; 
			String other="Other";
			if(sex.compareTo(female)==0||sex.compareTo(male)==0||sex.compareTo(other)==0)
			{
				System.out.println("It should accepts");
			}
			else
			{
				errorMessageBox("Sex can’t be given other than Male, Female and Other");
			}
			Logger.LogMessage("BusinessLogicValidation.sexValidation ended");

	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean dobValidation(String dobValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.dobValidation started");
			String dob=dobValue;
			if(dob.isEmpty())
			{
				errorMessageBox("dob Data is not filled in required fields");
				return false;
			}
			 
			SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
			String date=dob;
			String[] datesplit= date.split("/");
			int date1=Integer.parseInt(datesplit[0]);
			int month=Integer.parseInt(datesplit[1]);
			System.out.println(date1);
			System.out.println(month);
			int year=Integer.parseInt(datesplit[2]);
			if(year>=1866)
			{
				System.out.println("It is valid");
			}
			else
			{
				errorMessageBox("It is not valid");
				return false;
			}
			Logger.LogMessage("BusinessLogicValidation.uidValidation ended");			
			try
			{
				Date d= fmt.parse(date);
				System.out.println(d);
				return true;
			}
			catch (Exception ex) 
			
			{
				errorMessageBox("given date is not in correct format");
				return false;
			}
			
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	public boolean heightValidation(String heightValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.heightValidation started");
		String height=(heightValue);
		if(height.isEmpty())
		{
			errorMessageBox("height Data is not filled in required fields");
			return false;
		}
		System.out.println(height.charAt(0));
			char c=height.charAt(3);
			int number=57;
			int number2=50;
			int number1=49;
			int length1=5;
			int length2=6;
			if(length1==5)
			{
				if(c<=number)
				{
					System.out.println("inches value is accepted");
				}
			}
			char c1=height.charAt(3);
			char c2=height.charAt(4);
			if(length2==6)
			{
				if(c1==number1&&c2<=number2)
				{
					System.out.println("inches value is accepted");
				}
				else
				{
					System.out.println("inches value is not accepted");
				}
			}
			Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
			
		try
		{
			char c3=height.charAt(0);
			int number3=57;
			if(c3<=number3)
			{
				System.out.println("Feets value is accepted");
				return true;
			}
		}
		catch (Exception ex) 
		{
			{
				System.out.println("Feets value is not accepted");
				return false;
			}
		}		
			
			int length=height.length();
			if(length==5||length==6)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("error");
				return false;
			}
			return false;		
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean weightValidation(String weightValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.uidValidation started");
		try
		{
			int weight=Integer.parseInt(weightValue);
			if(weightValue==null)
			{
				System.out.println(weight);
			}
		}
		catch(Exception ex)
		{
			errorMessageBox(" weight Data is not filled in required fields");
			return false;
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
		
		Logger.LogMessage("BusinessLogicValidation.uidValidation started");
		try  
		{
			long weight=Long.parseLong(weightValue);
			if(weight<=0)
			{
				errorMessageBox("Weight doesn’t accept negative numbers");	
			}
			if(weight<=300)
			{
				System.out.println("weight is accepted");
				return true;
			}
			else
			{
				errorMessageBox("Weight doesn’t accept more than 300");
				return false;
			}
		}
		catch(Exception ex)
		{
			errorMessageBox("Weight accepts only numbers");
			return false;
		}

	}		

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void addressValidation(String addressValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.addressValidation started");
		try
		{
			String address=(addressValue);
			if(address.length()==0)
			{
				errorMessageBox(" address Data is not filled in required fields");
			}
			
			int asciinumber=0;
			int ascii=address.charAt(0);
			System.out.println(ascii);
			for(int i=0;i<=address.length()-1;i++)
			{
				asciinumber=address.charAt(i);
//				System.out.println(asciinumber);
				
				if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90 || asciinumber>=48 && asciinumber<=57|| asciinumber==32 || asciinumber==46 || asciinumber==35 || asciinumber==64)
				{
					System.out.println("Address is satisfied");
				}
				else
				{
					errorMessageBox("Address doesn’t accept any special characters other than #, .(dot) and @");
					break;
				}
			}
		}
		catch(Exception ex)
		{
			errorMessageBox("Address doesn’t accept only numbers");
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean aadhaarnoValidation(String aadhaarnoValue) 
	{
		Logger.LogMessage("BusinessLogicValidation.aadhaarnoValidation started");
		try
		{
			int aadhaarno=Integer.parseInt(aadhaarnoValue);
			if(aadhaarnoValue==null)
			{
				System.out.println(aadhaarno);
			}
		}
		catch(Exception ex)
		{
			errorMessageBox(" aadhaarno Data is not filled in required fields");
			return false;
		}
		Logger.LogMessage("BusinessLogicValidation.uidValidation ended");
		try
		{
			long aadhaarno=Long.parseLong(aadhaarnoValue);
			System.out.println(aadhaarno);
			if(aadhaarno==00)
			{
				errorMessageBox("aadhaarno Data is not filled in required fields");
			}
			return true;
		}
		catch(Exception ex)
		{
			errorMessageBox("Aadhaar number accept only numbers");
			return false;
		}
		
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean PhoneNoValidation(String phonenumberValue)
	{
		try  
		{
			long PhoneNo=Long.parseLong(phonenumberValue);
//			if(phonenumber<=0)		
//			{				
//				errorMessageBox("PhoneNumber doesn’t accept negative numbers");	
//			}
			if(PhoneNo<=9999999999L)
			{
				System.out.println("PhoneNo is accepted");
				return true;
			}
			else
			{
				errorMessageBox("PhoneNo doesn’t accept more than 10digits");
				return false;
			}
		}
		catch(Exception ex)
		{
			errorMessageBox("PhoneNo accepts only numbers");
			return false;
		}

	}
//	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void studytypeValidation(String studytypeValue) 
	{
			Logger.LogMessage("BusinessLogicValidation.studytypeValidation started");
			String studytype=(studytypeValue);
			String Coronary="Coronary";
			String Pediatric="Pediatric"; 
			String Electrophysiology="Electrophysiology";
			if(studytype.compareTo(Coronary)==0||studytype.compareTo(Pediatric)==0||studytype.compareTo(Electrophysiology)==0)
			{
				System.out.println("It should accepts");
			}
			else
			{
				errorMessageBox("Study Type can’t be given other than Coronary, Paediatric and Electrophysiology");
			}
			Logger.LogMessage("BusinessLogicValidation.studytypeValidation ended");

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	private void errorMessageBox(String message) 
	{
		Alert alert=new Alert(AlertType.ERROR);
		alert.setTitle("Clinical Informatics");
		alert.setContentText(message);
		alert.showAndWait();
	}

	public void saveData(PatientInformation pi)
	{
		Logger.LogMessage("BusinessLogicValidation.saveData started");
		// Convert dob value from dd/mm/yyyy to yyyy-mm-dd 
		pi.dob=ConvertDate(pi.dob);
		DataAccessLogic data = new DataAccessLogic();
		data.saveDataOfApplication(pi);	
		Logger.LogMessage("BusinessLogicValidation.saveData started");
	}


	public PatientInformation loadData(PatientInformation pi)
	{
		Logger.LogMessage("BusinessLogicValidation.loadData started");
		DataAccessLogic data1 = new DataAccessLogic();
		PatientInformation blpi=data1.loadData(pi);
		return blpi;
		
	}

	public void ValidateData(PatientInformation pi) 
	{
		Logger.LogMessage("BusinessLogicValidation.ValidateData started");
		uidValidation(pi.uuid);
		 nameValidation(pi.name);
		 ageValidation(pi.age);
		 sexValidation(pi.sex);
		 dobValidation(pi.dob);
		 heightValidation(pi.height);
		 weightValidation(pi.wheight);
		 addressValidation(pi.addres);
		 aadhaarnoValidation(pi.aadhaarno);
		 PhoneNoValidation(pi.PhoneNo);
		 studytypeValidation(pi.studytype);
		 CalculateWeekday calc=new CalculateWeekday();
		 String day=calc.getWeekday(pi.dob);
		 pi.birthday=day;
		 Logger.LogMessage("BusinessLogicValidation.ValidateData ended");
		
	}
	
private String ConvertDate(String date) 
	{
		String format = "dd/mm/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try
		{
			Date dt = sdf.parse(date);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
			return sdf1.format(dt);
		}
		catch(Exception ex)
		{
			Logger.LogMessage(ex.toString());	
		}
		
		return null;
	}
		
}