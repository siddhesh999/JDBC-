package com.te.tclexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;

		Savepoint setSavepoint = null;

		String url = "jdbc:nysql://localhost:3306/jdbcdemo";
		try {
			connection = DriverManager.getConnection(url, "user", "1815");
			stmt = connection.createStatement();
			connection.setAutoCommit(false);
			stmt.execute("Insert into trans values(1,'UNLOCKING BY FINGERPRINT')");
			stmt.execute("Insert into trans values(2,'ENTRING THE PIN')");
			stmt.execute("Insert into trans values(3,'CHECK BALANCE)");
			System.out.println("Balance is 123456784567");

			setSavepoint = connection.setSavepoint();
			stmt.execute("Insert into trans values(4,'DEBIT THE AMOUNT')");
			stmt.execute("Insert into trans values(5,'TRANSFER THROUGH NETWORK')");
			stmt.execute("Insert into trans values(6,'CREADITING AMOUNT')");
			System.out.println("TRANSACTION COMPLITED...!!!");
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback(setSavepoint);
				connection.commit();
			} catch (Exception e2) {
				System.out.println("Transaction Dailed !!!");

			}
		}

	}
}
