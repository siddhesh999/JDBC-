package pg.kumuda.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPrepairStatement {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement Statement = null;
		try {
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbcpractice?user=root&password=1815");

			Statement = connection.prepareStatement("insert into pg values(?,?,?)");

			Scanner sc = new Scanner(System.in);
			System.out.println("enter id number : #");
			int id = sc.nextInt();
			Statement.setInt(1, id);

			System.out.println("enter namer @ :");
			String name = sc.next();
			Statement.setString(2, name);

			System.out.println("enter rent $ : ");
			int rent = sc.nextInt();
			Statement.setInt(3, rent);

//			int executeUpdate = Statement.executeUpdate();
//			System.out.println(executeUpdate);
			
			ResultSet executeQuery = Statement.executeQuery("Select * from ")
			

			
		} catch (SQLException e) {
			
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Statement.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();
		}
	}
}
