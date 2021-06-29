public class EmpWageComputation{

	public static void main(String[] args){

		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int partTimeHr = 4;
		int dailyEmpWage =0;

		double empCheck = Math.floor(Math.random() * 10) % 3;

		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
			dailyEmpWage = wagePerHr * fullDayHr;
			System.out.println("DailyEmpWage of FullTime Employee::" + dailyEmpWage);


		}
		else if(empCheck == isPartTime)
		{
			System.out.println("Employee is Present");
			dailyEmpWage = wagePerHr * partTimeHr;
			System.out.println("Daily Wage of PartTime Employee::" + dailyEmpWage);
		}else
		{
			System.out.println("Employee is Absent");

		}



	}

}
