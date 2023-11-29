package lambda;

public class first {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Runnable idk=()->{ String threadName=Thread.currentThread().getName();
	System.out.println("thread name:"+threadName);};

	// Instantiating 2 threads
		Thread t1=new Thread (idk);
		Thread t2=new Thread (idk);
		t1.start();
		t2.start();
		
	}}


