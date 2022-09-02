package Ex2;

public class Ex2 {

	public static void main(String[] args) {
		print("Age is:",23);
		print("Name is:","Mike");
		
	}
	
	//if we put int val in main part there will be only int things working
	//but we put E val it works for any data types
	public static <E> void print(String msg,E val) {
		System.out.println(msg+""+val);
	}

}
