package task2;

import java.util.*;

class Employee {
	private int empId;
	private String empName;
	private double sal;
	private int yearsWorked;

	// Method to set employee details
	public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.yearsWorked = yearsWorked;
	}

	// Method to get employee details
	public void getEmployeeDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + sal);
		System.out.println("Years Worked: " + yearsWorked);
	}

	// Method to check loan eligibility
	public void getLoanEligibility() {
		if (yearsWorked <= 5) {
			System.out.println("Not eligible for loan: Less than 5 years of service.");
			return;
		}

		double annualSalary = sal * 12;
		System.out.println("Annual Salary: " + annualSalary);

		if (annualSalary >= 1500000) {
			System.out.println("Eligible for loan: 7 lakhs");
		} else if (annualSalary >= 1000000) {
			System.out.println("Eligible for loan: 5 lakhs");
		} else if (annualSalary >= 600000) {
			System.out.println("Eligible for loan: 2 lakhs");
		} else {
			System.out.println("Not eligible for loan: Salary below 6 lakhs");
		}
	}
}

public class EmployeeLoanCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create an Employee object
		Employee emp = new Employee();

		// Input employee details
		System.out.print("Enter Employee ID: ");
		int empId = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		System.out.print("Enter Employee Name: ");
		String empName = scanner.nextLine();

		System.out.print("Enter Monthly Salary: ");
		double sal = scanner.nextDouble();

		System.out.print("Enter Years Worked: ");
		int yearsWorked = scanner.nextInt();

		// Set employee details
		emp.setEmployeeDetails(empId, empName, sal, yearsWorked);

		// Display employee details
		System.out.println("\nEmployee Details:");
		emp.getEmployeeDetails();

		// Check loan eligibility
		System.out.println("\nLoan Eligibility:");
		emp.getLoanEligibility();

		scanner.close();
	}
}
