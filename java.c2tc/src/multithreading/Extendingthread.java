package multithreading;

public class Extendingthread extends Thread {
	public void run()
	{
		System.out.println("run method is implemented");
	}
	public static void main(String[]args)
	{
		Extendingthread t=new Extendingthread();//new state
		t.start();//runnable state
		System.out.println("start method is implemented");
		
		
	}

}
