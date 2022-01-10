package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsertUsingPrePare {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "1815");
			statement = connection.prepareStatement("insert into sweets values(?,?,?,?)");
	
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setDouble(2, 50);
			statement.setInt(4, 1);
			int executeUpdate = statement.executeUpdate();
			System.out.println(executeUpdate);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
