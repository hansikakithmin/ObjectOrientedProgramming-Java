package Ex8;
//ex10 part
public class Dog extends Pet {
	int noOfMasters;
	
	//Parameterized constructor
	public Dog(String name, String owner, int age,int noOfMasters) {
		super(name,owner,age);
		this.noOfMasters=noOfMasters;
	}
	
	//overloaded constructor
	public Dog(String name, String owner) {
		super(name,owner);
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a Dog.I have"+this.noOfMasters+"Masters");
	}

}
