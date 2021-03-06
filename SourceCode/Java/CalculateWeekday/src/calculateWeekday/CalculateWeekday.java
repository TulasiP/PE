package calculateWeekday;

public class CalculateWeekday 
{
	public String getWeekday(String dobValue)
	{
			
			String dateOfBirth = dobValue;
			String str = dateOfBirth;
	        String split[] = str.split("/");
			int date=Integer.parseInt(split[0]);
			int month=Integer.parseInt(split[1]);
			int year=Integer.parseInt(split[2]);
			int daysInYear=getDaysInYear(year);
			int daysInMonth=getDaysInMonth(year,month);
			String weekDay=getDayOfTheWeek(daysInYear, daysInMonth, date);
			return weekDay;
	}
	
	private int getDaysInYear(int year)
	{
		int x = year-1;
		int yearfhr= x%400;
		int yearthq=(yearfhr)/300;
		int yearthr=(yearfhr)%300;
		int yeartohq=(yearthr)/200;
		int yeartohr=(yearthr)%200;
		int yearohq=(yeartohr)/100;
		int yearohr=(yeartohr)%100;
		int noddaysinleapyear=(yearohr/4)*2;
		int noddaysinnormalyear=(yearohr)-(yearohr/4);
		int result= noddaysinleapyear+noddaysinnormalyear + yearthq * 1 + yeartohq * 3 + yearohq * 5;
		int yeardays=result%7;
		return yeardays;
	}
		
	private int getDaysInMonth(int year, int month)
	{
	    int monthdays=0;

	    for(int i=1;i<month;i++)
	    {
		    switch(i)
		    {
		        case 1: 
		        	monthdays=monthdays+31;
		        	break;
		        case 2:
		        	if(year%4==0)
		        		monthdays=monthdays+28;
		        	else
		        		monthdays=monthdays+29;
		        	break;
		        case 3: 
		        	monthdays=monthdays+31;
		        	break;
		        case 4: 
		        	monthdays=monthdays+30;
		        	break;
		        case 5: 
		        	monthdays=monthdays+31;
		        	break;
		        case 6: 
		        	monthdays=monthdays+30;
		        	break;
		        case 7: 
		        	monthdays=monthdays+31;
		        	break;
		        case 8: 
		        	monthdays=monthdays+31;
		        	break;
		        case 9: 
		        	monthdays=monthdays+30;
		        	break;
		        case 10:
		        	monthdays=monthdays+31;
		        	break;
		        case 11:
		        	monthdays=monthdays+30;
		        	break;
		        case 12:
		        	monthdays=monthdays+31;
		        	break;
		    }
	    }
	    return monthdays;
	}
	    
	private String getDayOfTheWeek(int yeardays, int monthdays, int date)
	{
		String weekday="";
		int sum;
		sum =(yeardays+date+monthdays)%7; 
	    switch(sum) 
	    {  
	    	case 1:
	    		weekday="Sunday";
	    		break;
	            
	    	case 2:
	    		weekday="Monday";
	            break;

	    	case 3:  
	    		weekday="Tuesday";
	            break;

	    	case 4:  
	            weekday="Wednesday";
	            break;

	        case 5:  
	            weekday="Thursday";
	            break;

	        case 6:  
	            weekday="Friday";
	            break;

	        case 7:  
	            weekday="Saturday"; 
	            break;
	    }
	        return weekday;
	  }
}
