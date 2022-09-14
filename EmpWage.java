package bl.com.day9empwageusingoops;

public class EmpWage {

	
	
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("--------Calculating Employee Wage for Multiple Companies----------");
		System.out.println('\n');
		
		
		EmpWageBuilder bigBazaar = new EmpWageBuilder();
		System.out.println("1st company");
		System.out.println('\n');
	
		bigBazaar.calculatewagestillconditionmet(200, 25, 200, "bigBazaar");
		System.out.println('\n');
		
		System.out.println("2nd company");
		System.out.println('\n');
		EmpWageBuilder pantaloons = new EmpWageBuilder();
		pantaloons.calculatewagestillconditionmet(220, 25, 250, "pantaloons");
		System.out.println('\n');
		
		
		System.out.println("3rd company");
		System.out.println('\n');
		EmpWageBuilder Max = new EmpWageBuilder();
		Max.calculatewagestillconditionmet(250, 26, 260, "Max");
		
		System.out.println('\n');
		
		System.out.println("-------End of the Program-------");
		
	}
	
	
	
	
	
}



class EmpWageBuilder
{
	int empHrs;
	int totalsalary;
	
	int totalHrs;

	public void calculatewagestillconditionmet(int empRatePerHr,int totalDays, int totalWorkingHrs,String companyname) {
	
	final byte isPartTime=1;
	final byte isFulltime=2;
	int salary=0;
	
	
	
	
	
		
		for (int day=1;day<=totalDays && totalHrs<=totalWorkingHrs ;day++)
		
		{
			

			int partOrFulltime =  (int)Math.floor(Math.random()  *3);
			
			switch (partOrFulltime) {
    		
			case isFulltime:
				
				empHrs=10;
				
				break;
				
			case isPartTime:
				
				empHrs=8;
				
				break;
		    
		    case 0:
		    	empHrs=0;
				
				break;
		        
		    default:
		    	System.out.println("NO EMPLOYEE DATA");
		    	
		    	
			}
		    	
			totalHrs=totalHrs+empHrs;
		    	
		    	
		    	if(totalHrs>totalWorkingHrs)
		    	{
		    		totalHrs=totalHrs-empHrs;
		    		break;
		    	}
		    	System.out.println("totalworkinghrs= "+ totalHrs);
		    	
		    	salary= empHrs * empRatePerHr;

		    	totalsalary=totalsalary + salary;
		    	System.out.println("total accumulated salary till now = " + totalsalary );
			
		}
		
	
		System.out.println("final totalworkinghrs= "+ totalHrs);
		System.out.println("total salary for the month for the employee working in company : " + companyname + " is = " +totalsalary );
	}
		
	









}