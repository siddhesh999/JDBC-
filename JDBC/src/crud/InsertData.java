package crud;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class InsertData {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1815");
			statement = connection.createStatement();
		} catch (Exception e) {
			boolean execute = statement.execute("Insert into sweets values(101,'mysorepal'10,1)");
			boolean execute1 = statement.execute("Insert into sweets values (102,'kajukatli'40,1");
			
			

		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e2) {
					
				}
				
			}
		}
	}

}