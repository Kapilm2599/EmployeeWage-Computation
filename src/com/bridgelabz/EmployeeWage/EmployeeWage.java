package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Java Program");
		Random random = new Random();
		
		int wagePerHrs = 20;
		int fullDayHrs = 8;
		int halfDayHrs = 4;
		int salary = 0;
		int monthlysalary = 0;
		int days = 0;
		int monthlyHrs = 0;
		
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
	
	} 	


}
