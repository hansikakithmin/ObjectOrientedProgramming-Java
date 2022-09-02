package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	   listGenericTotal(addElementGenericArray());

	}
	
	//add elements to Array list
	public static List<Integer> addElementGenericArray(){
		List<Integer> list = new ArrayList<>();//ArrayList object
		
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty()==true) {
			System.out.println("List is empty");
		}
		
		System.out.println("Please enter value for the list:");
		
		for(int i=0; i<10; i++) {
			System.out.print("Enter value"+(i+1));
			list.add(sc.nextInt());
		}
		return list;
	}
	
	//getting total
	//traversing through the list
	public static void listGenericTotal(List<Integer> list) {
		int total=0;
		int i=0;
		
		for(Integer x : list) {
			total+=x;
			System.out.println("Value"+(i+1)+":"+x);
			i++;
		}
		System.out.println("Total is:"+total);
		
	}

}
//give 10 values by input. then program shows total of them.