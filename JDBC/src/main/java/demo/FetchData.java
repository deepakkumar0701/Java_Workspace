package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student where id=2");
		rs.next();
		 
		System.out.println(rs.getInt(1));
		System.out.println(rs.getInt(2));
		System.out.println(rs.getInt(3));
		
		
	}
	
}
