/**
 * @author lam Vinh Vong
 *  Sep 25, 2022 Homework Assignment 1 
 *  Exercise 3 Person.java
 */

package com.example;


public class Person {

	/*
	 * Instance attribute
	 */
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private String address;
	private String gender;
	private double weight;

	/**
	 * Constructor Person 
	 * @param firstName The first name
	 * @param lastName The last name
	 * @param age The age
	 * @param ssn The ssn
	 * @param address The address
	 * @param ssn The gender
	 * @param weight the weight
	 */
	 
	 
	public Person(String firstName, String lastName, int age, String ssn, String address, String gender,
			double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}

	 //Setter
	 /**
	 * Set the first name of person
	 * @param firstName 
	 */
	 public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

	 /**
	  * Set the last name of person
	  *  @param lastname 
	  */
	  public void setLastName(String lastName) {
		  	this.lastName = lastName;
	}
	 /**
	 * Set the age of person
	 * @param age
	 */
	 public void setAge(int age) {
		 	this.age = age;
	}
	 
	 /**
	  * Set the SSN of person
	 * @param ssn 
	 */
	 public void setSsn(String ssn) {
			this.ssn = ssn;
	}

	 /**
	 * Set the address of person
	 * @param address
	 */
	 public void setAddress(String address) {
			this.address = address;
	 }
	 
	 /**
	  * Set the gender of person
	  * @param gender
	  */
	 public void setGender(String gender) {
		 	this.gender = gender;
	}	

	/**
	 * Set the Weight of person
	 * @param weight  
	 */
	public void setWeight(double weight) {
			this.weight = weight;
	}
	
	//Getter
	
	 /**Get the First name
	 *  @return person's first name
	 */

	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Gets the last name
	 * @return Last name 
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Gets the age
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Get the SSN
	 * @return ssn
	 */
	 public String getSsn() {
	       return ssn;
	   }

	 /**
	  * Gets the address
	  * @return address
	  */
	 public String getAddress() {
			return address;
	 }
	 
	 /**
	  * Gets the gender
	  * @return gender
	  */
	 
	 public String getGender() {
		return gender;
	}
	 
	 /**
	  * Gets the weight
	  * @return weight
	  */
	 
	 public double getWeight() {
		return weight;
	}

	// introduce
	public void introduce() {

		System.out.println(toString());
	}

	// toString 
	@Override
	public String toString() {
		return "First name:" + firstName + "\nLast name: " + lastName 
				+ "\nAge: " + age + " years old" + "\nSSN: " + ssn + 
				"\nAddress: " + address + "\nGender: " + gender +
				"\nWeight: " + weight + " lbs";
	}

}

