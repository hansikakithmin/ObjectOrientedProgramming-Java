package ex3;

public class Deadlock {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne threadOne = new ThreadOne(lock1,lock2);
		ThreadTwo threadTwo = new ThreadTwo(lock1,lock2);
		
		threadOne.start();
        threadTwo.start();
	}
}

/*output there is no deadlock situation
String Executed Thread1
Thread 1 holding lock 1
String Executed Thread2
Thread 1 is awaiting for the lock2
Thread 1 is holding lock 1 & lock 2
Thread 2 holding lock 2
Thread 2 is awaiting for the lock1
Thread 2 is holding lock 1 & lock 2
*/