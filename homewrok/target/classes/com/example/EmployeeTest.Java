/**
 * @author Lam Vinh Vong
 *  Define and implement class EmployeeTest. This class implement
 *  main() method. create the following Employee instancesvIn thethe
 *  main() method, call introduce()and calculatePay() on each instances
 *  given.
 */
package com.example;

public class EmployeeTest {
	public static void main(String[] args) {
		
		// Create Employee objects
		Employee employee1 = new Employee("John", "Smith", "Male",
				"123456821", "San Jose, CA ", 25, 198, 120397,"Contractor", 60);

		Employee employee2 = new Employee("Lisa", "Gray", "Female", 
				"789012234", "Moutain View, CA", 37, 120, 120398, 
				"Full Time", 110000);

		Employee employee3 = new Employee("Timothy", "Briggs", "Female",
					"3571123246", "Austin, TX", 32, 106, 120399, 
					"Full Time", 80000);

		Employee employee4 = new Employee("George", "Wallace", "Male", 
				"246357220", "Seattle, WA", 29, 126, 120401,
				"Part Time", 20);

		Employee employee5 = new Employee("Amy", "Student", "Female", "199720221", "Palo Alto, CA", 30, 100, 120502,
				"Contractor", 45);

		// Call introduce() and calculatePay() to display employee's info
		employee1.introduce();
		System.out.println("Employee should get paid $" + employee1.calculatePay(30));
		System.out.println();
		
		employee2.introduce();
		System.out.println("Employee should get paid $" + employee2.calculatePay(2));
		System.out.println();
		
		employee3.introduce();
		System.out.println("Employee should get paid $" + employee3.calculatePay(4));
		System.out.println();
		
		employee4.introduce();
		System.out.println("Employee should get paid $" + employee4.calculatePay(25));
		System.out.println();
		
		employee5.introduce();
		System.out.println("Employee should get paid $" + employee5.calculatePay(45));
		System.out.println();

	}
}
