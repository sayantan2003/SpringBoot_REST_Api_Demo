# Spring Boot REST API Demo Peoject

## 📌 Project Overview\
This is a beginner-friendly Spring Boot project designed to help you understand the fundamentals of building RESTful APIs. The application focuses on managing user data through standard CRUD operations—Create, Read, Update, and Delete—using Spring Boot, JPA (Hibernate), and MySQL.


## 🎯 Key Features
`rgb(9, 105, 218)` **Add New User:** Accepts user details via a POST request and stores them in the database.
`rgb(9, 105, 218)` **Delete User:** Removes a user by their unique ID using a DELETE request.
`rgb(9, 105, 218)` **Search User by ID:** Retrieves user information based on their ID via a GET request.
`rgb(9, 105, 218)` **Search User by Email:** Fetches user details using their email address.
`rgb(9, 105, 218)` **List All Users:** Displays all users stored in the system.
`rgb(9, 105, 218)` **Update User:** Modifies existing user data using a PUT request.


## 📚 Learning Objectives
`rgba(218, 9, 107, 1)` Understand RESTful API design principles
`rgba(218, 9, 173, 1)` Practice controller-service-repository separation
Learn how to use JPA for database operations
`rgba(218, 9, 107, 1)`Handle HTTP methods and status codes properly
`rgba(218, 9, 107, 1)` Implement basic error handling and validation

## 🧰 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven

## 📁 Sample Endpoints
**POST**    /api/user                  → Add new user  
**GET**     /api/user/{id}             → Get user by ID  
**GET**     /api/user/email/{email}    → Get user by email  
**GET**     /api/users                 → List all users  
**PUT**     /api/user/{id}             → Update user  
**DELETE**  /api/user/{id}             → Delete user  
