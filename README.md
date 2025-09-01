📌 Project Overview
This is a beginner-friendly Spring Boot project designed to help you understand the fundamentals of building RESTful APIs. The application focuses on managing user data through standard CRUD operations—Create, Read, Update, and Delete—using Spring Boot, JPA (Hibernate), and MySQL.


🎯 Key Features
- Add New User: Accepts user details via a POST request and stores them in the database.
- Delete User: Removes a user by their unique ID using a DELETE request.
- Search User by ID: Retrieves user information based on their ID via a GET request.
- Search User by Email: Fetches user details using their email address.
- List All Users: Displays all users stored in the system.
- Update User: Modifies existing user data using a PUT request.


📚 Learning Objectives
- Understand RESTful API design principles
- Practice controller-service-repository separation
- Learn how to use JPA for database operations
- Handle HTTP methods and status codes properly
- Implement basic error handling and validation
📁 Sample Endpoints
POST    /api/users           → Add new user  
GET     /api/users/{id}      → Get user by ID  
GET     /api/users/email/{email} → Get user by email  
GET     /api/users           → List all users  
PUT     /api/users/{id}      → Update user  
DELETE  /api/users/{id}      → Delete user  
