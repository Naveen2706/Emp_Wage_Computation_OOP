public class EmpWageComputation{

	public static void main(String[] args){
		
		int isFullTime = 1;
		static final int FULLDAYHR = 8;
		static final int WAGEPERHR = 20;
		double empCheck = Math.floor(Math.random()*10)%2;

		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
			int DailyEmpWage = WAGEPERHR * FULLDAYHR;
			System.out.println("DailyEmpWage::" + DailyEmpWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}
	
}
