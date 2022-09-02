package ex1;

public class Deadlock {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

    public static void main(String[] args) {
    	ThreadOne threadOne = new ThreadOne();
    	ThreadTwo threadTwo = new ThreadTwo();
    	threadOne.start();
    	threadTwo.start();
    	
    }
    
    //Thread one
    static class ThreadOne extends Thread{
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
    
    //Thread two
    static class ThreadTwo extends Thread{
    	@Override
    	public void run(){
    		System.out.println("String Executed Thread2");
    		
    		synchronized(lock2) {
    			System.out.println("Thread 2 holding lock 2");
    			
    			try {
    				Thread.sleep(10);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    			
    			System.out.println("Thread 2 is awaiting for the lock1");
    			
    			synchronized(lock1) {
    				System.out.println("Thread 2 is holding lock 1 & lock 2");
    			}
    		}
    	}
    }
}

/*output
 String Executed Thread1
Thread 1 holding lock 1
String Executed Thread2
Thread 2 holding lock 2
Thread 2 is awaiting for the lock1
Thread 1 is awaiting for the lock2

//output will be change in different runs
String Executed Thread1
Thread 1 holding lock 1
String Executed Thread2
Thread 2 holding lock 2
Thread 1 is awaiting for the lock2
Thread 2 is awaiting for the lock1
*/
