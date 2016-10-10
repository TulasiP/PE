import java.io.*;
import java.util.Date;

public class Logger 
{
	public static void LogMessage(String logMessage)
	{
		File myFile = new File("C:/Users/Rameshbabu-P/Documents/GitHub/Log/","PATEXN.log");
		try 
		{
			if(!myFile.exists())
			{
				myFile.createNewFile();
			}
			
			FileWriter fileWriter=new FileWriter(myFile,true);
			BufferedWriter bf = new BufferedWriter(fileWriter);
			Date date = new Date();
			String datetime=date.toString();
			bf.newLine();
			bf.write(datetime + "  " + logMessage);
			bf.newLine();
			bf.flush();
			bf.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

