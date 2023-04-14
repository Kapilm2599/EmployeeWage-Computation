package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
		
		public static int wagePerHrs = 20;
		public static int fullDayHrs = 8;
		public static int halfDayHrs = 4;
		public static int salary = 0;
		public static int monthlysalary = 0;
		public static int workingDaysPerMonth = 20;
		public static int days = 0;
		public static int monthlyHrs = 0;
		
		public static int EmpWage() {
			System.out.println("Welcome to Employee Wage Java Program");
			Random random = new Random(); 
		
		
		while (days != 20 && monthlyHrs != 100) {
			days++;
			int randomNum = random.nextInt(3);
		
		switch (randomNum) {

		case 0:
			//System.out.println("Employee is Absent");
			//System.out.println("Monthly Salary will be: ");
			break;
		case 1:
			//System.out.println("Employee is Present");
			System.out.println("Monthly salary for Full Day: ");
			salary = wagePerHrs * fullDayHrs;
			break;
		case 2:
			//System.out.println("Employee is Present");
			System.out.println("Monthly Salary for Half Day: ");
			salary = wagePerHrs * halfDayHrs;
			break;

		}
		monthlysalary = monthlysalary + salary;
		System.out.println("Day" + days + "Salary is: " + salary);

	}
	System.out.println("Monthly Salary: " + monthlysalary);
	return monthlysalary;
	
	} 	
	public static void main(String[] args) {
		EmpWage();
	}


}
