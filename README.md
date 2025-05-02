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

### API Endpoints

| Method | Endpoint             | Description                    |
|--------|----------------------|--------------------------------|
| POST   | `/api/auth/login`    | Authenticate and get JWT token |
| GET    | `/api/customers`     | Get all customers              |
| POST   | `/api/customers`     | Add new customer               |
| GET    | `/api/orders`        | List all orders                |
| POST   | `/api/orders`        | Place a new order              |

> ⚠ All endpoints (except `/login`) require JWT token in the `Authorization: Bearer <token>` header.




