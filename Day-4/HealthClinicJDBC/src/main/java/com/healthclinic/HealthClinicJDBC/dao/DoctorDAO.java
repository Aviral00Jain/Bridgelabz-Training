package com.healthclinic.HealthClinicJDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.healthclinic.HealthClinicJDBC.connection.DBConnection;
import com.healthclinic.HealthClinicJDBC.model.Doctor;

public class DoctorDAO {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    // ================= INSERT =================

    public void insertDoctor(Doctor doctor) {

        try {

            connection = DBConnection.getConnection();

            String query = "INSERT INTO doctor(name,specialty) VALUES(?,?)";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, doctor.getName());
            preparedStatement.setString(2, doctor.getSpecialty());

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {

                System.out.println("Doctor Added Successfully");

            } else {

                System.out.println("Doctor Not Added");

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= VIEW ALL =================

    public void getAllDoctors() {

        try {

            connection = DBConnection.getConnection();

            String query = "SELECT * FROM doctor";

            preparedStatement = connection.prepareStatement(query);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println("--------------------------------");

                System.out.println("Doctor ID : " + resultSet.getInt("doctor_id"));
                System.out.println("Name      : " + resultSet.getString("name"));
                System.out.println("Specialty : " + resultSet.getString("specialty"));

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= SEARCH =================

    public void searchDoctorById(int id) {

        try {

            connection = DBConnection.getConnection();

            String query = "SELECT * FROM doctor WHERE doctor_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                System.out.println("--------------------------------");

                System.out.println("Doctor ID : " + resultSet.getInt("doctor_id"));
                System.out.println("Name      : " + resultSet.getString("name"));
                System.out.println("Specialty : " + resultSet.getString("specialty"));

            } else {

                System.out.println("Doctor Not Found");

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= UPDATE =================

    public void updateDoctor(int id, String specialty) {

        try {

            connection = DBConnection.getConnection();

            String query = "UPDATE doctor SET specialty=? WHERE doctor_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, specialty);
            preparedStatement.setInt(2, id);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {

                System.out.println("Doctor Updated Successfully");

            } else {

                System.out.println("Doctor Not Found");

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= DELETE =================

    public void deleteDoctor(int id) {

        try {

            connection = DBConnection.getConnection();

            String query = "DELETE FROM doctor WHERE doctor_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {

                System.out.println("Doctor Deleted Successfully");

            } else {

                System.out.println("Doctor Not Found");

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}