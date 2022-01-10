package pg.kumuda.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud {
	public static void main(String[] args) {
		Connection connection = null;
		Statement Statement = null;
		try {

			// lading driver classes
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// creating connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice?user=root&password=1815");

			// create platform
			Statement = connection.createStatement();
						

			// execute query
		//	Statement.execute("create table pg(id int,name varchar(40), rent int)");
			
			// update statement 
						boolean execute = Statement.execute("insert into pg values(1,'siddhesh_nikam',4500)");
						boolean execute1 = Statement.execute("insert into pg values(2,'vivek_gowda',6000)");
						boolean execute2 = Statement.execute("insert into pg values(1,'harshad_mhatre',6000)");
						boolean execute3 = Statement.execute("insert into pg values(1,'adwait',4500)");
						
						
						

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// create finally block for close the valuable resources

		finally {

			// closing connection
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// closing Statement
			if (Statement != null) {
				try {
					Statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
