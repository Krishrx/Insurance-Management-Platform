# Insurance-Management-Platform
The insurance management platform is a Spring Boot and Java-based web application that allows users to manage insurance policies, clients, and claims. The application provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on clients, insurance policies, and claims. The application uses Spring Data JPA to interact with an MySQL database.

This is a Spring Boot project created using the Spring Tool Suite 4. The project's main package is "com.krishrx.imp," which contains sub-packages for controllers, models, repositories, services, and dto's(Data Transfer Objects).

The "models" package contains the domain models for clients, insurance policies, and claims. The "repositories" package contains the Spring Data JPA repositories for the domain models. The "services" package contains the business logic for the application, and the "controllers" package contains the RESTful APIs for the application.

The project also includes a "resources" directory that contains the application.properties file for configuring the database and other Spring Boot properties.

# RESTful APIs: Implementations:

* Clients: GET, POST, PUT, and DELETE clients.
* Insurance Policies: GET, POST, PUT, and DELETE insurance policies.
* Claims: GET, POST, PUT, and DELETE claims.
* Spring Data JPA: Use Spring Data JPA to create repositories for the domain models and interact with the MySQL.
* Exception Handling and Validation: Implemented exception handling and validation to ensure proper API usage and data integrity.

# Features:

* Create new clients, insurance policies, and claims.
* Update existing clients, insurance policies, and claims.
* Delete clients, insurance policies, and claims.
* Fetch all clients, insurance policies, and claims.
* Fetch a specific client, insurance policy, or claim by ID.

# How to Run the Application Locally:

* Clone the GitHub repository.
* Import the project into your preferred IDE.
* Change the database name,username,password in application.properties.
* Run the application using the Spring Boot run configuration.
* Access the APIs using a tool like Postman.
