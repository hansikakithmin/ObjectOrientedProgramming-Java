package ex3;

public class ThreadTwo extends Thread {
	private  Object lock1 = new Object();
	private  Object lock2 = new Object();
	
	public ThreadTwo(Object lock1, Object lock2) {
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
