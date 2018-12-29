//E9, Syeda Jaffery, CIS 340, online

import java.util.ArrayList;


public class Course {
	
	//declare class variables
	private int courseNumber;
	private static String collegeName;
	private double classAverage = 0.0;
	private static int studentCount;
	
	//decalre arraylist of type student 
	private ArrayList<Student> studentRoster; 
	
	//returns an arraylist of type Students
	public ArrayList<Student> getStudentRoster()
	{
		return studentRoster;
	}
	
	public static int getStudentCount()
	{
		return studentCount;
	}
	
	//constructor for Course class
	public Course()
	{
		studentRoster = new ArrayList<Student>();
	}
	
	//adds a new student to the arraylist
	public Student add()
	{
		Student tmpStudent = new Student(); 
		studentRoster.add(tmpStudent);
		studentCount ++;
		return tmpStudent;
	}
	
	//overloaded add method
	public void add(Student student)
	{
		studentRoster.add(student);
		studentCount ++;
	}
	
	//prints out the list of Students
	public void PrintRoster()
	{
		System.out.printf("The students in the roster are:\n");
		for(Student s: studentRoster)
		{
			s.printInformation();
		}
	}
	
//******getters and setters for Course class
	public int getCourseNumber() {
		
		return courseNumber;
	}
	
	public void setCourseNumber(int courseNumber) 
	{
		//check if the course number is valid
		if (courseNumber > 100 && courseNumber < 499)
			this.courseNumber = courseNumber;
	}
	
	public static String getCollegeName() 
	{
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		
		Course.collegeName = collegeName;
	}
	
	public double getClassAverage() 
	{
		
		return classAverage;
	}
	
	
}
