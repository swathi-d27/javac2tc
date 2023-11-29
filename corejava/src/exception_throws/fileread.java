package exception_throws;
import java.io.*;

public class fileread {

	public static void readfile(String filename) throws IOException
	
	{
		throw new IOException("file not found");
		
	}
}
