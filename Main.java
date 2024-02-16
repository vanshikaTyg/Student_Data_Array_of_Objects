// VANSHIKA TYAGI 
// 22070126128
// AIML B3

                 // ASSIGNMENT-3 

import java.util.*;

class Main{
    public static void main(String args[]) {
		Input input = new Input();
		Scanner scan = new Scanner(System.in);
		
		boolean Choice = true;
		
		do{
			System.out.println("1 Add Student");
			System.out.println("2 Display Students");
			System.out.println("3 Search from PRN");
			System.out.println("4 Search from Name");
			System.out.println("5 Search by position");
			System.out.println("6 Update Student");
			System.out.println("7 Delete Student");
			System.out.println("8 Exit");
			
			System.out.println("Enter choice:");
			int choice = scan.nextInt();
			
			switch (choice){
				case 1:
				    input.addStudent();
					break;
				case 2 :
				    input.displayStudent();
					break;
				case 3 :
				    input.searchPrn();
					break;
				case 4 :
				    input.searchName();
					break;
				case 5 :
				    input.searchPosition();
					break;
				case 6 :
				    input.updateStudent();
					break;
				case 7 :
				    input.deleteStudent();
					break;
				case 8 :
				    Choice = false;
					System.out.println("Leaving");
					break;
				default:
				    System.out.println("Invalid choice!");
			}
		}
		while(Choice);
	}
}
   
