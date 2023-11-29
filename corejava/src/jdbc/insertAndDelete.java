package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class insertAndDelete {
	public static void main(String [] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/swathi","root","@nilan09$");
			java.sql.Statement st=conn.createStatement();
			{
			//inserting a record
				String sqlInsert="insert into new values('swathi',30),('dharma',18)";
				System.out.println("the sql statement is"+sqlInsert+"\n");
				int count=((java.sql.Statement) st).executeUpdate(sqlInsert);
				System.out.println(count+"records inserted into new\n");
				//delete a record
				String sqldelete="delete from new where age=18";
				System.out.println("the sql statement is"+sqldelete+"\n");
				int c=st.executeUpdate(sqldelete);
				System.out.println(c+"record deleted\n");
				String sqlInsert1="insert into new values('nila',21)";
				System.out.println("the sql statement is"+sqlInsert1+"\n");
				int count2=st.executeUpdate(sqlInsert1);
				System.out.println(count2+"records inserted into new\n");
			}
			}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
