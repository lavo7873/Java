package com.example;
public class StudentTest {

	public static void main(String[] args) {
		// Create student object
		Student student = new Student();
		student.studentInfo("John", "Smith", 20, 3.6f , "Computer Science", "School of computer Science");
		student.showStudentInfo();
		
		//Create Course object
		Student.Course course = student.new Course();
		
	    // call printSchedule method
		course.printSchedule();
	}

}
