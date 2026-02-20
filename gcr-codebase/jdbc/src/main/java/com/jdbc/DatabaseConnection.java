package com.jdbc;

import java.sql.*;

public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection connection = null;

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database connected successfully!");

		} catch (ClassNotFoundException e) {
			System.err.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}
		return connection;

	}

	public static void main(String[] args) {
		Connection con = getConnection();
		if (con != null) {
			try {
				con.close();
				System.out.println("Connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

}