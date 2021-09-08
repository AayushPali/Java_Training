package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Practice_All_Queries {
	public static void main(String[] args) {
		try (Connection con= DriverManager.getConnection("jdbc:myql://localhost:3306/java_training", "root", "tiger")
			;PreparedStatement psInsert=con.prepareStatement("insert into emp values (?,?,?,?,?);")
			//id,name,gender,mobile,city,salary
			;PreparedStatement psUpdate=con.prepareStatement("update emp set ?=? where ?=?;")
			;Statement st= con.createStatement())
		{
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
