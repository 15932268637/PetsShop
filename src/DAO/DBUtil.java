package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	 static Connection getConnectionMYSQL() throws Exception
	{
		String connectionUrl = "jdbc:mysql://localhost:3306/petshop"; 
		 //String connectionUrl="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		 
		 //String  connectionUrl="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=petshop";
		String username = "root"; 
		String password = "mysql123"; 
		 //String username = "sa"; 
		//String password = ""; 
		Connection conn=null;
		
		try
		{
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			Class.forName("org.gjt.mm.mysql.Driver"); 
			
			conn=DriverManager.getConnection(connectionUrl, username,password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		return conn;
	}
	
}