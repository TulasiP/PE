import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAccessLogic 

{
	public void saveDataOfApplication(PatientInformation pi)
	{
		
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication is started");
			
			Statement selectStudyNoStatement = conn.createStatement();
			ResultSet rsStudyNo = selectStudyNoStatement.executeQuery(String.format("select studyno from studytype where studytype='%1$s'", pi.studytype));
			rsStudyNo.next();
			int studyNo=rsStudyNo.getInt(1);
			String insertFormat="insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo , StudyType) values('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s','%9$s','%10$s','%11$s',%12$s)";
			String resultSet=String.format(insertFormat, pi.uuid , pi.name , pi.age , pi.sex , pi.dob.replace("/", "-"), pi.height.replace("'", "''") , pi.wheight , pi.birthday , pi.addres , pi.aadhaarno , pi.PhoneNo , studyNo);
			Logger.LogMessage("insert statement is: " + resultSet);
			Statement table = conn.createStatement();
			table.execute(resultSet);
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication is ended");
			
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication retriveing is started");
			ResultSet rs = table.executeQuery("select * from patient");
			// Retrieve from ResultSet and display column data
		     while (rs.next()) 
		     {
		    	Logger.LogMessage("DataAccessLogic.saveDataOfApplication is started rs.getInt(1) +  rs.getString(2) +  rs.getInt(3) + rs.getString(4) + rs.getString(5) + rs.getString(6) +  rs.getString(7) +  rs.getString(8) +  rs.getString(9) + rs.getString(10)+ rs.getString(11)+ rs.getString(12)");
		        System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10) + rs.getString(11) + rs.getString(12));
		        Logger.LogMessage("DataAccessLogic.saveDataOfApplication is ended");
		     }
		     
			System.out.println(resultSet);
			System.out.println("Values inserted successfully");
			conn.close();
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication retriveing is ended ");
			
		}
		catch(Exception ex)
		{
			Logger.LogMessage("DataAccessLogic.ex.toString() is started");
			System.out.println(ex.toString());
			Logger.LogMessage("DataAccessLogic.ex.toString() is ended");
		}	
	}


	public PatientInformation loadData(PatientInformation pi)
	{
		Logger.LogMessage("DataAccessLogic.loadData connectionString is started ");
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		Logger.LogMessage("DataAccessLogic.loadData connection String is ended ");
		
		
		try
		{
			Logger.LogMessage("DataAccessLogic.loadData driverManager is started ");
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs = table.executeQuery("select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno,PhoneNo,studytype from patient where UUID=" + pi.uuid);
			while( rs.next())
			{
				pi.name =rs.getString(1);
				pi.age=rs.getString(2);
				pi.sex=rs.getString(3);
				pi.dob=ConvertDate1(rs.getString(4));
				pi.height=rs.getString(5);
				pi.wheight=rs.getString(6);
				pi.birthday=rs.getString(7);
				pi.addres=rs.getString(8);
				pi.aadhaarno=rs.getString(9);
				pi.PhoneNo=rs.getString(10);
				//pi.studytype=rs.getString(11);
				Statement selectStudytypeStatement = conn.createStatement();
				ResultSet rsStudytype = selectStudytypeStatement.executeQuery(String.format("select studytype from studytype where studyno=" + rs.getString(11)));
				rsStudytype.next();
				String studytype1=rsStudytype.getString(1);
				System.out.println(studytype1);
				pi.studytype=studytype1;
				return pi;	
			}
			
			Logger.LogMessage("DataAccessLogic.loadData driverManager is ended");
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return null;		
	}
	
	
	private String ConvertDate1(String date) 
	{
		String format = "yyyy-mm-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try
		{
			Date dt = sdf.parse(date);
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
			return sdf1.format(dt);
		}
		catch(Exception ex)
		{
			Logger.LogMessage(ex.toString());	
		}
		
		return null;
	}
			
	
}		