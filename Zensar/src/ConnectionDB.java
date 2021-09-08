import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private static String url = "jdbc:mysql://loacalhost:3036/********"; // ***
	private static String user = "root";
	private static String password = "tiger";

	public static Connection connect() {

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; // ***

	}

}
