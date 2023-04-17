# TaskManagerApplication

Masai Task Manager Application is a web-based application for managing tasks. It is designed to help users keep track of their tasks, deadlines, and progress. The application allows users to create, edit, delete, and prioritize tasks. Additionally, it also provides a calendar view to help users visualize their tasks over time.

# Tech Stack
- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- MySQL
- Swagger UI
- Lambok
- Maven


# Features
- Some of the key features of the Masai Task Manager Application include:

- User authentication: Users can create an account and log in to the application.
- Create tasks: Users can create tasks and assign them a title, description, deadline, and priority.
- Edit tasks: Users can edit tasks to update their details.
- Delete tasks: Users can delete tasks that are no longer needed.
- Prioritize tasks: Users can prioritize tasks to ensure they focus on the most important tasks first.
- Calendar view: Users can view their tasks in a calendar view to help them visualize their schedule over tim
# Modules

- User Module
- Event Module



# Exception Handling
- Custom exceptions are used for handling errors in the application.
- A global exception handler is used to handle exceptions globally.
# Authentication
- Basic authentication is implemented for user registration and login




# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8080

    spring.datasource.url=jdbc:mysql://localhost:3306/TaskDB;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

# API Root Endpoint
```
https://localhost:8080/
```
```
http://localhost:8080/swagger-ui/
```
