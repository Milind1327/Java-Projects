package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Ask how many students we want to add
		System.out.println("Enter number of students to enroll");
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] students=new Student[numOfStudents];
		
		//create a number of new students
		for (int n=0;n<numOfStudents;n++){
			students[n]= new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		for(int i=0;i<numOfStudents;i++){
		System.out.println(students[i]);	
		}
	}

}
