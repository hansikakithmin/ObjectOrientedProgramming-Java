package Ex1;

public class Main {

	public static void main(String[] args) {
		 //Animal animal1 = new Animal("test");// cannot create object/instance
		 //animal1.display();
		 
		 Cat mycat = new Cat("Micky");
		 mycat.display();
		 
		 Dog mydog = new Dog("Rover");
		 mydog.display();
		 
		 ToyCat mytoy = new ToyCat("kittie","Toysrus");
		 mytoy.display();
		 
		 ToyCat mytoy1 = new ToyCat();
		 
		 }

	}

//output after changes
/*My name is Micky. Meow Meow.
My name is Rover. Bow Wow.
My name is kittie. Meow Meow.
I am from Toysrus.*/

//new output
/*My name is kittie. Meow Meow.
I am from Toysrus.
Animal constructor called
Cat constructor called
ToyCat constructor called
*/