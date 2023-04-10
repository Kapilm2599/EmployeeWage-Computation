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
		int randomNum = random.nextInt(3);

		if (randomNum == 1) {
			System.out.println("Employee is Present");
			salary = wagePerHrs * fullDayHrs;
		}else if (randomNum == 2) {
			salary = wagePerHrs * halfDayHrs;
			System.out.println("Employee is Present for half day");
		}
		else
			System.out.println("Employee is Absent");
		
		System.out.println("Salary is: " + salary);
	}

}
