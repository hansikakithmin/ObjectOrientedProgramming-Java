package Ex3;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		int maxSubjects;
		 int [] marks = new int[5];
		 int total = 0;
		 double avg;
		 
		 try {
		 // 1. Input a value for maxSubjects
		 // from keyboard
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter max subject:");
			 maxSubjects = sc.nextInt();
			 
		 // 2. Using a for loop 
		 // input marks 
			 for(int i=0; i<maxSubjects; i++) {
				 System.out.println("Marks:");
				 marks[i]=sc.nextInt(); 
				 total = total+marks[i];
			 }
		  // 3. Calculate the avg marks 
          avg=total/maxSubjects;
          System.out.println("Average mark is:"+avg);
		 // 4. Use a try catch block to
		 // prevent the following 
		 // run time errors
		 // (a) Input valid integers to the 
		 // inputs
		 // (b) ArithmeticException division
		 // by zero
		 // (c) ArrayIndexOutOfBounds
		 // Exception
		 } catch (InputMismatchException e) {
			 System.out.println(e);
		 }
		 catch (ArithmeticException e) {
			 System.out.println(e);
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
		 
		 finally {
		 System.out.println("This code will be gurrentied to run");
		 }
		 
		 System.out.println("The end");

	}

}
