package com.healthclinic.HealthClinicJDBC.main;

import java.util.Scanner;

import com.healthclinic.HealthClinicJDBC.dao.AppointmentDAO;
import com.healthclinic.HealthClinicJDBC.dao.DoctorDAO;
import com.healthclinic.HealthClinicJDBC.dao.PatientDAO;
import com.healthclinic.HealthClinicJDBC.model.Appointment;
import com.healthclinic.HealthClinicJDBC.model.Doctor;
import com.healthclinic.HealthClinicJDBC.model.Patient;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PatientDAO patientDAO = new PatientDAO();
		DoctorDAO doctorDAO = new DoctorDAO();
		AppointmentDAO appointmentDAO = new AppointmentDAO();

		int choice;

		do {

			System.out.println("\n========== HEALTH CLINIC MANAGEMENT ==========\n");

			System.out.println("----------- PATIENT -----------");
			System.out.println("1. Add Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Search Patient");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");

			System.out.println();

			System.out.println("----------- DOCTOR ------------");
			System.out.println("6. Add Doctor");
			System.out.println("7. View All Doctors");
			System.out.println("8. Search Doctor");
			System.out.println("9. Update Doctor");
			System.out.println("10. Delete Doctor");

			System.out.println();

			System.out.println("-------- APPOINTMENT ----------");
			System.out.println("11. Add Appointment");
			System.out.println("12. View All Appointments");
			System.out.println("13. Search Appointment");
			System.out.println("14. Update Appointment Status");
			System.out.println("15. Delete Appointment");
			System.out.println("16. View Appointment Details (JOIN)");
			System.out.println("17. Generate Random Appointments (Stored Procedure)");
			System.out.println("18. Book Appointment (Transaction)");
			System.out.println("19. Exit");

			System.out.print("\nEnter Your Choice : ");

			choice = sc.nextInt();

			switch (choice) {

			// ================= PATIENT =================

			case 1:

				Patient patient = new Patient();

				sc.nextLine();

				System.out.print("Enter Patient Name : ");
				patient.setName(sc.nextLine());

				System.out.print("Enter Phone : ");
				patient.setPhone(sc.nextLine());

				System.out.print("Enter DOB (yyyy-mm-dd) : ");
				patient.setDob(sc.nextLine());

				patientDAO.insertPatient(patient);

				break;

			case 2:

				patientDAO.getAllPatients();

				break;

			case 3:

				System.out.print("Enter Patient ID : ");

				patientDAO.searchPatientById(sc.nextInt());

				break;

			case 4:

				System.out.print("Enter Patient ID : ");

				int patientId = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter New Phone : ");

				String phone = sc.nextLine();

				patientDAO.updatePatient(patientId, phone);

				break;

			case 5:

				System.out.print("Enter Patient ID : ");

				patientDAO.deletePatient(sc.nextInt());

				break;

			// ================= DOCTOR =================

			case 6:

				Doctor doctor = new Doctor();

				sc.nextLine();

				System.out.print("Enter Doctor Name : ");

				doctor.setName(sc.nextLine());

				System.out.print("Enter Specialty : ");

				doctor.setSpecialty(sc.nextLine());

				doctorDAO.insertDoctor(doctor);

				break;

			case 7:

				doctorDAO.getAllDoctors();

				break;

			case 8:

				System.out.print("Enter Doctor ID : ");

				doctorDAO.searchDoctorById(sc.nextInt());

				break;

			case 9:

				System.out.print("Enter Doctor ID : ");

				int doctorId = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter New Specialty : ");

				String specialty = sc.nextLine();

				doctorDAO.updateDoctor(doctorId, specialty);

				break;

			case 10:

				System.out.print("Enter Doctor ID : ");

				doctorDAO.deleteDoctor(sc.nextInt());

				break;
				// ================= APPOINTMENT =================

				case 11:

					Appointment appointment = new Appointment();

					System.out.print("Enter Patient ID : ");
					appointment.setPatientId(sc.nextInt());

					System.out.print("Enter Doctor ID : ");
					appointment.setDoctorId(sc.nextInt());

					sc.nextLine();

					System.out.print("Enter Appointment Date (yyyy-mm-dd hh:mm:ss) : ");
					appointment.setAppointmentDate(sc.nextLine());

					System.out.print("Enter Status : ");
					appointment.setStatus(sc.nextLine());

					appointmentDAO.insertAppointment(appointment);

					break;

				case 12:

					appointmentDAO.getAllAppointments();

					break;

				case 13:

					System.out.print("Enter Appointment ID : ");

					appointmentDAO.searchAppointmentById(sc.nextInt());

					break;

				case 14:

					System.out.print("Enter Appointment ID : ");

					int appointmentId = sc.nextInt();

					sc.nextLine();

					System.out.print("Enter New Status : ");

					String status = sc.nextLine();

					appointmentDAO.updateAppointmentStatus(appointmentId, status);

					break;

				case 15:

					System.out.print("Enter Appointment ID : ");

					appointmentDAO.deleteAppointment(sc.nextInt());

					break;

				case 16:

					appointmentDAO.showAppointmentDetails();

					break;

				// ============== STORED PROCEDURE ==============

				case 17:

					System.out.print("Enter Number of Random Appointments : ");

					int count = sc.nextInt();

					appointmentDAO.seedAppointments(count);

					break;

				// ================ TRANSACTION =================

				case 18:

					Appointment transactionAppointment = new Appointment();

					System.out.print("Enter Patient ID : ");
					transactionAppointment.setPatientId(sc.nextInt());

					System.out.print("Enter Doctor ID : ");
					transactionAppointment.setDoctorId(sc.nextInt());

					sc.nextLine();

					System.out.print("Enter Appointment Date (yyyy-mm-dd hh:mm:ss) : ");
					transactionAppointment.setAppointmentDate(sc.nextLine());

					System.out.print("Enter Status : ");
					transactionAppointment.setStatus(sc.nextLine());

					appointmentDAO.bookAppointmentTransaction(transactionAppointment);

					break;

				case 19:

					System.out.println("\nThank You...!");

					break;

				default:

					System.out.println("Invalid Choice");

				}

			} while (choice != 19);

			sc.close();

		}

	}