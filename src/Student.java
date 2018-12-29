//E9, Syeda Jaffery, CIS 340, online

public class Student {

	private String name;
	private String id;
	
//********constructors for class student
	public Student()
	{
		System.out.println("A new student has been created");
	}
	public Student(String name)
	{
		this.name = name;
		System.out.println("A new student has been created");	
	}
	public Student(String name, String id)
	{
		this.name = name;
		this.id = id;
		System.out.println("A new student has been created");
	}
	
//*******getters and setters for student class
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getID()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
//*******prints students information
	public void printInformation()
	{
		System.out.printf("\n%-15s %20s",this.name, this.id);
	}
	
}
