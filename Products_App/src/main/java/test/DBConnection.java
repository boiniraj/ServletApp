package test;
import java.sql.*;
public class DBConnection
{ 
	private static Connection con=null;
	private DBConnection() {};
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.uName,DBInfo.pword);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static Connection getCon(){
			return con;
		}
	}

