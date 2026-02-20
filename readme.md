# 🏗 Blog Platform API – Enterprise Spring Boot Backend

A production-style Blog Platform REST API built with **Spring Boot**, demonstrating layered architecture, DTO mapping, validation, centralized exception handling, authentication, and clean code principles.

This project reflects intermediate-to-advanced backend engineering practices suitable for real-world applications and backend developer positions.

---

# 📌 Project Overview

The Blog Platform API provides:

- User registration & authentication
- Role-based authorization
- CRUD operations for blog posts
- Category management
- Pagination & sorting support
- Input validation
- Structured error handling
- DTO ↔ Entity mapping abstraction
- Relational database persistence

The application follows clean architectural principles to ensure maintainability, scalability, and separation of concerns.

---

# 🧱 Architecture

## High-Level Layered Architecture

            ┌───────────────────────┐
            │        Client         │
            │  (Postman / Swagger)  │
            └─────────────┬─────────┘
                          │ HTTP
                          ▼
            ┌───────────────────────┐
            │     Controller Layer  │
            │   REST API Endpoints  │
            └─────────────┬─────────┘
                          │
                          ▼
            ┌───────────────────────┐
            │     Service Layer     │
            │   Business Logic      │
            └─────────────┬─────────┘
                          │
                          ▼
            ┌───────────────────────┐
            │   Repository Layer    │
            │   Spring Data JPA     │
            └─────────────┬─────────┘
                          │
                          ▼
            ┌───────────────────────┐
            │       Database        │
            │   H2 / PostgreSQL     │
            └───────────────────────┘



---

## Architectural Principles Applied

- Layered Architecture
- SOLID principles
- Constructor-based Dependency Injection
- DTO Pattern
- Repository Pattern
- Service Abstraction
- Centralized Exception Handling
- RESTful API design
- Validation Layer
- Secure password handling

---




#  What This Project Demonstrates

## 1️⃣ REST API Design

- Proper HTTP methods (GET, POST, PUT, DELETE)

- Status codes (200, 201, 400, 404, etc.)

- Path variables & query parameters

- Pagination & sorting

## 2️⃣ Data Layer

- JPA Entity modeling

- Entity relationships (e.g., Post ↔ Category)

- Database normalization

- Spring Data JPA repositories

- Custom query methods

## 3️⃣ DTO & Mapping Layer

- Separation of internal entities from API responses

- Mapping between Entity and DTO

- Clean API contracts

- Reduced data exposure

## 4️⃣ Validation

- @Valid

- @NotNull, @Size, etc.

- Field-level validation

- Error response handling

## 5️⃣ Exception Handling

- Custom exceptions

- Global exception handler using @ControllerAdvice

- Structured error responses

## 6️⃣ Authentication & Security (if implemented)

- Spring Security integration

- User registration

- Role-based authorization

- Password encryption

## 7️⃣ Clean Code Practices

- Constructor-based dependency injection

- Interface-driven service layer

- Clear naming conventions

- Consistent package structure






---





# 🔐 Security

- Spring Security integration
- password encryption
- Role-based authorization
- Protected endpoints
- Secure authentication flow


## Authentication flow:

Client → AuthController → AuthenticationManager
→ UserDetailsService → Database
→ Authentication Response → Client


---

# 🛠 Technologies Used

| Technology        | Purpose                        |
|-------------------|--------------------------------|
| Java 17+          | Programming Language           |
| Spring Boot       | Backend Framework              |
| Spring Web        | REST Layer                     |
| Spring Data JPA   | ORM                            |
| Hibernate         | Persistence                    |
| Spring Security   | Authentication & Authorization |
| Spring Validation | Input Validation               |
| H2 / PostgreSQL   | Database                       |
| Maven             | Build Tool                     |
| Swagger / OpenAPI | API Documentation              |
| Lombok            | Utilities                      |
| Docker & Docker Compose           | Infrastructure                      |
| MapStruct         | Utilities                      |

**Note:** I use Java version **21** in this case.
H2 in memory database used for Testing.
PostgreSQL used for Production/Dev.

---

# 🗄 Database

- Relational database integration via JPA
- Entity relationships
- Transaction-safe operations
- ACID-compliant data consistency

---

# 📈 Backend Skills Demonstrated

- Designing RESTful APIs

- Implementing layered architecture

- Entity relationship modeling

- DTO mapping strategy

- Authentication & authorization

- Exception handling strategy

- Validation strategy

- Clean code and maintainability

- Production-style backend structure

- Transactional data management

---

# 🚀 Potential Enhancements

- Redis caching

- Docker containerization

- Unit & integration testing

- CI/CD pipeline

- Logging & monitoring

- Rate limiting

- Audit logging

---

## 👨‍💻 Author

M.Amin Gharibi  
Junior Backend Developer – Java & Spring Boot