package pg.kumuda.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AllJDBCOperation {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	//PreparedStatement statement=null;
	String url="jdbc:mysql://localhost:3306/jdbcpractice";
	try {
		connection = DriverManager.getConnection(url,"root","1815");
//		statement = connection.prepareStatement("insert into car values(?,?)");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the car name you need");
//		String name = sc.next();
//		System.out.println("Enter the amount of the car");
//		double price = sc.nextDouble();
//		
//		statement.setString(1, name);
//		statement.setDouble(2, price);
//		statement.executeUpdate();
		statement = connection.createStatement();
		ResultSet executeQuery = statement.executeQuery("select * from car");
//		System.out.println(executeQuery);
		while (executeQuery.next()) {
			System.out.print(executeQuery.getString(1)+",");
			System.out.println(executeQuery.getDouble(2));
		}
		
		
		
		
		
		
		
		
		
		
	//	boolean execute = statement.execute("create table car(name varchar(40),price double)");//----> we use in crud operation
	//	int executeUpdate = statement.executeUpdate("insert into car values('vento',2000022)");
		//int executeUpdate = statement.executeUpdate("Delete from car where name='nano'");
		
		//ResultSet executeQuery = statement.executeQuery("");//----->reterving the data
		//int executeUpdate = statement.executeUpdate("");//------>updating the data
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
