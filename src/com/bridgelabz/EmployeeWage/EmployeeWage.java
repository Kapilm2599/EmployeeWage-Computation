package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
		
		public static int fullDayHrs = 8;
		public static int halfDayHrs = 4;
		
		private final String companyName;
		private final int WagePerHrs;
		private final int workingHrs;
		private final int workingDays;
		
		static Random random = new Random(); 
		
		public EmployeeWage(String companyName, int wagePerHrs, int workingHrs, int workingDays) {
			this.companyName = companyName;
			this.WagePerHrs = wagePerHrs;
			this.workingDays = workingDays;
			this.workingHrs = workingHrs;

		}
		public int calculateWage() {
			int salary = 0;
			int totalSalary = 0;
			int totalWorkingHrs = 0;
			int days = 0;
		
		
			while (totalWorkingHrs <= workingHrs && days <= workingDays) {
				days++;
				int empCheck = random.nextInt(3); 
		
		switch (empCheck) {
		case 1:
			//System.out.println("Employee is Present");
			System.out.println("Present Full Day: ");
			salary = WagePerHrs * fullDayHrs;
			totalWorkingHrs = totalWorkingHrs + fullDayHrs;
			break;
		case 2:
			//System.out.println("Employee is Present");
			System.out.println("Present Half Day: ");
			salary = WagePerHrs * halfDayHrs;
			totalWorkingHrs = totalWorkingHrs + halfDayHrs;
			break;
		default:
			System.out.println("Employee Absent");

		}
		System.out.print("Day: " + days + empCheck + " ");
		System.out.print("Working Hours: " + totalWorkingHrs + " ");
		System.out.print("Salary is: " + salary + " ");
		totalSalary = totalSalary + salary;
	}
	return totalWorkingHrs * WagePerHrs;
  }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Java Program");

		EmployeeWage TCS = new EmployeeWage("TCS", 23, 90, 21);
		EmployeeWage Honda = new EmployeeWage("Honda", 24, 109, 22);

		System.out.println("Total employee's wage of Company: " + TCS.companyName + ": " + TCS.calculateWage());
		System.out.println("Total employee's wage of Company: " + Honda.companyName + ": " + Honda.calculateWage());
	}
		

}
