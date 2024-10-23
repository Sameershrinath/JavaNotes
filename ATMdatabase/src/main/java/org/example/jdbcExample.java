package org.example;

import java.sql.*;

public class jdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_sgvu";
        String user = "root";
        String password = "Amar@1161";
        try {
            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Insert a new record
            stmt.executeUpdate("insert into users (username, password, balance) values ('ajay', '1234', 18000)");

            // Use executeQuery for SELECT queries
            ResultSet rs = stmt.executeQuery("select * from users");

            // Process the result set
            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username") + ", Balance: " + rs.getInt("balance"));
            }

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
