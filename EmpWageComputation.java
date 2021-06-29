public class EmpWageComputation{

	public static void main(String[] args) {


		int fullDayHr=8;
		int partTimeHr=4;
		int wagePerHr=20;
		int day=0;
		int empHr=0;
		int wage = 0;

		while (day <= 19) {

		int caseCheck = (int) (Math.random() * 10) % 3;

		switch (caseCheck) {

		case 1:
				System.out.println("Present fullday");
				wage = (wage + (wagePerHr * fullDayHr));
            empHr = (empHr + fullDayHr);
			 day++;
			break;

		case 2:
				System.out.println("Present PartTime");
			   wage = (wage + (wagePerHr * partTimeHr));
			   empHr = (empHr + partTimeHr);
			 day++;
			break;

		default:
				System.out.println("Absent");
		    day++;

			if( empHr == 100)
				break;
		}
			 }
	
		System.out.println("Total wage of a month is");
		System.out.println(wage);
		System.out.println(empHr);
		System.out.println(day);

	}
}
