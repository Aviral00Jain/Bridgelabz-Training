\# Day 3 - SQL JOINs \& Triggers Practice



\## Objective

The objective of Day 3 is to understand SQL JOIN operations and the basics of SQL Triggers using a Hospital Management Database.



\## Database

\*\*HealthClinicDB\*\*



\## Tables Used

\- Doctor

\- Patient

\- Appointment



\## Topics Covered

\- INNER JOIN

\- LEFT JOIN

\- Multiple Table JOIN

\- GROUP BY

\- HAVING

\- COUNT()

\- Introduction to Triggers

\- BEFORE and AFTER Triggers



\## Queries Implemented



\### 1. Display Doctor Name and Patient Name

Uses INNER JOIN to display doctors with their respective patients.



\### 2. Display Doctor Name and Appointment Date

Displays each doctor's appointment date.



\### 3. Display Patient Name and Appointment Date

Displays patient names with their appointment dates.



\### 4. Display All Doctors (Including Doctors Without Appointments)

Uses LEFT JOIN to display every doctor, even if no appointment exists.



\### 5. Display All Patients (Including Patients Without Appointments)

Uses LEFT JOIN to display every patient, even if no appointment exists.



\### 6. Count Total Appointments for Each Doctor

Uses COUNT() and GROUP BY to calculate the total number of appointments handled by each doctor.



\### 7. Display Doctors with More Than 10 Years of Experience

Uses INNER JOIN with a WHERE clause to filter experienced doctors.



\### 8. Display Doctor Name, Patient Name and Appointment Date

Displays complete appointment details by joining all three tables.



\### Bonus Query

Display doctors having more than one appointment using GROUP BY and HAVING.



\## Trigger Concepts Learned

\- What is a Trigger?

\- Purpose of Triggers

\- Difference between Trigger and Stored Procedure



\## Concepts Learned

\- Difference between INNER JOIN and LEFT JOIN

\- Joining multiple tables using Foreign Keys

\- Using table aliases (d, p, a)

\- Aggregate functions with GROUP BY

\- Filtering grouped data using HAVING

\- Basics of automatic database operations using Triggers





