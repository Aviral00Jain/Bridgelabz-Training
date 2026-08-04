create database practice;
use practice;
CREATE TABLE Doctor (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_name VARCHAR(50) NOT NULL,
    specialization VARCHAR(50) NOT NULL,
    experience INT NOT NULL
);
INSERT INTO Doctor (doctor_name, specialization, experience)
VALUES
('Arjun Mehta', 'Cardiologist', 12),
('Sneha Kapoor', 'Dermatologist', 8),
('Vikram Shah', 'Neurologist', 15),
('Riya Nair', 'Orthopedic', 10),
('Kunal Verma', 'Pediatrician', 6);
CREATE TABLE Patient (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_name VARCHAR(50) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    age INT NOT NULL
);
INSERT INTO Patient (patient_name, gender, age)
VALUES
('Aman', 'Male', 24),
('Pooja', 'Female', 29),
('Rohan', 'Male', 31),
('Simran', 'Female', 22),
('Kabir', 'Male', 27);
CREATE TABLE Appointment (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_id INT,
    patient_id INT,
    appointment_date DATE,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);
INSERT INTO Appointment (doctor_id, patient_id, appointment_date)
VALUES
(1, 1, '2026-08-10'),
(2, 2, '2026-08-11'),
(3, 3, '2026-08-12'),
(1, 4, '2026-08-13'),
(5, 5, '2026-08-14');
select * from doctor;
select * from patient;
select * from appointment;
-- patientname and doctor name-------------------------------
SELECT d.doctor_name, p.patient_name
FROM Doctor d
INNER JOIN Appointment a
ON d.doctor_id = a.doctor_id
INNER JOIN Patient p
ON a.patient_id = p.patient_id;

-- docotr name and appointment date----------------------------
SELECT d.doctor_name, a.appointment_date
FROM Doctor d
INNER JOIN Appointment a
ON d.doctor_id = a.doctor_id;

-- patient_name and appointment date---------------------------
SELECT p.patient_name, a.appointment_date
FROM Patient p
INNER JOIN Appointment a
ON p.patient_id = a.patient_id;

SELECT d.doctor_name, p.patient_name
FROM Doctor d
LEFT JOIN Appointment a
ON d.doctor_id = a.doctor_id
LEFT JOIN Patient p
ON a.patient_id = p.patient_id;

SELECT p.patient_name, d.doctor_name
FROM Patient p
LEFT JOIN Appointment a
ON p.patient_id = a.patient_id
LEFT JOIN Doctor d
ON a.doctor_id = d.doctor_id;

SELECT d.doctor_name,
       COUNT(a.appointment_id) AS total_appointments
FROM Doctor d
LEFT JOIN Appointment a
ON d.doctor_id = a.doctor_id
GROUP BY d.doctor_name;
SELECT d.doctor_name,
       p.patient_name,
       d.experience
FROM Doctor d
INNER JOIN Appointment a
ON d.doctor_id = a.doctor_id
INNER JOIN Patient p
ON a.patient_id = p.patient_id
WHERE d.experience > 10;
SELECT d.doctor_name,
       p.patient_name,
       a.appointment_date
FROM Doctor d
INNER JOIN Appointment a
ON d.doctor_id = a.doctor_id
INNER JOIN Patient p
ON a.patient_id = p.patient_id;
