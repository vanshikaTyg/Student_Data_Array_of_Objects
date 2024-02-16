// VANSHIKA TYAGI 
// 22070126128
// AIML B3

import java.util.*;
import java.io.*;

class Input{
	//creating ArrayList
	ArrayList<Student>student = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	
	public void addStudent(){
		//details of multiple student
		System.out.println("Enter number of students : ");
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.println("Enter PRN of : " + (i+1));
			String prn = scan.next();
			
			System.out.println("Enter Name of : " + (i+1));
			String name = scan.next();
			
			System.out.println("Enter DoB of : " + (i+1));
			String dob = scan.next();
			
			System.out.println("Enter Marks of : " + (i+1));
			double marks = scan.nextDouble();
			
			
			//creating Student object
			Student newstudent = new Student(prn, name, dob, marks);
			student.add(newstudent);
		}
	}
	
	public void displayStudent(){
		if(student.isEmpty()){
			System.out.println("No students found.");
			return;   // Exits if no students exist
		}
		
		System.out.println("Students : ");
		for(Student student : student) {
			System.out.println("PRN: " + student.getPRN());
			System.out.println("Name: " + student.getName());
			System.out.println("DoB: " + student.getDOB());
			System.out.println("Marks: " + student.getMarks());
		}
	}
	
	
	public void searchPrn(){
		System.out.println("Enter PRN to be searched:");
		String prn = scan.next();
		for (Student student : student){
			if (student.getPRN().equals(prn)){
				System.out.println("Student found !" + student);
				return;
			}
		}
	}
	
	public void searchName(){
		System.out.println("Enter Name to be searched:");
		String name = scan.next();
		for (Student student : student){
			if (student.getName().equals(name)){
				System.out.println("Student found !" + student);
				return;
			}
		}
	}
	
	public void searchPosition(){
		System.out.println("Enter position to be searched: ");
		int pos = scan.nextInt();
		if (pos >= 0 && pos < student.size()){
			System.out.println("Student found at position: "+ student.get(pos));
		}
		else{
			System.out.println("Invalid position. Please enter a position between 0 and " +(student.size()-1));
		}
	}	
	public void updateStudent() {
			System.out.println("Enter PRN of student to be updated: ");
			String prn = scan.next();
			for (int i = 0; i < student.size(); i++){
				Student student = this.student.get(i);    // Getting the student object
				if (student.getPRN().equals(prn)){
					System.out.println("Enter updated marks:");
					double marks = scan.nextDouble();
					student.setMarks(marks);
					this.student.set(i, student);     // Using set to update the student in ArrayList
					System.out.println("Marks updated.");
					return;
				}
			}
			System.out.println("Student not found.");
		}
		
		public void deleteStudent(){
			System.out.println("Enter PRN of student to be deleted:");
			String prn = scan.next();
			for (int i = 0; i < student.size(); i++){
				if (student.get(i).getPRN().equals(prn)) {
					student.remove(i);
					System.out.println("Student deleted.");
					return;
				}
			}
			System.out.println("Student not found.");
		}
	}
				
			

		
	
	
	
				