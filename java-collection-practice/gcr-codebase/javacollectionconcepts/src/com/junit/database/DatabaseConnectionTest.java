package com.junit.database;
import static org.junit.Assert.*;
import org.junit.*;

public class DatabaseConnectionTest {
	private DatabaseConnection databaseConnection;
	@Before
	public void setUp() {
		databaseConnection = new DatabaseConnection();
		databaseConnection.connect();
	}

	@Test
	public void testConnection() {
		assertTrue(databaseConnection.isConnected());
	}

	@After
	public void tearDown() {
		databaseConnection.disconnect();
		assertFalse(databaseConnection.isConnected());
	}
}