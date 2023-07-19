# User Management System

This project is a User Management System built using Spring Boot. It provides endpoints to perform CRUD operations on user entities, including adding a user, retrieving a user by ID, retrieving all users, updating user information, and deleting a user.

## Framework and Language

- Framework: Spring Boot
- Language: Java

The project leverages the Spring Boot framework for creating a RESTful API. Spring Boot provides an efficient and streamlined way to develop robust web applications.

## Data Flow

The User Management System follows a typical client-server architecture. The client, which can be a web browser or any HTTP client, sends requests to the server's API endpoints. The server processes these requests and interacts with the underlying database to perform the requested operations. The server then sends back the appropriate HTTP responses to the client, containing the requested data or indicating the success or failure of the operation.

The data flow in the User Management System can be summarized as follows:

1. The client sends an HTTP request to the server's API endpoint.
2. The server receives the request and routes it to the appropriate controller method based on the requested URL and HTTP method.
3. The controller method performs the necessary business logic and interacts with the UserRepository to access and modify user data.
4. The UserRepository interacts with the database to retrieve or update user records.
5. The UserRepository returns the requested data or the result of the operation to the controller.
6. The controller constructs an HTTP response containing the requested data or the operation result.
7. The server sends the HTTP response back to the client.
8. The client processes the response and displays the data or handles the result accordingly.

## Data Structure Used

The User entity in this project is represented as a Java class, following the Object-Relational Mapping (ORM) paradigm. It is persisted in a relational database using Spring Data JPA. The User class has the following attributes:

- userId: Long
- name: String
- userName: String
- address: String
- phoneNumber: String

These attributes represent the properties of a user and are stored in the corresponding columns of the database table.

## Project Summary

The User Management System is a Spring Boot-based application that provides a RESTful API for managing user entities. It allows clients to add new users, retrieve user information by ID, retrieve a list of all users, update user information, and delete users.

The project follows a client-server architecture, where the client sends HTTP requests to the server's API endpoints, and the server processes these requests to perform the requested operations on user data. The data is stored in a relational database using Spring Data JPA.

This system provides a solid foundation for building user management functionality in a web application.

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd user-management-system`
3. Build the project: `./mvnw clean package`
4. Run the application: `./mvnw spring-boot:run`
5. Access the API endpoints using a tool like cURL or Postman.

## API Endpoints

The following API endpoints are available:

- **GET /users**: Retrieve a list of all users.
- **GET /users/{id}**: Retrieve a user by ID.
- **POST /users**: Add a new user.
- **PUT /users/{id}**: Update user information by ID.
- **DELETE /users/{id}**: Delete a user by ID.



