package com.healthclinic.HealthClinicJDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.healthclinic.HealthClinicJDBC.connection.DBConnection;
import com.healthclinic.HealthClinicJDBC.model.Patient;

public class PatientDAO {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    // ================= INSERT =================

    public void insertPatient(Patient patient) {

        try {

            connection = DBConnection.getConnection();

            String query = "INSERT INTO patient(name, phone, dob) VALUES(?,?,?)";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getPhone());
            preparedStatement.setString(3, patient.getDob());

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient Inserted Successfully");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // ================= VIEW ALL =================

    public void getAllPatients() {

        try {

            connection = DBConnection.getConnection();

            String query = "SELECT * FROM patient";

            preparedStatement = connection.prepareStatement(query);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println("--------------------------------");
                System.out.println("Patient ID : " + resultSet.getInt("patient_id"));
                System.out.println("Name       : " + resultSet.getString("name"));
                System.out.println("Phone      : " + resultSet.getString("phone"));
                System.out.println("DOB        : " + resultSet.getDate("dob"));
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // ================= SEARCH =================

    public void searchPatientById(int id) {

        try {

            connection = DBConnection.getConnection();

            String query = "SELECT * FROM patient WHERE patient_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("--------------------------------");
                System.out.println("Patient ID : " + resultSet.getInt("patient_id"));
                System.out.println("Name       : " + resultSet.getString("name"));
                System.out.println("Phone      : " + resultSet.getString("phone"));
                System.out.println("DOB        : " + resultSet.getDate("dob"));

            } else {

                System.out.println("Patient Not Found");

            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // ================= UPDATE =================

    public void updatePatient(int id, String phone) {

        try {

            connection = DBConnection.getConnection();

            String query = "UPDATE patient SET phone=? WHERE patient_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, phone);
            preparedStatement.setInt(2, id);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient Updated Successfully");
            } else {
                System.out.println("Patient Not Found");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // ================= DELETE =================

    public void deletePatient(int id) {

        try {

            connection = DBConnection.getConnection();

            String query = "DELETE FROM patient WHERE patient_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient Deleted Successfully");
            } else {
                System.out.println("Patient Not Found");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}