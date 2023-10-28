package multithreading;

public class ImplementingRunnable   implements Runnable {
    

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable");
		for(int i=0;i<3;i++)
		{
			System.out.println(i+"from thread");
			
		}
	}
	public static void main(String[]args)
	{
		ImplementingRunnable t=new ImplementingRunnable();
		//t.start();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=0;i<3;i++)
		{
			System.out.println(i+" from main"+ t1.getName());
			
		}
	}

}