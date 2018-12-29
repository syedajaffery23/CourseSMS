//E9, Syeda Jaffery, CIS 340, online

import java.util.Scanner;

public class SMS {
	
	Course my340Class;

	public static void main(String[] args) {
		
		SMS myStudentSystem = new SMS();
		myStudentSystem.loadSMS();

	} //end main
	
//*****method asks user for information and them adds the new student to the roster
	private void addNewStudent()
	{
		String name ;
		String id ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = scanner.nextLine();
		System.out.print("ID: ");
		id = scanner.nextLine();
		
		//save information in a temporary location
		Student tmpStudent = new Student(name, id);
		
		//call add method from course class
		my340Class.add(tmpStudent);
	}
	
//*****prints out the main menu, saves user input, and calls methods accordingly
	private void showMenu()
	{
		Scanner scanner = new Scanner(System.in);
		int input = 0;
				
		do 
		{
			System.out.printf("\n\n\n\n\n");
			System.out.print("\n\t\tStudent Management System");
			System.out.print("\n\n\n1. Add Student\n2. Print Roster\n3. Exit");
			System.out.printf("\n\nEnter choice: ");
			
			//save user choice in input
			input = Integer.parseInt(scanner.nextLine());
			
			//switch on input
			switch (input)
			{
			case 1: 
				addNewStudent(); //call add student method from current class
				break;
			case 2: 
				my340Class.PrintRoster(); //call print Roster method from course class
				scanner.nextLine();
				break;
			}
		}while (input != 3); //exit if user enters 3
		
		scanner.close();
	}
	
	private void loadSMS()
	{
		my340Class = new Course();
		showMenu(); //call showMenu class
	}

}//end class
