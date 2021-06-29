public class EmpWageComputation{

	public static void main(String[] args) {
		
		 int caseCheck = (int)(Math.random() * 10) % 3;
		static final int FULLDAYHR = 8;
		static final int PARTTIMEHR = 4;
		static final int WAGEPERHR = 20;

		switch(caseCheck) {

		case 1:
			System.out.println("present FullDay ");
			System.out.println(WAGEPERHR * FULLDAYHR);
			break;

		case 2:
			System.out.println("present PartTime");
			System.out.println(WAGEPERHR * PARTTIMEHR);
			break;

		default:
			System.out.println("absent");
		break;

		}
	}
}
