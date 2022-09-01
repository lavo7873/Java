package com.example;
/**
 * @author Van Trinh Feb 22, 2022 
 * Homework Assignment 1
 *  Exercise 1 Student.java
 */
public class Student {
	// Instance attribute
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;

	/**
	 * Sets first name
	 * 
	 * @param firstName the first name to set
	 */
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets first name
	 * 
	 * @return the first name
	 */
	String getFirstName() {
		return firstName;
	}

	/**
	 * set last name
	 * 
	 * @param the last name to set
	 */
	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets last name
	 * 
	 * @return the last name
	 */
	String getLastName() {
		return lastName;
	}

	/**
	 * set age
	 * 
	 * @param the age to set
	 */
	void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets age
	 * 
	 * @return age
	 */
	int getAge() {
		return age;
	}

	/**
	 * Sets gpa
	 * 
	 * @param the gpa to set
	 */
	void setGPA(float gpa) {
		this.gpa = gpa;
	}

	/**
	 * Gets gpa
	 * 
	 * @return gpa
	 */
	float getGPA() {
		return gpa;
	}

	/**
	 * Sets major
	 * 
	 * @param the major to set
	 */
	void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Gets major
	 * 
	 * @return the major
	 */
	String getMajor() {
		return major;
	}

	/**
	 * Set department
	 * 
	 * @param the department to set
	 */
	void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets department
	 * 
	 * @return the username
	 */
	String Department() {
		return department;
	}

	/*
	 * Constructor for Students' Info
	 * 
	 * @param firstName The student's first name.
	 * 
	 * @param lastName The student's last name.
	 * 
	 * @param age The student's age
	 * 
	 * @param gpa The student's gpa.
	 * 
	 * @param major The student's major.
	 * 
	 * @param department The student's department of major
	 */
	public void studentInfo(String firstName, String lastName, int age, float gpa, String major, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = (float) gpa;
		this.major = major;
		this.department = department;
	}

	/*
	 * method to show student's info
	 */
	void showStudentInfo() {
		System.out.println(firstName + " " + lastName + ", " + age + " years old, " + gpa + " GPA, " + major
				+ " major, " + department + " department.");
	}

	/**
	 *  Inner Class course
	 * print the student's schedule
	 */
	class Course {
		void printSchedule() {
			System.out.println("\nCS151 Mon/Wd 6:7:15");
			System.out.println("Eng101 Mon/Wed 10-11:15 ");
			System.out.println("Hist100 Tue/Thur 1:30-2:45");
		}
	}
}
