import java.sql.*;

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
			String insertFormat="insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo) values('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s','%9$s','%10$s')";
			String resultSet=String.format(insertFormat, pi.uuid , pi.name , pi.age , pi.sex , pi.dob.replace("/", "-"), pi.height.replace("'", "''") , pi.wheight , pi.birthday , pi.addres , pi.aadhaarno);
			Statement table = conn.createStatement();
			table.execute(resultSet);
			System.out.println("Values inserted successfully");
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication is ended");
			
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication retriveing is started");
			ResultSet rs = table.executeQuery("select * from patient");
			// Retrieve from ResultSet and display column data
		     while (rs.next()) 
		     {
		        System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10));
		     }
			System.out.println(resultSet);
			conn.close();
			Logger.LogMessage("DataAccessLogic.saveDataOfApplication retriveing is ended ");
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}	
	}


	public PatientInformation loadData(PatientInformation pi)
	{
		Logger.LogMessage("DataAccessLogic.loadData connectionString is started ");
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		Logger.LogMessage("DataAccessLogic.loadData connection String is ended ");
		
		Logger.LogMessage("DataAccessLogic.loadData driverManager is started ");
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs = table.executeQuery("select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno from patient where UUID=" + pi.uuid);
			while( rs.next())
			{
				pi.name =rs.getString(1);
				pi.age=rs.getString(2);
				pi.sex=rs.getString(3);
				pi.dob=rs.getString(4);
				pi.height=rs.getString(5);
				pi.wheight=rs.getString(6);
				pi.birthday=rs.getString(7);
				pi.addres=rs.getString(8);
				pi.aadhaarno=rs.getString(9);
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
	
}		