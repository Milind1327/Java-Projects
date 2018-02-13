package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name:");
		this.lastName = in.nextLine();

		System.out.println("1-freshman\n2-Sophomore\n3.Junior\n4.Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();
		setStudentID();

	}

	// generate an ID
	private void setStudentID() {
		// GRADE LEVEL+ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	// enroll in courses
	public void enroll(){
		//get inside a loop, user hits 0
	do{
		System.out.print("Enter course to enroll(Q to quit):");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equalsIgnoreCase("Q")){
			if(courses==null)
			{courses=course;
			tuitionBalance=tuitionBalance+costOfCourse;}
			else
			{courses=courses+"\n"+course;
			tuitionBalance=tuitionBalance+costOfCourse;}
		}
		else {break;}
	}while(1!=0);
		
}

	// view balance
public void viewBalance(){
	System.out.println("Your balance is: $"+tuitionBalance);
	
}
	// pay tuition
public void payTuition(){
	viewBalance();
	System.out.println("Enter your payment");
	Scanner in=new Scanner(System.in);
	int payment=in.nextInt();
	
	tuitionBalance=tuitionBalance-payment;
	System.out.println("TY for your payment of $"+payment);
	viewBalance();
}
	// show status
	public String toString(){
		return "NAME: "+firstName+" "+lastName+
				"\nGrade year"+gradeYear+
				"\nstudent ID:"+studentID+
				"\nCourses Enrolled\n"+ courses+
				"\nbalance: $"+tuitionBalance;
	}
}
