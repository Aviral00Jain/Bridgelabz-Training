package com.JavaIOStreams.databasetoCSV;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;

public class DbToCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "Ut*12@12345";

        String csvFile = "employees_report.csv";

        String query = "SELECT emp_id, name, department, salary FROM employee";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            FileWriter writer = new FileWriter(csvFile)
        ) {

            // Write CSV Header
            writer.write("Employee ID,Name,Department,Salary\n");

            // Write Records
            while (rs.next()) {
                writer.write(
                        rs.getInt("emp_id") + "," +
                        rs.getString("name") + "," +
                        rs.getString("department") + "," +
                        rs.getDouble("salary") + "\n"
                );
            }

            System.out.println("CSV report generated successfully");

        } catch (Exception e) {
            System.out.println("Error generating CSV report");
            e.printStackTrace();
        }
    }
}