public class EmpWageComputation{

	public static void main(String[] args) {

		
		static final int FULLDAYHR = 8;
		static final int PARTTIMEHR = 4;
		static final int WAGEPERHR = 20;

		int day = 0;
		int empHr = 0;
		int wage = 0;

		while (day <= 19) {

			int caseCheck = (int) (Math.random() * 10) % 3;

		switch (caseCheck) {

		case 1:
			System.out.println("Present fullday");
			wage = (wage + (wWAGEPERHR * FULLDAYHR));
			day++;
			break;

		case 2:
			System.out.println("Present PartTime");
			wage = (wage + (WAGEPERHR * PARTTIMEHR));
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
