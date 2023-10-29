package exception_throws;

public class demo {
	public static void main(String[]args)

	{
		fileread read =new fileread();
		try 
		{
			read.readfile("sample.txt");
		}
		catch(IOException e)
		{
			System.out.println("IO exception :"+e.getMessage());
			
		}
	}

}
