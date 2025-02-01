# Fine Management System - Backend
**Version**: 1.0.0

Welcome to the backend of the Fine Management System repository! This backend is built with Java Spring Boot to handle all the server-side logic for managing fines, including storing, updating, and retrieving fine records.

## Features
1. **Add Fines**
    - Allows users to submit new fines with details like vehicle number, fine amount, issued date, and reason.

2. **Update Fines**
    - Provides functionality to update existing fine records.

3. **View Fines**
    - Displays all fines stored in the database with the necessary details.

4. **Filter Fines**
    - Provides sorting and filtering options, such as filtering fines by date, amount, or status.

5. **User Authentication**
    - Secure login and registration using JWT authentication.

## Tech Stack
- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Security**: Spring Security and JWT
- **API**: RESTful APIs for handling fine operations (GET, POST, PUT, DELETE)

## Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-username/fine-management-server.git
   ```
2. **Navigate to the project directory**
    ```bash
   cd fine-management-system-backend
   ```
3. **Install dependencies**
    ```bash
   mvn clean install
    ```
4. **Configure the application**
   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/fine_management_db?createDatabaseIfNotExist=true
    spring.datasource.username=username
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    ```
5. **Run the backend server**
    ```bash
    mvn spring-boot:run
    ```

## Access the backend
The backend will be running on [http://localhost:8080](http://localhost:8080).

## API Endpoints

### Fines
- **GET /api/fines** - Retrieve all fines.
- **GET /api/fines/{id}** - Retrieve a specific fine by ID.
- **POST /api/fines** - Add a new fine.
- **PUT /api/fines/{id}** - Update an existing fine.
- **DELETE /api/fines/{id}** - Delete a fine.

### Authentication
- **POST /api/auth/login** - Login and receive a JWT token for secure access to protected routes.
- **POST /api/auth/signup** - Register a new user.

