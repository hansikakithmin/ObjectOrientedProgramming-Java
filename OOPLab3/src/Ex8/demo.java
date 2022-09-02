package Ex8;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		
		//overloaded object with pet class
		Pet p1 = new Pet("Charlie","Konan");//ex9
		p1.showDetails();//ex9
		
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails(); 
		
		Cat c1 = new Cat("Tim","John");//ex9
		c1.showDetails();//ex9
		
		Dog d = new Dog("pet dog","Nimal",2,1);
		d.showDetails();
		
		//overloaded constructor
		Dog d1 = new Dog("Browny","Sunil");//ex10
		d1.showDetails();//ex10

	}

}//end of the demo class
