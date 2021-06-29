public class EmpWageComputation{

	public static void main(String[] args) {
		
		 int caseCheck = (int)(Math.random() * 10) % 3;
		 int fullDayHr = 8;
		 int partTimeHr = 4;
		 int wagePerHr = 20;

		switch(caseCheck) {

		case 1:
			System.out.println("present FullDay ");
			System.out.println(wagePerHr * fullDayHr);
			break;

		case 2:
			System.out.println("present PartTime");
			System.out.println(wagePerHr * partTimeHr);
			break;

		default:
			System.out.println("absent");
		break;

		}
	}
}
