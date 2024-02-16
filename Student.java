// VANSHIKA TYAGI
// 22070126128
// AIML B3

class Student{
	//declaring private variables
	private String prn;
	private String name;
	private String dob;
	private double marks;
	
	//initialising constructor
	//parameterised constructor 
	Student(String prn, String name, String dob, double marks){
		this.prn = prn;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
	}
	
	//allocate some space to prn, name, dob
	//default constructor that will run the second class runs
	
	//access private variables using setter and getter method
public void setPRN(String prn){
this.prn = prn;    //setter for prn
}
//access setPRN to change prn for that particular instance
public String getPRN(){
	return prn;
}

//Setter and Getter for name
public void setName(String name){
this.name = name;    
}
public String getName(){
	return name;
}

//Setter and Getter for dob
public void setDOB(String dob){
this.dob = dob;    
}
public String getDOB(){
	return dob;
}

//Setter and Getter for marks
public void setMarks(double marks){
this.marks = marks;    
}
public double getMarks(){
	return marks;
} 


public String toString(){
	return " PRN : " + prn + " Name : " + name + " DoB : " + dob + " Marks : " + marks ;
}
}
