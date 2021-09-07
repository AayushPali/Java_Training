package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

public class practice_dynamic {
	public static void main(String[] args) {
		//writing in try block so as not required to close all external resources explicitly. 
		//So instead of writing finally and closing all resources explicitly we use try with resource (which implement AutoClosable interface) i.e autoclose on end of try block
		try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project_restaurant","root","tiger") 
			;Scanner sc= new Scanner(System.in)
			;Statement st = con.createStatement()) {
			
			System.out.println("Enter CustId, Name, Address & Mobile");
			int cid=sc.nextInt();
			String name=sc.next();
		
			/*
			 
			System.out.println(query);
			int c =st.executeUpdate(query);
			System.out.println("Rows affected"+c);
			*/
			PreparedStatement pst= con.prepareStatement("insert into customer(id,name) values (?,?)");
			
			pst.setInt(1, cid);
			pst.setString(2, name);
			pst.executeUpdate();
			System.out.println("Values entered");
			//ResultSet rs= pst.
		}
		catch(SQLException e) {
			
		}
	}

}
