package com.bridgelabz.employeewagecomputation;

public class EmpWageComputation {
    static final int FULLDAYHR = 8;
    static final int PARTTIMEHR = 4;
    static final int WAGEPERHR = 20;
    int day = 0;
    int empTotalHour = 0;
    int totalMonthWage = 0;
    static int caseCheck;

    public static int dailyCheck() {
        caseCheck = (int) (Math.random() * 10) % 3;
        return caseCheck;
    }

    public void monthWageCalculator() {
        while (day <= 19) {
            dailyCheck();
            switch (caseCheck) {

                case 1:
                    System.out.println("Present fullday");
                    totalMonthWage = (totalMonthWage + (WAGEPERHR * FULLDAYHR));
                    empTotalHour = (empTotalHour + FULLDAYHR);
                    day++;
                    break;

                case 2:
                    System.out.println("Present PartTime");
                    totalMonthWage = (totalMonthWage + (WAGEPERHR * PARTTIMEHR));
                    empTotalHour = (empTotalHour + PARTTIMEHR);
                    day++;
                    break;

                default:
                    System.out.println("Absent");
                    day++;

                    if (empTotalHour == 100)
                        break;
            }
        }
        System.out.println("Total wage of a month :: " + totalMonthWage);
        System.out.println("Total hours of employee :: " + empTotalHour);
        System.out.println("Total days :: " + day);
    }

    public static void main(String[] args) {
        EmpWageComputation ewcObj = new EmpWageComputation();
        ewcObj.monthWageCalculator();
    }

}
