# Spring Boot REST API Demo Peoject

## 📌 Project Overview
This is a beginner-friendly Spring Boot project designed to help you understand the fundamentals of building RESTful APIs. The application focuses on managing user data through standard CRUD operations—Create, Read, Update, and Delete—using Spring Boot, JPA (Hibernate), and MySQL.


## 🎯 Key Features

🔵 **Add New User:** Accepts user details via POST and stores them in the database  
🔴 **Delete User:** Removes a user by their unique ID using DELETE  
🟢 **Search User by ID:** Retrieves user info via GET  
🟢 **Search User by Email:** Fetches user details using email  
🟢 **List All Users:** Displays all users stored in the system  
🟡 **Update User:** Modifies existing user data using PUT  


## 📚 Learning Objectives
🔵 Understand RESTful API design principles
🔵 Practice controller-service-repository separation
🔵 Learn how to use JPA for database operations
🔵 Handle HTTP methods and status codes properly
🔵 Implement basic error handling and validation

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
