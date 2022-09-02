package Ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		//because of unique values should not be duplicated
		//because that set is used
		
		//set demonstration using HashSet constructor
		Set studentHeight = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Enter Height" +(i+1)+":");
			studentHeight.add(sc.nextInt());
		}
	//loop through a HashSet
	//Iterating the set elements using for each loop
	for(Object object : studentHeight) {
		System.out.println(object);
	}

	}

}

/*output
 Enter Height1:
170
Enter Height2:
160
Enter Height3:
161
Enter Height4:
165
Enter Height5:
168
Enter Height6:
179
Enter Height7:
180
Enter Height8:
180
Enter Height9:
170
Enter Height10:
160
160
161
179         no duplictes
180
165
168
170
*/
