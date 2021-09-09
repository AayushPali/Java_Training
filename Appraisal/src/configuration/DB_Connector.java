package configuration;
//change
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {
	private static String url="jdbc:mysql://localhost:3036/employee;";
	private static String user= "root";
	private static String password= "tiger";
	
	static Connection connect() throws SQLException {
		Connection con= DriverManager.getConnection(url,user,password);
		return con;
	}

}
