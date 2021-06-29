public class EmpWageComputation{

	public static void main(String[] args) {

		
		int fullDayHr = 8;
		int partTimeHr = 4;
		int wagePerHr = 20;
		int day = 0;
		int empHr = 0;
		int wage = 0;

		while (day <= 19) {

			int caseCheck = (int) (Math.random() * 10) % 3;

		switch (caseCheck) {

		case 1:
			System.out.println("Present fullday");
			wage = (wage + (wagePerHr * fullDayHr));
			day++;
			break;

		case 2:
			System.out.println("Present PartTime");
			wage = (wage + (wagePerHr * partTimeHr));
			day++;
			break;

		default:
			System.out.println("Absent");
		    day++;
		}
   		 }

		System.out.println("total wage of a month is");
		System.out.println(wage);

	}
}
