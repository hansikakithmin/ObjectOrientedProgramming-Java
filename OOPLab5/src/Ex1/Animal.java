package Ex1;

abstract public class Animal {
	private String name;
	
	//default constructor
	public Animal() {
		 System.out.println("Animal constructor called");
		 }

	
	 public Animal(String name) {
	 this.name = name;
	 }
	 abstract public String speak();
	 
	 public void display() {
	 System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	 }

}
