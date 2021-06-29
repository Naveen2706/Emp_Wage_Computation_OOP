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
				wage = (wage + (WAGEPERHR * FULLDAYHR));
            empHr = (empHr + FULLDAYHR);
			 day++;
			break;

		case 2:
				System.out.println("Present PartTime");
			   wage = (wage + (WAGEPERHR * PARTTIMEHR));
			   empHr = (empHr + PARTTIMEHR);
			 day++;
			break;

		default:
				System.out.println("Absent");
		    day++;

			if( empHr == 100)
				break;
		}
			 }
	
		System.out.println("Total wage of a month is :: ");
		System.out.println(wage);
		System.out.println(empHr);
		System.out.println(day);

	}
}
