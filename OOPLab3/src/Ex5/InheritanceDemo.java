package Ex5;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Kamal","Colombo");
		p1.showDetails();
		
		Student std1 = new Student("Amali","Gampaha","std123");
		std1.showDetails();
		
		PartTimeStudent pt1 = new PartTimeStudent("Dasun","Kalutara","std564","6");
		pt1.showDetails();

	}

}
