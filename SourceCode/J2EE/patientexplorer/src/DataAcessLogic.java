import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DataAcessLogic 
{

	public void registerDataOfApplication(HttpServletRequest request) 
	{
		
		
			long uid=Long.parseLong(request.getParameter("uid"));
			String firstname=request.getParameter("firstname");
			String lastname=request.getParameter("lastname");
			long age=Long.parseLong(request.getParameter("age"));
			String gender=request.getParameter("gender");
			String dob=request.getParameter("dob");
			String height=request.getParameter("height");
			String weight=request.getParameter("weight");
			String birthday=request.getParameter("birthday");
			String address=request.getParameter("address");
			String aadhaarno=request.getParameter("aadhaarno");
		    String mobilenumber=request.getParameter("mobilenumber");
		    String mailid=request.getParameter("mailid");
		    String studytype=request.getParameter("studytype");
		    
		
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		 Connection conn=null;
			try
			{		
				
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance(); 
					conn=DriverManager.getConnection(connectionString);
					String insertFormat="insert into patientlog(UUID,FirstName,LastName,Age,Gender,DOB,Height,Wheight,BirthDay,Addres,Aadhaarno,MobileNumber,MailId,StudyType) values('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s','%9$s','%10$s','%11$s','%12$s','%13$s','%14$s')";
					String resultSet=String.format(insertFormat,uid, firstname,lastname,age,gender,ConvertDate1(dob),height.replace("'", "''"),weight,birthday,address,aadhaarno,mobilenumber,mailid,studytype);
					System.out.println(resultSet);
					Statement table = conn.createStatement();
					table.execute(resultSet);
//					ResultSet rs = table.executeQuery("select * from patientlog");
//					// Retrieve from ResultSet and display column data
////				     while (rs.next()) 
////				     {
//				    	
////				        System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5));
//////				        
//////				 } 
					System.out.println(resultSet);
					System.out.println("registerd succesfully");
					conn.close();
					
			}
			catch(Exception ex)
			{
					
					System.out.println(ex.toString());
					
			}
	}
	
	public String ConvertDate1(String dob) 
	{
		String format = "dd/mm/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try
		{
			Date dt = sdf.parse(dob);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
			return sdf1.format(dt);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());	
		}
		return null;
	}
}


