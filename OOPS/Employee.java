package Inheritance;

public class Employee extends Person {
	double annualSalary;
	int year;
	String insuranceNumber;
	void print(String name,double annualSalary,int year,String insuranceNumber) {
		System.out.print("The name of the employee is "+name);
		System.out.println(" and the salary is "+annualSalary+" ");
		System.out.print("The year of joining is "+year);
		System.out.print(" and his insurance number is "+insuranceNumber);
	}
}
