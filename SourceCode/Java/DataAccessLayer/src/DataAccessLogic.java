import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataAccessLogic 
{
	public void saveDataOfApplication(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			String insertFormat="insert into patient(UUID) values(100)";
			Statement table = conn.createStatement();
			table.execute(insertFormat);
			System.out.println("Values inserted successfully");
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}
