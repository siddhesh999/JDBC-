package com.technoelevate.storeprocidures;

import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callStatement = null;
		Scanner sca =new  Scanner(System.in);
		try {
			connection = DriverManager.getConnection(url, "root", "1815");
			callStatement = connection.prepareCall("call put(?,?,?,?)");
		
			while (true) {
				System.out.println("enter the id");
				int id = sca.nextInt();
				System.out.println("enter the Car name");
				String CarName = sca.next();
				System.out.println("enter the total car ");
				int TotalCar = sca.nextInt();
				System.out.println("enter the price of car");
				double CarPrice = sca.nextDouble();

				callStatement.setInt(1, id);
				callStatement.setString(2, CarName);
				callStatement.setInt(3, TotalCar);
				callStatement.setDouble(4, CarPrice);

				callStatement.execute();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}


}
