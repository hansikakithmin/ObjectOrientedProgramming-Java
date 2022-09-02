package Ex1;

public class Student {
	private int studentId;
	private String name;
	private String degree;
	private String mobile;
	
	//static variable 
	private static int max=100;
	
	// static method
	public static int getNextStudentID() {
		return max++;
	}
	
	//default constructor
	public Student(){
		
	}
	
	// constructor
	public Student(String name, String degree, String mobile) {
		this.name=name;
		this.degree=degree;
		this.mobile=mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	// print method
	public void print() {
		System.out.println("Student name:"+getName());
		System.out.println("Student degree:"+getDegree());
		System.out.println("Student mobile:"+getMobile());
		System.out.println("Student ID:"+getNextStudentID());

	}
	
	

}
