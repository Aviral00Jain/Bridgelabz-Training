\# BridgeLabz Refresher Training



This repository contains my day-wise learning, practical activities, assignments, and projects completed during the BridgeLabz Refresher Training program.



\*\*GitHub Profile:\*\* \[Aviral00Jain](https://github.com/Aviral00Jain/)



\*\*Repository:\*\* \[Bridgelabz-Training](https://github.com/Aviral00Jain/Bridgelabz-Training)



\*\*Branch:\*\* `Refresher-Training`



\---



\## Training Overview



I am maintaining this repository to document my daily learning and practical implementation during the BridgeLabz Refresher Training.



The repository is organized into day-wise folders, where each folder contains the code, assignments, projects, and practical activities completed during that training day.



\---



\# Daily Log and Milestones



\## Day 1 – SQL and DBMS Fundamentals



\### Focus Area



Database Management Systems, SQL, DDL, DML, and CRUD operations.



\### Code \& Resources



\[View Day 1 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-1)



\### Core Concepts Covered



\- Introduction to DBMS

\- DBMS vs File System

\- DDL Commands

\- DML Commands

\- CRUD Operations

\- Database and Table Creation

\- INSERT, UPDATE, DELETE and SELECT

\- Primary Key

\- Foreign Key

\- Basic SQL Queries

\- MySQL Database Operations



\### Practical Work



Worked with the Health Clinic database containing:



\- Patient

\- Doctor

\- Appointment



\---



\# Day 2 – ER Diagram and Database Normalization



\### Focus Area



Database design, ER diagrams, relationships, keys, and normalization.



\### Code \& Resources



\[View Day 2 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-2)



\### Core Concepts Covered



\- ER Diagram

\- Entities and Attributes

\- Primary Key

\- Foreign Key

\- One-to-Many Relationship

\- Many-to-Many Relationship

\- Junction Table

\- Data Redundancy

\- Data Anomalies

\- First Normal Form (1NF)

\- Second Normal Form (2NF)

\- Third Normal Form (3NF)



\### Practical Work



Designed the Health Clinic database using:



\- Patient table

\- Doctor table

\- Appointment table



The Appointment table was used as the linking table between Patient and Doctor.



\---



\# Day 3 – SQL Joins, Triggers and Stored Procedures



\### Focus Area



Advanced SQL operations and database automation.



\### Code \& Resources



\[View Day 3 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-3)



\### Core Concepts Covered



\### SQL Joins



\- INNER JOIN

\- LEFT JOIN

\- RIGHT JOIN

\- Multiple Table Joins

\- Retrieving patient, doctor, and appointment information



\### Triggers



\- AFTER INSERT Trigger

\- AFTER UPDATE Trigger

\- AFTER DELETE Trigger

\- Automatic database operations using triggers



\### Stored Procedures



\- Creating Stored Procedures

\- Calling Stored Procedures

\- Passing Parameters

\- Using Stored Procedures for database operations



\### Practical Work



Implemented advanced SQL operations on the Health Clinic database using joins, triggers, and stored procedures.



\---



\# Day 4 – Health Clinic JDBC Application



\### Focus Area



Building a Java-based CLI application using JDBC to interact with the Health Clinic database.



\### Code \& Resources



\[View Day 4 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-4)



\### Core Concepts Covered



\- JDBC Introduction

\- JDBC Architecture

\- Database Connection

\- DriverManager

\- Connection

\- PreparedStatement

\- ResultSet

\- CRUD Operations

\- POJO Classes

\- DAO

\- CallableStatement

\- Stored Procedure Integration

\- Transactions

\- Exception Handling



\### Application Features



\- Add patients

\- Update patients

\- Delete patients

\- View patients

\- Add doctors

\- Manage appointments

\- Retrieve data using joins

\- Execute stored procedures

\- Perform database transactions



\### Application Flow



MySQL Database → JDBC → DAO → POJO → Java CLI Application



\### Summary



Built a Health Clinic JDBC application demonstrating end-to-end integration between the MySQL database and Java application.



\---



\# Day 5 – Spring Core Configuration



\### Focus Area



Understanding Spring Core, IoC, Dependency Injection, Beans, and different configuration approaches.



\### Code \& Resources



\[View Day 5 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-5)



\### Core Concepts Covered



\- Spring Framework Introduction

\- IoC (Inversion of Control)

\- IoC Container

\- Dependency Injection

\- Spring Beans

\- ApplicationContext

\- BeanFactory

\- Constructor Injection

\- Setter Injection

\- Field Injection



\### XML-Based Configuration



\- applicationContext.xml

\- `<bean>`

\- `<constructor-arg>`

\- `<property>`

\- `ref`

\- Constructor-based dependency injection

\- Setter-based dependency injection



\### Annotation-Based Configuration



\- `@Component`

\- `@Autowired`

\- `@Value`

\- `@ComponentScan`



\### Java-Based Configuration



\- `@Configuration`

\- `@Bean`

\- `AnnotationConfigApplicationContext`



\### Practical Work



Implemented Student Management examples using:



\- XML-based configuration

\- Annotation-based configuration

\- Java-based configuration



Understood how the Spring IoC Container creates and manages Spring Beans and injects their dependencies.



\---



\# Day 6 – Spring MVC Greeting Application



\### Focus Area



Building a basic Spring MVC web application using Thymeleaf and JSP.



\### Code \& Resources



\[View Day 6 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-6)



\### Core Concepts Covered



\- Spring MVC Architecture

\- MVC Design Pattern

\- DispatcherServlet

\- Controller

\- Model

\- View

\- `@Controller`

\- `@GetMapping`

\- `@PostMapping`

\- `@RequestMapping`

\- `@RequestParam`

\- `@PathVariable`

\- Thymeleaf

\- JSP

\- View Resolution

\- Request-Response Flow

\- Dependency Injection



\### Practical Work



Built a Greeting MVC application using:



\- Spring Boot

\- Spring MVC

\- Thymeleaf

\- JSP

\- Controller

\- Model

\- View



\### Request Flow



Client → DispatcherServlet → Controller → Model → Thymeleaf/JSP → Response



\### Summary



Implemented a basic Greeting application to understand Spring MVC architecture and the flow of HTTP requests and responses.



\---



\# Day 7 – Spring Boot REST API



\### Focus Area



Building a RESTful API using Spring Boot with DTO, Entity, CRUD operations, and Postman.



\### Code \& Resources



\[View Day 7 Directory](https://github.com/Aviral00Jain/Bridgelabz-Training/tree/Refresher-Training/Day-7)



\### Core Concepts Covered



\- Spring Boot

\- RESTful API

\- `@RestController`

\- HTTP Methods

\- GET

\- POST

\- PUT

\- DELETE

\- CRUD Operations

\- Entity

\- DTO (Data Transfer Object)

\- Service Layer

\- Repository Layer

\- Dependency Injection

\- HTTP Status Codes

\- JSON Request and Response

\- Postman API Testing



\### Practical Work



Built a Contact Management REST API using:



\- Contact Entity

\- Contact DTO

\- Controller

\- Service

\- Repository

\- CRUD APIs

\- Postman Testing



\### API Operations



\- POST → Create Contact

\- GET → Get Contact(s)

\- PUT → Update Contact

\- DELETE → Delete Contact



\### API Flow



Client → Controller → DTO → Service → Repository → Database



\### Summary



Built and tested a Contact Management REST API using Spring Boot, DTO, CRUD operations, and Postman.



\---



\# Technologies Used



\- Java

\- Java 8

\- MySQL

\- JDBC

\- Maven

\- Spring Core

\- Spring MVC

\- Spring Boot

\- Thymeleaf

\- JSP

\- REST API

\- Postman

\- Git

\- GitHub

\- Spring Tool Suite (STS)



\---



\# Projects Completed



1\. Health Clinic Database

2\. Health Clinic JDBC CLI Application

3\. Student Management – Spring Core

4\. Greetings MVC Application

5\. Contact Management REST API



\---



\# Overall Learning Progress



SQL \& DBMS

↓

Database Design \& Normalization

↓

Advanced SQL

↓

Java + JDBC

↓

Spring Core

↓

Spring MVC

↓

Spring Boot REST API



The training helped me strengthen my understanding of Java, databases, JDBC, Spring Core, Spring MVC, and Spring Boot through practical implementation and project-based learning.



\---



\## Previous Training



The README and documentation from the previous training are preserved here:



\[View Previous Training Documentation](./Previous-Training.md)

