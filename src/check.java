import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class check {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Date: ");
		
		// Validating date
		int date = Integer.parseInt(br.readLine());
		if(date <=0 || date >31)
		{
			System.out.print(date +"  -- INVALID DATE");
			System.exit(1); // to terminate the console
		}
		else
		{
			System.out.print(date  +"  -- VALID DATE");
		}
		System.out.println();
		
		System.out.println("Enter Month: ");
		int month = Integer.parseInt(br.readLine());

		// Validating month
	    if(month <=0 || month >12)
		{
			System.out.print(month +"  -- INVALID MONTH");
			System.exit(1); // to terminate the console
		}
		else
		{
			System.out.print(month +"  -- VALID MONTH");
		}
	    System.out.println();
	    // THOSE MOPNTH IN WHICH WE HAVE 31 DAYS - 1 3 5 7 8 10 12
	    if(month == 1 || month == 3 || month == 5  || month == 7 || month == 8 || month == 10 || month == 12)
	    {
	    	if(date <0 || date >31)
			{
				System.out.print(date +"  -- INVALID DATE for this month");
				System.exit(1); // to terminate the console
			}
	    	else
	    	{
	    		System.out.print(date +"  -- This month contains 31 days in it");
	    	}
	    }
		// THOSE MOPNTH IN WHICH WE HAVE 30 DAYS - 4 6 9 11
	    if(month == 4 || month == 6 || month == 9  || month == 11 )
	    {
	    	if(date <0 || date >30)
			{
				System.out.print(date +"  -- INVALID DATE for this month");
				System.exit(1); // to terminate the console
			}
	    	else
	    	{
	    		System.out.print(date +"  -- This month contains 30 days in it");
	    	}
	    }
		System.out.println();
		System.out.println("Enter Year : ");
		int year = Integer.parseInt(br.readLine());
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
	    
		// Checking for leap year
		System.out.print("Checking for leap year : ");
      
        if (isLeapYear)
        {
        	System.out.println(year + " is a leap year");
        } 
        else
        {
        	System.out.print(year + " is not a leap year");
        }
        System.out.println();
       
        if(month == 2 && !isLeapYear )
		{
			if(date <0 || date >28)
			{
				System.out.print(date +"  -- INVALID DATE FOR FEB WHEN IT IS NOT AN LEAP YAER");
				System.exit(1); // to terminate the console
			}
			else
			{
				System.out.print(date  +"  -- VALID DATE FOR FEB WHEN IT IS NOT AN LEAP YAER");
			}
		}
		else if(month == 2 && isLeapYear)
		{
			if(date <0 || date >29)
			{
				System.out.print(date +"  -- INVALID DATE FOR FEB WHEN IT IS AN LEAP YAER");
				System.exit(1); // to terminate the console
			}
			else
			{
				System.out.print(date  +"  -- VALID DATE FOR FEB WHEN IT IS AN LEAP YAER");
			}
		}
		
		 System.out.println();
		 System.out.println("PRESENT DATE : " +date +"-" +month +"-" +year);
		 
		 
		 // to print the next date what the user has entered
		// checking for NEW YAER
		    if(date == 31 &&  month == 12 )
		    { 
		    	date = 1;
		    	month = 1;
		    	year++;
		    	 System.out.println("NEXT DATE : " +date +"-" +month +"-" +year); 
		    	 System.exit(1);
		    	
		    }
	 else if(month == 2 && isLeapYear)
	     {
			 if(date<29)
			 {
				 date++;
			 
		     }
			 else if(date == 29)
			 {
				 date = 1;
				 month++;
			 }
			 else
			 {
				 System.out.println("NOT VALID"); 
			 }
			 System.out.println("NEXT DATE : " +date +"-" +month +"-" +year); 
		 }
	 else if(month == 2 && !isLeapYear)
		 {
			 if(date<28)
			 {
				 date++;
			 
		     }
		    else if(date == 28)
			 {
				 date = 1;
				 month++;
			 }
			 else
			 {
				 System.out.println("NOT VALID"); 
			 }
			 
		 }
		 // THOSE MONTH IN WHICH WE HAVE 31 DAYS - 1 3 5 7 8 10 12
	 else if(month == 1 || month == 3 || month == 5  || month == 7 || month == 8 || month == 10 || month == 12)
		    {
		    	if(date<31)
				 {
					 date++;
				 
			     }
			    else if(date == 31)
				 {
					 date = 1;
					 month++;
				 }
				 else
				 {
					 System.out.println("NOT VALID"); 
				 }
		    }
		 // THOSE MONTH IN WHICH WE HAVE 30 DAYS - 4 6 9 11
	 else if(month == 4 || month == 6 || month == 9  || month == 11 )
		    {
		    	if(date<30)
				 {
					 date++;
				 
			     }
			    else if(date == 30)
				 {
					 date = 1;
					 month++;
				 }
				 else
				 {
					 System.out.println("NOT VALID"); 
				 }
		    }
		    
		  System.out.println("NEXT DATE : " +date +"-" +month +"-" +year); 
	}
}

