package Ex1;

public class Cat extends Animal {
	//default constructor
		public Cat() {
			 System.out.println("Cat constructor called");
			 }
	
	 public Cat(String name) {
		 super(name);
		 }
		 public String speak() {

			 return "Meow Meow";
		 }
}
