package com.healthclinic.HealthClinicJDBC.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.healthclinic.HealthClinicJDBC.connection.DBConnection;
import com.healthclinic.HealthClinicJDBC.model.Appointment;

public class AppointmentDAO {

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	CallableStatement callableStatement = null;
	ResultSet resultSet = null;

	// ================= INSERT =================

	public void insertAppointment(Appointment appointment) {

		try {

			connection = DBConnection.getConnection();

			String query = "INSERT INTO appointment(patient_id,doctor_id,appointment_date,status) VALUES(?,?,?,?)";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, appointment.getPatientId());
			preparedStatement.setInt(2, appointment.getDoctorId());
			preparedStatement.setString(3, appointment.getAppointmentDate());
			preparedStatement.setString(4, appointment.getStatus());

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {

				System.out.println("Appointment Added Successfully");

			} else {

				System.out.println("Appointment Not Added");

			}

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// ================= VIEW ALL =================

	public void getAllAppointments() {

		try {

			connection = DBConnection.getConnection();

			String query = "SELECT * FROM appointment";

			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				System.out.println("--------------------------------");

				System.out.println("Appointment ID : "
						+ resultSet.getInt("appointment_id"));

				System.out.println("Patient ID : "
						+ resultSet.getInt("patient_id"));

				System.out.println("Doctor ID : "
						+ resultSet.getInt("doctor_id"));

				System.out.println("Appointment Date : "
						+ resultSet.getString("appointment_date"));

				System.out.println("Status : "
						+ resultSet.getString("status"));

			}

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// ================= SEARCH =================

	public void searchAppointmentById(int id) {

		try {

			connection = DBConnection.getConnection();

			String query = "SELECT * FROM appointment WHERE appointment_id=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				System.out.println("--------------------------------");

				System.out.println("Appointment ID : "
						+ resultSet.getInt("appointment_id"));

				System.out.println("Patient ID : "
						+ resultSet.getInt("patient_id"));

				System.out.println("Doctor ID : "
						+ resultSet.getInt("doctor_id"));

				System.out.println("Appointment Date : "
						+ resultSet.getString("appointment_date"));

				System.out.println("Status : "
						+ resultSet.getString("status"));

			} else {

				System.out.println("Appointment Not Found");

			}

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// ================= UPDATE =================

	public void updateAppointmentStatus(int id, String status) {

		try {

			connection = DBConnection.getConnection();

			String query = "UPDATE appointment SET status=? WHERE appointment_id=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, status);
			preparedStatement.setInt(2, id);

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {

				System.out.println("Appointment Updated Successfully");

			} else {

				System.out.println("Appointment Not Found");

			}

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
    // ================= DELETE =================

    public void deleteAppointment(int id) {

        try {

            connection = DBConnection.getConnection();

            String query = "DELETE FROM appointment WHERE appointment_id=?";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {

                System.out.println("Appointment Deleted Successfully");

            } else {

                System.out.println("Appointment Not Found");

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= INNER JOIN =================

    public void showAppointmentDetails() {

        try {

            connection = DBConnection.getConnection();

            String query = "SELECT p.name AS patient_name, "
                    + "d.name AS doctor_name, "
                    + "a.appointment_date, "
                    + "a.status "
                    + "FROM patient p "
                    + "INNER JOIN appointment a "
                    + "ON p.patient_id = a.patient_id "
                    + "INNER JOIN doctor d "
                    + "ON d.doctor_id = a.doctor_id";

            preparedStatement = connection.prepareStatement(query);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                System.out.println("--------------------------------");

                System.out.println("Patient Name      : "
                        + resultSet.getString("patient_name"));

                System.out.println("Doctor Name       : "
                        + resultSet.getString("doctor_name"));

                System.out.println("Appointment Date  : "
                        + resultSet.getString("appointment_date"));

                System.out.println("Status            : "
                        + resultSet.getString("status"));

            }

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= CALL STORED PROCEDURE =================

    public void seedAppointments(int count) {

        try {

            connection = DBConnection.getConnection();

            String procedure = "{CALL seed_appointments(?)}";

            callableStatement = connection.prepareCall(procedure);

            callableStatement.setInt(1, count);

            callableStatement.execute();

            System.out.println("Stored Procedure Executed Successfully");

            connection.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // ================= TRANSACTION =================

    public void bookAppointmentTransaction(Appointment appointment) {

        Connection connection = null;

        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {

            connection = DBConnection.getConnection();

            connection.setAutoCommit(false);

            // Query 1 : Insert Appointment

            String insertQuery =
                    "INSERT INTO appointment(patient_id,doctor_id,appointment_date,status) VALUES(?,?,?,?)";

            ps1 = connection.prepareStatement(insertQuery);

            ps1.setInt(1, appointment.getPatientId());
            ps1.setInt(2, appointment.getDoctorId());
            ps1.setString(3, appointment.getAppointmentDate());
            ps1.setString(4, appointment.getStatus());

            ps1.executeUpdate();

            // Query 2 : Update Doctor Appointment Count

            String updateQuery =
                    "UPDATE doctor SET total_appointments = total_appointments + 1 WHERE doctor_id=?";

            ps2 = connection.prepareStatement(updateQuery);

            ps2.setInt(1, appointment.getDoctorId());

            ps2.executeUpdate();

            connection.commit();

            System.out.println("Transaction Successful");
            System.out.println("Appointment Booked Successfully");

        } catch (Exception e) {

            try {

                if (connection != null) {

                    connection.rollback();

                    System.out.println("Transaction Rolled Back");

                }

            } catch (SQLException ex) {

                ex.printStackTrace();

            }

            e.printStackTrace();

        } finally {

            try {

                if (ps1 != null)
                    ps1.close();

                if (ps2 != null)
                    ps2.close();

                if (connection != null) {

                    connection.setAutoCommit(true);

                    connection.close();

                }

            } catch (SQLException e) {

                e.printStackTrace();

            }

        }

    }

}