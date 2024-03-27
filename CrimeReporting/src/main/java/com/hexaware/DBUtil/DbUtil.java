package com.hexaware.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class for managing database connections.
 */

public class DbUtil {
	static Connection con;
	/**
     * Retrieves a database connection.
     * @return Connection object representing the database connection
     */
	public static Connection getDBConn() {

		try {
			// Establishing a connection to the database
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/crimeanalysis", "root", "0000");
		} catch (SQLException e) {
			// Printing the stack trace if connection fails
			e.printStackTrace();
		}

		return con;
	}
	/**
     * Main method to test the database connection.
     * @param args Command-line arguments (not used)
     */
	public static void main(String[] args) {
        // Testing the database connection
		System.out.println(getDBConn());
	}
}

