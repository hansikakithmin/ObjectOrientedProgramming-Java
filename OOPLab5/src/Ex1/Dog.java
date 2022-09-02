package Ex1;

public class Dog extends Animal {
	//default constructor
		public Dog() {
			 System.out.println("Dog constructor called");
			 }
	
	 public Dog(String name) {
		 super(name);
		 }
		 public String speak() {
		 return "Bow Wow";
		 }

}
