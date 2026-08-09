\# Day 4 – JDBC and Health Clinic Management System



\## Objective



The objective of Day 4 was to understand JDBC and connect a Java application with a MySQL database.



\## Topics Covered



\- JDBC Introduction

\- JDBC Architecture

\- JDBC Driver

\- Database Connection

\- Connection class

\- PreparedStatement

\- ResultSet

\- CRUD Operations

\- DAO Pattern

\- Joins

\- CallableStatement

\- Stored Procedure

\- Transactions

\- Commit and Rollback



\## Project – Health Clinic Management System



A Java Maven JDBC project was created for managing patients, doctors and appointments.



\### Database



MySQL database used:



`health\_clinic`



\### Tables



\#### Patient



\- patient\_id

\- name

\- phone

\- dob



\#### Doctor



\- doctor\_id

\- name

\- specialty



\#### Appointment



\- appointment\_id

\- patient\_id

\- doctor\_id

\- appointment\_date

\- status



The `appointment` table acts as the linking table between Patient and Doctor.



\## Project Structure



```text

HealthClinicJDBC

│

├── src/main/java

│   └── com.healthclinic.HealthClinicJDBC

│       │

│       ├── connection

│       │   └── DBConnection.java

│       │

│       ├── dao

│       │   ├── PatientDAO.java

│       │   ├── DoctorDAO.java

│       │   └── AppointmentDAO.java

│       │

│       └── main

│           └── Main.java

│

└── pom.xml

