package ex2;


public class Deadlock {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

    public static void main(String[] args) {
    	Thread1 thread1 = new Thread1(lock1, lock2);
    	Thread2 thread2 = new Thread2(lock1, lock2);
    	thread1.start();
    	thread2.start();
    	
    }
}

//thread1
class Thread1 extends Thread{
	private  Object lock1 = new Object();
	private  Object lock2 = new Object();
	
	public Thread1(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	
	@Override
	public void run(){
		System.out.println("String Executed Thread1");
		
		synchronized(lock1) {
			System.out.println("Thread 1 holding lock 1");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 is awaiting for the lock2");
			
			synchronized(lock2) {
				System.out.println("Thread 1 is holding lock 1 & lock 2");
			}
		}
	}
	
}

//thread2
class Thread2 extends Thread{
	private  Object lock1 = new Object();
	private  Object lock2 = new Object();
	
	public Thread2(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	
	@Override
	public void run(){
		System.out.println("String Executed Thread2");
		
		synchronized(lock1) {//changed synchronized lock2 into lock1 ex3 part
			//it executed "Thread 2 is holding lock 1 & lock 2" part also
			System.out.println("Thread 2 holding lock 2");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread 2 is awaiting for the lock1");
			
			synchronized(lock2) {//changed synchronized lock1 into lock2 ex3 part
				System.out.println("Thread 2 is holding lock 1 & lock 2");
			}
		}
	}
	
}


/*output
String Executed Thread1
Thread 1 holding lock 1
String Executed Thread2
Thread 1 is awaiting for the lock2
Thread 1 is holding lock 1 & lock 2
Thread 2 holding lock 2
Thread 2 is awaiting for the lock1
Thread 2 is holding lock 1 & lock 2
*/