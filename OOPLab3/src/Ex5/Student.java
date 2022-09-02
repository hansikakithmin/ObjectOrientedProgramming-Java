package Ex5;
//ex6 part
public class Student extends Person{
	String stdid;
	public Student(String newName, String newAddress, String newstdid) {
		super(newName, newAddress);
		stdid=newstdid;
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println("My id is"+stdid);
	}


}
