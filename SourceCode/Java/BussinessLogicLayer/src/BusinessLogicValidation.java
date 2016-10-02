import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BusinessLogicValidation 
{
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean uidValidation(String uidValue)//called method and method definition
	{
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
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean ageValidation(String ageValue) 
	{
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
			String sex=(sexValue);
			if(sex.isEmpty())
			{
				errorMessageBox("sex Data is not filled in required fields");
				return;
			}
			
			String female="female";
			String male="male"; 
			String other="other";
			if(sex.compareTo(female)==0||sex.compareTo(male)==0||sex.compareTo(other)==0)
			{
				System.out.println("It should accepts");
			}
			else
			{
				errorMessageBox("Sex can’t be given other than Male, Female and Other");
			}

	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean dobValidation(String dobValue) 
	{
			String dob=(dobValue);
			if(dob.isEmpty())
			{
				errorMessageBox("dob Data is not filled in required fields");
				return false;
			}
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			String date=dob;
			String[] datesplit= date.split("/");
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
			String todaydate="17-09-2016";
			if(dob.compareTo(todaydate)<0)
			{
				return true;
			}
			else
			{
				System.out.println("greater than today date is not valid");
			}
			try
			{
				Date d= fmt.parse(dob);
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

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public void birthdayValidation(String dateOfBirthValue ) 
	{
			
//			
			String dateOfBirth = dateOfBirthValue;
			if(dateOfBirth.isEmpty())
			{
				errorMessageBox("dateofbirth Data is not filled in required fields");
				return;
			}
			System.out.println(dateOfBirth);
//			CalculateWeekday calc=new CalculateWeekday();
//			String day=calc.getWeekday();
//			birthdayText.setText(day);
//			System.out.println(day);
//			System.out.println(calc.getWeekday());

			
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void addressValidation(String addressValue) 
	{

		try
		{
			String address=(addressValue);
			if(address.length()==0)
			{
				errorMessageBox(" address Data is not filled in required fields");
			}
			//String address1="gdfkjshk";
//			if(address.compareTo(address1)>0)
//			{
//				System.out.println("Address is satisfied");
//			}
//			else
//			{
//				errorMessageBox("Address doesn’t accept only numbers");
//			}
			
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
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public boolean aadhaarnoValidation(String aadhaarnoValue) 
	{
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

	private void errorMessageBox(String message) 
	{
		Alert alert=new Alert(AlertType.ERROR);
		alert.setTitle("Clinical Informatics");
		alert.setContentText(message);
		alert.showAndWait();
	}

	public void saveData(String uidValue)
	{
		DataAccessLogic data = new DataAccessLogic();
		data.saveDataOfApplication(uidValue);
	}
}