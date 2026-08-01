CREATE DATABASE HealthClinicDB;
USE HealthClinicDB;
CREATE TABLE Doctor (
    DoctorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Specialization VARCHAR(100) NOT NULL,
    Phone VARCHAR(15) UNIQUE,
    CreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE Doctor
ADD Email VARCHAR(100) UNIQUE;
INSERT INTO Doctor (FirstName, LastName, Specialization, Phone)
VALUES ('Anjali', 'Rao', 'Cardiology', '9876500001');
SELECT DoctorID, FirstName, LastName, Specialization
FROM Doctor
WHERE Specialization = 'Cardiology';
UPDATE Doctor
SET Phone = '9876500099'
WHERE DoctorID = 1;
DELETE FROM Doctor
WHERE DoctorID = 1;
select * from doctor;