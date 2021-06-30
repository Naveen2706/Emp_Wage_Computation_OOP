package com.bridgelabz.employeewagecomputation;

public class WageCalculator {

    private static final int FULLDAYHR = 8;
    private static final int PARTTIMEHR = 4;
    private static int totalMonthWage = 0;
    static int caseCheck;
    static int totalHourCount = 0;

    public static void dailyCheck() {
        caseCheck = (int) (Math.random() * 10) % 3;
    }

    public static void monthWageCalculator(int wagePerHr, int workingDay, int hourCondition) {
        dailyCheck();
        System.out.println("Total days :: " + workingDay);
        while (workingDay > 0) {
            dailyCheck();
            switch (caseCheck) {

                case 1:
                    totalMonthWage = (totalMonthWage + (wagePerHr * FULLDAYHR));
                    totalHourCount = (totalHourCount + FULLDAYHR);
                    workingDay--;
                    break;

                case 2:
                    totalMonthWage = (totalMonthWage + (wagePerHr * PARTTIMEHR));
                    totalHourCount = (totalHourCount + PARTTIMEHR);
                    workingDay--;
                    break;

                default:
                    workingDay--;

                    if (totalHourCount == hourCondition)
                        break;
            }
        }
        System.out.println("Total wage of a month :: " + totalMonthWage);
        System.out.println("Total hours of employee :: " + totalHourCount);
        System.out.println(" ");

    }

}
