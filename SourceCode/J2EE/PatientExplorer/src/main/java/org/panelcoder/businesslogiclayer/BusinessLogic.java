package org.panelcoder.businesslogiclayer;
import org.panelcoder.businesslogiclayer.contract.IBusinessLogic;
import org.panelcoder.dataaccesslayer.DataAccess;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BusinessLogic implements IBusinessLogic
{
   public void validateUid(HttpServletRequest request, HttpServletResponse response)
   {
	   long uid=0;
		try
		{
			HttpSession session=request.getSession();
			try
			{
				uid=Long.parseLong(request.getParameter("uid"));
			}
			catch(Exception e)
			{
				if(request.getParameter("uid").isEmpty())
				{
					session.setAttribute("valid", 3);
			    }
				else 
				{
					session.setAttribute("valid", 4);
				}
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
			
				
			if(uid < 0)
			{
				session.setAttribute("valid",5);
			}
			else if (uid==0) 
			{
					//uid is invalid
					session.setAttribute("valid", 0);
			}
			else if(uid > 9999999999L)
			{   
				session.setAttribute("valid",2);	
			}
			else 
			{
				// uid is valid 
				session.setAttribute("valid", 1);
				//registerDataOfApplication(request);
			}
			
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
   }
		
   public void validateFirstname(HttpServletRequest request, HttpServletResponse response)
   {
		String firstname;
		try
		{
			HttpSession session=request.getSession();
			firstname=request.getParameter("firstname");
			if(request.getParameter("firstname").isEmpty())
			{
					session.setAttribute("valid", 6);
			}	
			int asciinumber;
			for(int i=0;i<=firstname.length()-1;i++)
			{
				asciinumber=firstname.charAt(i);
				if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90 || asciinumber==32)
				{
					session.setAttribute("valid",1);
					//registerDataOfApplication(request);
				}
				else
				{
					session.setAttribute("valid",7);
				}
			}
			if(firstname.length()>50)
			{
				session.setAttribute("valid",8 );
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
   }
   
   public void validateLastname(HttpServletRequest request, HttpServletResponse response) 
   {
	   String lastname;
		try
		{
			HttpSession session=request.getSession();
			lastname=request.getParameter("lastname");
			if(request.getParameter("lastname").isEmpty())
			{
					session.setAttribute("valid", 9);
			}	
			int asciinumber;
			for(int i=0;i<=lastname.length()-1;i++)
			{
				asciinumber=lastname.charAt(i);
				if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90 || asciinumber==32)
				{
					session.setAttribute("valid",1);
					//registerDataOfApplication(request);
				}
				else
				{
					session.setAttribute("valid",10);
				}
			}
			if(lastname.length()>50)
			{
				session.setAttribute("valid",11 );
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
   
   }
   
   public void validateAge(HttpServletRequest request, HttpServletResponse response)
   {
	   long age=0;
	   try
		{
			HttpSession session=request.getSession();
			try
			{
				age=Long.parseLong(request.getParameter("age"));
			}
			catch(Exception e)
			{
				if(request.getParameter("age").isEmpty())
				{
					session.setAttribute("valid", 12);
				}
				else
				{
					session.setAttribute("valid", 13);
				}
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
			
			if(age < 0)
			{
				session.setAttribute("valid",14);
			}
			else if (age==0) 
			{
					//age is invalid
					session.setAttribute("valid", 15);
					
			}
			else if(age > 150)
			{   
				session.setAttribute("valid",16);	
			}
			else 
			{
				// age is valid 
				session.setAttribute("valid", 1);
				//registerDataOfApplication(request);
			}
			
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
   }
   
   public void validateGender(HttpServletRequest request, HttpServletResponse response)
   {
	   String gender;
		try
		{
			HttpSession session=request.getSession();
			gender=request.getParameter("gender");
			String female="Female";
			String male="Male"; 
			String other="Other";
			if(gender.compareTo(female)==0||gender.compareTo(male)==0||gender.compareTo(other)==0)
			{
				session.setAttribute("valid",1);
	
			}
			else
			{
				session.setAttribute("valid",17);	
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	  
   }
   
   public void validateDob(HttpServletRequest request, HttpServletResponse response)
   {
	   		String dob = null;
	   		try
	   		{
				HttpSession session=request.getSession();
				try
				{
					dob=request.getParameter("dob");
					if(request.getParameter("dob").isEmpty())
					{
						session.setAttribute("valid", 18);
					}
					if(Integer.parseInt(session.getAttribute("valid").toString())==18)
					{
						request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
					}
				}
				catch (Exception e) 
				{
					System.out.println(e);
				}
			
				SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
				String date=dob;
				String[] datesplit= date.split("/");
				int date1=Integer.parseInt(datesplit[0]);
				int month=Integer.parseInt(datesplit[1]);
				int year=Integer.parseInt(datesplit[2]);
				if(year>=1866)
				{
					session.setAttribute("valid",1);
					
				}
				else
				{
					session.setAttribute("valid",19);
				}
				if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
				{
					request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
				}
			 }
	   		catch(Exception e)
			{
				System.out.println(e);
			}
	   		
	}
	   
   public boolean validateHeight(HttpServletRequest request, HttpServletResponse response)
   {
	   String height = null;
	   try
	   {
		   try
		   {
			   	height=request.getParameter("height");
				
			   	if(height.isEmpty())
				{
					return false;
				}
			   	
			   	// Get length of the given height
			   	int lengthOfHeight=height.length();
			   	
			   	if(lengthOfHeight == 5 || lengthOfHeight == 6)
			   	{
			   		// Validate 0th index value
			   		// This is common for both the lengths
			   		// ASCII values of 48=0 and 57=9
			   		char c=height.charAt(0);
			   		if(!(c>=48 && c<=57))
			   		{
			   			return false;
			   		}
			   		
			   		// Validate 1st index value
			   		// It must be single quote
			   		// This is common for both the lengths
			   		// ASCII value of single quote(') is 39
			   		c=height.charAt(1);
			   		if(c!=39)
			   		{
			   			return false;
			   		}
			   		
			   		// Validate 2nd index value
			   		// ASCII value of blank space is 8
			   		// This logic is common for both the lengths
			   		c=height.charAt(2);
			   		if(c!=32)
			   		{
			   			return false;
			   		}
			   		
			   		// Get the value of index 3
			   		c=height.charAt(3);
			   		if(lengthOfHeight==5)
			   		{
			   			// If length of the height is 5
			   			// If the value of the number is between 0 and 9
			   			if(!(c>=48 && c<=57))
			   			{
			   				return false;
			   			}
			   			
			   			c=height.charAt(4);
			   			// ASCII value of Double quotes is 34
			   			if(c!=34)
			   			{
			   				return false;
			   			}
			   		}

			   		if(lengthOfHeight==6)
			   		{
			   			// If length of the height is 5
			   			// If the value of the number is between 0 and 9
			   			c=height.charAt(3);
			   			if(!(c>=48 && c<=49))
			   			{
			   				return false;
			   			}
			   			
			   			// Get the 4th index value
			   			c=height.charAt(4);
			   			if(!(c>=48 && c<=50))
			   			{
			   				// If the value is not between 0 and 2 return false
			   				return false;
			   			}
			   			c=height.charAt(5);
			   			// ASCII value of Double quotes is 34
			   			if(c!=34)
			   			{
			   				return false;
			   			}
			   		}
			   	}
			   	
			}
			catch (Exception e) 
			{
					System.out.println(e);
			}
	  			
	   }
	   catch (Exception e) 
		{
				System.out.println(e);
		}
	   	return true;

   }
	
   public void validateWeight(HttpServletRequest request, HttpServletResponse response)
   {
	   long weight = 0;
	   try
		{ 
		   HttpSession session=request.getSession();
		   try
		   {
			   weight=Long.parseLong(request.getParameter("weight"));
		   }
		   catch(Exception e)
		   {
		   	if(request.getParameter("weight").isEmpty())
		   	{
		   		session.setAttribute("valid",21);
		   	}
		   	if(Integer.parseInt(session.getAttribute("valid").toString())==21)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		   }
		   	 if(weight<0)
			{
				session.setAttribute("valid",22);
			}	
			else if(weight>300)
			{
				session.setAttribute("valid",23);
			}
			else
			{
				session.setAttribute("valid",1);
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		   
		}
		catch(Exception e)
		   {
			   System.out.println(e);
		   }
 }
	   
   public void validateBirthday(HttpServletRequest request, HttpServletResponse response)
   {
	   String birthday;
		try
		{
			HttpSession session=request.getSession();
			birthday=request.getParameter("birthday");
			if(request.getParameter("birthday").isEmpty())
			{
					session.setAttribute("valid", 24);
			}	
			int asciinumber;
			for(int i=0;i<=birthday.length()-1;i++)
			{
				asciinumber=birthday.charAt(i);
				if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90)
				{
					session.setAttribute("valid",1);
					//registerDataOfApplication(request);
				}
				else
				{
					session.setAttribute("valid",25);
				}
			}
			if(birthday.length()>50)
			{
				session.setAttribute("valid",26);
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
   }
   
   public void validateAddress(HttpServletRequest request, HttpServletResponse response)
   {
	   String address = null;
		try
		{
			HttpSession session=request.getSession();
			address=request.getParameter("address");
			
			
			if(request.getParameter("address").isEmpty())
			{
				session.setAttribute("valid", 27);
			}
				
			int asciinumber;
			for(int i=0;i<=address.length()-1;i++)
			{
				asciinumber=address.charAt(i);
				if(asciinumber>=97 && asciinumber<=122 || asciinumber>=65 && asciinumber<=90 || asciinumber>=48 && asciinumber<=57|| asciinumber==32 || asciinumber==46 || asciinumber==35 || asciinumber==64)
				{
					session.setAttribute("valid",1);
					//registerDataOfApplication(request);
				}
				else
				{
					session.setAttribute("valid",28);
				}
			}
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
   }
	   
   public void validateAadhaarno(HttpServletRequest request, HttpServletResponse response)
   {
	   long aadhaarno=0;
		try
		{
			HttpSession session=request.getSession();
			try
			{
				aadhaarno=Long.parseLong(request.getParameter("aadhaarno"));
			}
			catch(Exception e)
			{
				if(request.getParameter("aadhaarno").isEmpty())
				{
					session.setAttribute("valid", 29);
			    }
				else
				{
					session.setAttribute("valid", 30);
				}
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}

			if(aadhaarno > 9999999999999999L)
			{   
				session.setAttribute("valid",31);	
			}
			else 
			{
				// uid is valid 
				session.setAttribute("valid", 1);
				//registerDataOfApplication(request);
			}
			
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
   }
   
   public void validateMobilenumber(HttpServletRequest request, HttpServletResponse response)
   {
	  
	   long mobilenumber=0;
		try
		{
			HttpSession session=request.getSession();
			try
			{
				mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
			}
			catch(Exception e)
			{
				if(request.getParameter("mobilenumber").isEmpty())
				{
					session.setAttribute("valid", 32);
			    }
				else
				{
					session.setAttribute("valid", 33);
				}
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}

			if(mobilenumber > 9999999999L)
			{   
				session.setAttribute("valid",34);	
			}
			else 
			{
				// uid is valid 
				session.setAttribute("valid", 1);
				//registerDataOfApplication(request);
			}
			
			if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
			{
				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
   }
   
   public void validateMailid(HttpServletRequest request, HttpServletResponse response)
   {
	   String mailid=null;
	   try
	   {
		   HttpSession session=request.getSession();
		   try
		   {
			   mailid=request.getParameter("mailid");
			   if(mailid.isEmpty())
			   {
				   session.setAttribute("valid",35);
			   }
			   if(Integer.parseInt(session.getAttribute("valid").toString())==35)
				{
					request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
				}
			  
		   }
		   catch (Exception e) 
			{
				System.out.println(e);
			}
			   
		   if(mailid.contains("@") && mailid.contains("."))
		   {
			   session.setAttribute("valid",1);
		   }
		   else
		   {
			   session.setAttribute("valid",36);
		   }
		   if(Integer.parseInt(session.getAttribute("valid").toString())!=1)
		   {
			   request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
		   }	   
		   
	   }
	   catch (Exception e) 
		{
			System.out.println(e);
		}
	   
   }
   
   public void validateStudytype(HttpServletRequest request, HttpServletResponse response)
   {
	   String studytype;
		try
		{
			HttpSession session=request.getSession();
			
			try
			{
				studytype=request.getParameter("studytype");
				
				if(studytype.isEmpty())
				{
					session.setAttribute("valid",37);
					request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
				}
				
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		
   }
   
   public boolean registerDataOfApplication(HttpServletRequest request) 
   {
	   DataAccess data=new DataAccess();
	   boolean result=data.registerDataOfApplication(request);
	   return result;
   }
   
   
   
}
