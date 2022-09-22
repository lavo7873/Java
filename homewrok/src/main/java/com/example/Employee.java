/**
 * Employee Data
 *
 */


package com.example;

public class Employee extends Person {

	/*
	 * Instance attribute
	 */
	private int id;
	private String status;
	private double basePay;

	// Employee constructor
	/**
	 * @param firstName The employee's first name
	 * @param lastName  The emplyee's last name
	 * @param address   The employee's address
	 * @param age       the Employee's age
	 * @param weight    the Employee's weight
	 * @param id        the Employee's id
	 * @param status    Employee's working status
	 * @param basePay   Employee's basePay
	 */

	public Employee(String firstName, String lastName, String gender, String ssn, String address, int age,
			double weight, int id, String status, double basePay) {
		super(firstName, lastName, age, ssn, address, gender, weight);
		this.id = id;
		this.status = status;
		this.basePay = basePay;
	}

// getter and setter
	/**
	 * Gets the ID of employee
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the ID of employee
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the status of employee(Full time/ part ime/ contract)
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the working status of employee
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the base pay for employee
	 * 
	 * @return basePay
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * Set the base pay of employee
	 * 
	 * @param basePay
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public double calculatePay(double unitWorked) {
		double pay = 0.0;

		// Since this takes a status we simply have to check the value and tell them to
		// try again
		if (status.equalsIgnoreCase("part time") || status.equalsIgnoreCase("contractor")) {
			pay = unitWorked * basePay;

		} else if (status.equalsIgnoreCase("full time")) {

			pay = (basePay / 52) * unitWorked;

		}

		return pay;

	}

	// introduce
	public void introduce() {

		System.out.println(toString());
	
	}

	// toString
	@Override
	public String toString() {
		String unit = " ";

		if (status.equalsIgnoreCase("part time") || status.equalsIgnoreCase("contractor")) {

			unit = " per hour ";

		} else if (status.equalsIgnoreCase("full time")) {
			unit = " per year";
		}
		return super.toString() + "\nEmployee ID: " + id + "\nWork Status: " + status + "\nBase Pay: $" + basePay
				+ unit;
	}

}
