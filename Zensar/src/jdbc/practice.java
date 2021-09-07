package jdbc;
//Excellent !! ALL these imports are interfaces which are implemented by driver class!
import java.sql.Connection;
import java.sql.DriverManager;		//this isn't a abstract class or interface
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;;


public class practice {
	public static void main(String[] args) {
		try {
			//interface- abstraction
			Class.forName("com.mysql.cj.jdbc.Driver");				//load driver, Connection, Statement is a interface.....All implementer classes are in the maven jar file (made by mysql)
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project_restaurant", "root", "tiger");					//returns object of class that has implemented Connection interface..but we don't get to know the name of the implementing (child) class.
			System.out.println(".Connection Established");
			Statement st = con.createStatement();					//now as con references mysql(i.e driver) object. Which has implemented (overridden) all methods of Connection Interface and references it's object to the parent Interface.
			int c=0;														//See ArrayList Iterator implementation for comparison. Find Differences.
			//c= st.executeUpdate("insert into customer values(1,'Nakul','Dehradun',8940919235)");
			//insert update delete QUERIES return count...Select QUERY returns grid
			System.out.println("Rows Modified -"+c);
			
			ResultSet rs = st.executeQuery("select * from customer");          //ResultSet -->Interface
			
			while(rs.next()) {
				System.out.println(rs.getLong(4)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4));
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Irrespective");
		}
		
	}

}
