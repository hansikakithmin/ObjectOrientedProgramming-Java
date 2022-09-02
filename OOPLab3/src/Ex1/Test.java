package Ex1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects
		//Student st1 = new Student("Nimal","IT123","Colombo"); //ex2 part
		//st1.name="Nimal";
		//st1.ditno="IT123";
		//st1.address="Colombo";
		
		//Student st2 = new Student("Kamal","IT565","Kaduwela");//ex2 part
		//st2.name="Kamal";
		//st2.ditno="IT565";
		//st2.address="Kaduwela";
		
		//System.out.println("Name:"+st1.name+"\nDIT No:"+st1.ditno+"\nAddress:"+st1.address);
		//System.out.println("Name:"+st2.name+"\nDIT No:"+st2.ditno+"\nAddress:"+st2.address);
		
		/*Student st1=new Student();//ex3
		st1.setName("Nimal");//ex3
		st1.setDitno("IT123");//ex3
		st1.setAddress("Colombo");//ex3
		
		System.out.println("Name:"+st1.getName()+"\nDIT No:"+st1.getDitno()+"\nAddress:"+st1.getAddress());//ex3 */
		
		
		//ex4
		Student st1=new Student();
		st1.setName("Nimal");
		st1.setDitno("IT123");
		st1.setAddress("Colombo");
		System.out.println(st1.getDetails());
	}

}
