package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RetriveData {
public static void main(String[] args) {
	Connection connection = null;
	Statement statement;
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","1815");
		statement = connection.createStatement();
		ResultSet result = statement.cr
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
