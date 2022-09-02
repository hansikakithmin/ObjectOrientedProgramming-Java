package Ex2;
//Student class
public class Ex2 {
	private int StudentID;
	private double gpa;
	private String name;
	
	//constructor
	public Ex2(int StudentID,double gpa,String name) {
		this.StudentID=StudentID;
		this.gpa=gpa;
		this.name=name;
	}
	
	//getters and setters

	public int getStudentID() {
		return StudentID;
	}

	public double getGpa() {
		return gpa;
	}

	public String getName() {
		return name;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//print method  ex4 part
	public void print() {
		System.out.println("Student ID:"+getStudentID());
		System.out.println("Student Name:"+getName());
		System.out.println("Student GPA:"+getGpa());
		System.out.println();
	}
	

}
