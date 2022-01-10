package mock.jdbc.practice;

import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class PreparedStatement {
public static void main(String[] args) {
	try {
		Driver driver = new Driver();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
