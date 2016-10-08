import java.sql.*;

public class DataAccessLogic 

{
	public void saveDataOfApplication(String uidValue, String nameValue, String ageValue, String sexValue, String dobValue, String heightValue, String weightValue, String birthdayValue, String addressValue, String aadhaarnoValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			String insertFormat="insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo) values('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s','%9$s','%10$s')";
			String resultSet=String.format(insertFormat, uidValue , nameValue , ageValue , sexValue , dobValue.replace("/", "-"), heightValue.replace("'", "''") , weightValue , birthdayValue , addressValue , aadhaarnoValue);
			Statement table = conn.createStatement();
			ResultSet rs = table.executeQuery("select * from patient");

		     // Retrieve from ResultSet and display column data
		     while (rs.next()) 
		     {
		        System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9) + " " + rs.getString(10));
		     }
			System.out.println(resultSet);
			table.execute(resultSet);
			System.out.println("Values inserted successfully");
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}	
	}


	public String loadData(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs = table.executeQuery("select name from patient where UUID=1");
			while( rs.next())
			{
				String name=rs.getString(1);
				//System.out.println(name);
				return name;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}
	
	public String loadData1(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs1 = table.executeQuery("select Age from patient where UUID=1");
			while( rs1.next())
			{
				String age=rs1.getString(1);
				//System.out.println(age);
				return age;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
		
	}
	
	public String loadData2(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs2 = table.executeQuery("select Sex from patient where UUID=1");
			while( rs2.next())
			{
				String sex=rs2.getString(1);
				return sex;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
		
	}
	public String loadData3(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs3 = table.executeQuery("select DOB from patient where UUID=1");
			while( rs3.next())
			{
				String dob=rs3.getString(1);
				return dob;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
		
	}
	
	public String loadData4(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs4 = table.executeQuery("select height from patient where UUID=1");
			while( rs4.next())
			{
				String height=rs4.getString(1);
				return height;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}
	
	public String loadData5(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs5 = table.executeQuery("select wheight from patient where UUID=1");
			while( rs5.next())
			{
				String weight=rs5.getString(1);
				return weight;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}

	public String loadData6(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs6 = table.executeQuery("select BirthDay from patient where UUID=1");
			while( rs6.next())
			{
				String birthday=rs6.getString(1);
				return birthday;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}
	
	public String loadData7(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs7 = table.executeQuery("select Addres from patient where UUID=1");
			while( rs7.next())
			{
				String address=rs7.getString(1);
				return address;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}
	
	public String loadData8(String uidValue)
	{
		String connectionString = "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(connectionString);
			Statement table = conn.createStatement();
			ResultSet rs8 = table.executeQuery("select AadhaarNo from patient where UUID=1");
			while( rs8.next())
			{
				String aadhaarNo=rs8.getString(1);
				return aadhaarNo;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return uidValue;
		
	}

}

	

		