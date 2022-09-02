package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2main {

	public static void main(String[] args) {
		List<Ex2> Studentlist = new ArrayList<>();
		Studentlist.add(new Ex2(100,2.5,"Kamal"));
		Studentlist.add(new Ex2(101,3.6,"Nimal"));
		Studentlist.add(new Ex2(102,3.2,"Amal"));
		
		//traversing through the list(iterative through the list)
		for(Ex2 s : Studentlist) {
			System.out.println("Student ID:"+s.getStudentID());
			System.out.println("Student Name:"+s.getName());
			System.out.println("Student GPA:"+s.getGpa());
			System.out.println();
		}

	}

}

/*output
Student ID:100
Student Name:Kamal
Student GPA:2.5

Student ID:101
Student Name:Nimal
Student GPA:3.6

Student ID:102
Student Name:Amal
Student GPA:3.2
*/