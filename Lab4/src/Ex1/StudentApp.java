package Ex1;

public class StudentApp {

	public static void main(String[] args) {
		Student studentArray[] = new Student[5];
		studentArray[0] = new Student("Kamal","9745378","IT");
		studentArray[0].print();
		System.out.println();
		studentArray[1] = new Student("Amal","47582","SE");
		studentArray[1].print();
		
		
		// from default constructor
		studentArray[2] = new Student();
		studentArray[2].setName("Nimal");
		studentArray[2].setMobile("873654");
		studentArray[2].setDegree("ISE");
		studentArray[2].print();
		
		studentArray[3] = new Student();
		studentArray[3].setName("Dasun");
		studentArray[3].setMobile("342854");
		studentArray[3].setDegree("CSN");
		studentArray[3].print();
		
		studentArray[4] = new Student();
		studentArray[4].setName("Pawan");
		studentArray[4].setMobile("52321");
		studentArray[4].setDegree("IT");
		studentArray[4].print();
		
		

	}

}
