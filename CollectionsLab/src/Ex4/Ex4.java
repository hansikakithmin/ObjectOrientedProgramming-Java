package Ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Ex2.Ex2;

public class Ex4 {

	public static void main(String[] args) {
		//key and values pares->map class(HashMap)
		// creating a map of student(Ex2)
		Map<Integer,Ex2> map = new HashMap<Integer,Ex2>();
		
		//creating students
		Ex2 s1 = new Ex2(100,2.5,"Kamal");
		Ex2 s2 = new Ex2(101,3.6,"Nimal");
		Ex2 s3 = new Ex2(102,3.2,"Amal");
		
		//adding students to map
		map.put(s1.getStudentID(), s1);
		map.put(s2.getStudentID(), s2);
		map.put(s3.getStudentID(), s3);	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID:");
		int id = sc.nextInt();
		
		Ex2 st = map.get(id);
		//changed Ex2 for this part
		st.print();
		
		
		//traversing (optional)
		for(Map.Entry<Integer, Ex2>entry:map.entrySet()) {
			int key=entry.getKey();
			Ex2 value = entry.getValue();
			
		}

	}

}

/* output
Enter the Student ID:
101
Student ID:101
Student Name:Nimal
Student GPA:3.6

if optional part commented output is same
*/
