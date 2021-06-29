public class EmpWageComputation{

	public static void main(String[] args){

		int isFullTime = 1;
		int isPartTime = 2;
		static final int FULLDAYHR = 8;
		static final int PARTTIMEHR = 4;
		static final int WAGEPERHR = 20;
		int dailyEmpWage =0;

		double empCheck = Math.floor(Math.random() * 10) % 3;

		if(empCheck == isFullTime)
		{
			System.out.println("Employee is Present");
			dailyEmpWage = WAGEPERHR * FULLDAYHR;
			System.out.println("DailyEmpWage of FullTime Employee::" + dailyEmpWage);


		}
		else if(empCheck == isPartTime)
		{
			System.out.println("Employee is Present");
			dailyEmpWage = WAGEPERHR * PARTTIMEHR;
			System.out.println("Daily Wage of PartTime Employee::" + dailyEmpWage);
		}else
		{
			System.out.println("Employee is Absent");

		}



	}

}
