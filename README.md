
# Customer Orders Management System

A Spring Boot-based web application for managing customer orders securely using JWT authentication. This project uses SQLite as the backend database and supports RESTful APIs for CRUD operations.

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot 3.4.3**
- **Spring Data JPA**
- **Spring Security (JWT-based)**
- **Hibernate Validator**
- **SQLite**
- **Lombok**

## 📦 Features

- Customer and order management APIs
- Input validation with Hibernate Validator
- Authentication using JWT tokens
- Lightweight and portable SQLite database
- RESTful endpoints for integration

## 📁 Project Structure


├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.aishu.customerorders/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── security/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── schema.sql (optional)
├── customer_orders.db
├── pom.xml
├── mvnw / mvnw.cmd
├── .gitignore
└── README.md


## ⚙ Getting Started

### Prerequisites

- Java 17
- Maven 3.x

### Run the application

bash
./mvnw spring-boot:run


### API Endpoints

| Method | Endpoint             | Description                    |
|--------|----------------------|--------------------------------|
| POST   | `/api/auth/login`    | Authenticate and get JWT token |
| GET    | `/api/customers`     | Get all customers              |
| POST   | `/api/customers`     | Add new customer               |
| GET    | `/api/orders`        | List all orders                |
| POST   | `/api/orders`        | Place a new order              |

> ⚠ All endpoints (except `/login`) require JWT token in the `Authorization: Bearer <token>` header.

## 🔐 JWT Authentication

- Login using valid credentials to receive a token.
- Use the token to authorize protected endpoints.

## 🛠 Build and Test

bash
./mvnw clean install


To run tests:

bash
./mvnw test


## 👩‍💻 Author

**Aishwarya S**

