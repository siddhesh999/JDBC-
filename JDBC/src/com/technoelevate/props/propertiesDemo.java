package com.technoelevate.props;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class propertiesDemo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;
		try {
			FileReader fileReader = new FileReader("C:\\Users\\Lenovo\\Desktop\\cred.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", properties);
			createStatement = connection.createStatement();
			// createStatement.execute("create table showroom(id int primary key,CarName
			// varchar(40) not null,totalCar int ,CarPrice double )");
			// createStatement.execute("insert into showroom values(100,'alto',100,250000)"
			// );
			// createStatement.execute("insert into showroom
			// values(102,'superb',10,5000000)" );
			// createStatement.execute("insert into showroom
			// values(103,'octavia',15,4500000)" );
			// createStatement.execute("insert into showroom 
			//values(104,'rapid',50,1600000)");
			// createStatement.execute("insert into showroom
			// values(105,'qushak',20,2500000)" );
			// createStatement.execute("insert into showroom
			// values(106,'quadiak',6,6500000)" );
			createStatement.execute("delete from showroom id = 100");
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e2) {

					e2.printStackTrace();
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
}