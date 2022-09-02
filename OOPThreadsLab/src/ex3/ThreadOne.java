package ex3;

public class ThreadOne extends Thread{
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public ThreadOne(Object lock1, Object lock2) {
		super();
		this.lock1=lock1;
		this.lock2=lock2;
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
