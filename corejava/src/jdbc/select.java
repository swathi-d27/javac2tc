package jdbc;
import java.sql.*;
import javax.sql.*;
public class select {
public static void main(String [] args) throws SQLException {
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/swathi","root","@nilan09$");
	
		Statement stat=conn.createStatement();
	   // executing the query
		String strselect="select * from new";
		System.out.println("the sql statement is"+strselect);
		//processing the result
		ResultSet ress=stat.executeQuery(strselect);
		System.out.println("records are....");
	int row=0;
	while(ress.next()) {
		String name=ress.getString("name");
		int age=ress.getInt("age");
		System.out.println(name+"'s age is"+age);
		row++;
	}
	
}
}