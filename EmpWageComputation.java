public class EmpWageComputation{

	public static void main(String[] args){
		
		int isFullTime = 1;
		int WagePerHr = 20;
		int FullDayHr = 8;
		
		double empCheck = Math.floor(Math.random()*10)%2;

		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
			int DailyEmpWage = WagePerHr * FullDayHr;
			System.out.println("DailyEmpWage::" + DailyEmpWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}
	
}
