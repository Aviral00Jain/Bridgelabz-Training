package com.jdbc;

import java.sql.*;

public class DatabaseConnectionSingleton {

	private static DatabaseConnectionSingleton instance;
	private Connection connection;
	private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private DatabaseConnectionSingleton() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new SQLException("Database Driver not found", e);
		}

	}

	public static DatabaseConnectionSingleton getInstance() throws SQLException {
		if (instance == null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}
}