package Ex8;

public class Pet {
	 private String name;
	 private String owner;
	 private int age;
	 
	 //Parameterized constructor
	 public Pet(String name, String owner, int age) {
	    this.name = name;
	    this.owner = owner;
	    this.age = age;
	    }
	 
	 //overloaded constructor
	 public Pet(String name, String owner) {//ex9
		 this.name=name;//ex9
		 this.owner=owner;//ex9
	 }
	
	 public void showDetails(){
	    System.out.println("I am a pet. My name is "+this.name+". My owner is "+this.owner);
	}
}//end of the pet class

