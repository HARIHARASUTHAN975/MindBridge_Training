# Student Management System

The Student Management System is a Java-based console application designed to efficiently manage student records. The system allows users to add, update, delete, search, and sort student details. Additionally, it supports storing and retrieving data from a file.

## Features

- **Add New Student**: Register a new student with ID, name, age, marks, and email.
- **View All Students**: Display all student records.
- **Search Students**:
  - **By ID**: Retrieve student details using an ID.
  - **By Grade**: List students with a specific grade.
  - **By Age**: Filter students within a specified age range.
- **Update Student Details**: Update name, age, marks (which affects grade), and email.
- **Delete Student Records**: Remove a student by ID.
- **Store Data in a File**: Save student records to a text file (`student.txt`).
- **Retrieve Data from a File**: Load existing student records from `student.txt`.
- **Sort Students**:
  - By Grade
  - By Age

## Project Structure

The project structure of the Student Management System is organized as follows:

- `src/`: Contains the core Java files:
  - `Student.java`: Defines the student attributes and methods.
  - `Main.java`: Contains the main application logic and menu system.
- `data/`: Holds `student.txt`, where student records are stored for persistence.
- `README.md`: Documentation for the project.

## Usage

1. Run the program and choose an option from the displayed menu.
2. Follow the prompts to enter student details or search criteria.
3. To save data, select the option to store records in a file.
4. Exit the program by selecting the appropriate option.

## File Handling

- The student data is stored in `student.txt`.
- If no file exists, the system will create one upon saving records.
- Data is loaded automatically when retrieving records.
