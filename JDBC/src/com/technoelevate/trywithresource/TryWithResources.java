package com.technoelevate.trywithresource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TryWithResources {
public static void main(String[] args) {
	try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=1815");
			Statement smt = con.createStatement();) {
			boolean exe
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
