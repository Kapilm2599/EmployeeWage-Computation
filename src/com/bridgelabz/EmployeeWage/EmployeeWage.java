package com.bridgelabz.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Java Program");
		Random random = new Random();
		
		int wagePerHrs = 20;
		int fullDayHrs = 8;
		int salary = 0;
		int randomNum = random.nextInt(2);

		if (randomNum == 1) {
			System.out.println("Employee is Present");
			salary = wagePerHrs * fullDayHrs;
		}
		else
			System.out.println("Employee is Absent");
		
		System.out.println("Salary is: " + salary);
	}


}
