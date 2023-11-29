package exception_throws;
import java.io.*;

public class Main {
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
