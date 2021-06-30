package com.bridgelabz.employeewagecomputation;

public class EmpWageComputation {

    public static void main(String[] args) {
        WageCalculator mahindra = new WageCalculator();
        WageCalculator tata = new WageCalculator();
        WageCalculator kia = new WageCalculator();

        System.out.println("Employee Wage For Mahindra :: ");
        mahindra.monthWageCalculator(350, 25, 125);
        System.out.println("Employee Wage For Tata :: ");
        tata.monthWageCalculator(400, 23, 120);
        System.out.println("Employee Wage For Kia :: ");
        kia.monthWageCalculator(500, 22, 100);
    }

}
