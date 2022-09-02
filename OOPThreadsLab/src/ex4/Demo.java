package ex4;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
		
		Map<String, Integer> number1 = new LinkedHashMap<String, Integer>();
		
		T1 t1 = new T1(number1);
		T2 t2 = new T2(number1);
		t1.start();
		t2.start();

	}

}

//Thread One
class T1 extends Thread{
	Map<String, Integer> number1;
	
	Scanner sc = new Scanner(System.in);
	
   //constructor	
	public T1(Map<String,Integer>number1) {
		super();
		this.number1=number1;
	}
	
	public void run() {
		synchronized(number1) {
			System.out.println("Thread 1 is started");
			
			for(int i=0; i<3; i++) {
				System.out.println("please enter number 1:");
				int n1 = sc.nextInt();
				System.out.println("please enter number 2:");
				int n2 = sc.nextInt();
				
				number1.put(n1+"*"+n2+"=",n1*n2);
			}
			
			System.out.println("Thread1 goes to waiting state/n ");
			try {
				number1.wait();
				
				T1 t1 = new T1(number1);
				t1.start();
				
				T2 t2 = new T2(number1);
				t2.start();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


//Thread Two
class T2 extends Thread{
	Map<String, Integer> number1;

	//constructor
	public T2(Map<String, Integer> number1) {
		super();
		this.number1 = number1;
	}
	
	public void run(){
		synchronized(number1){
			
		}
		
		System.out.println("Thread 2 started");
		System.out.println("Output is n1*n2");
		
		for(Map.Entry<String, Integer> entry : number1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("Thread 1 Notified");
		number1.notify();
	}
}

/*output
Thread 1 is started
please enter number 1:
4
please enter number 2:
5
please enter number 1:
3
please enter number 2:
6
please enter number 1:
2
please enter number 2:
7
Thread1 goes to waiting state/n
Thread 2 started
Output is n1*n2
4*5=
20
3*6=
18
2*7=
14
Thread 1 Notified
Thread 1 is started    // if there no error in threa1 this will work after notified
please enter number 1:
*/
