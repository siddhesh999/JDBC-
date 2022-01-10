package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class create_Table {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;
		// 1 loading or register the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			// create connection
			 connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=1815");
			// creating a platform
			createStatement = connection.createStatement();

			// execute query
			createStatement.execute("create table sweets(id int, name varchar(40), cost double, quantity int)");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection!= null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if (createStatement != null) {
				try {
					createStatement.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}

		}

	}

}
