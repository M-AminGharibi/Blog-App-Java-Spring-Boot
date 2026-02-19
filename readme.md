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





# 🔐 Security

- Spring Security integration
- password encryption
- Role-based authorization
- Protected endpoints
- Secure authentication flow


# Authentication flow:

Client → AuthController → AuthenticationManager
→ UserDetailsService → Database
→ Authentication Response → Client


---

## 🛠 Technologies Used

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

---

# 🚀 Potential Enhancements

- JWT refresh tokens

- Redis caching

- Docker containerization

- Unit & integration testing

- CI/CD pipeline

- Logging & monitoring

- Rate limiting

- Audit logging
