package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			System.out.println("Inside getconnection");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connected");
			con=DriverManager.getConnection("jdbc:mysql://localhost/iot","root", "");
			System.out.println("Connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return con;
}
}