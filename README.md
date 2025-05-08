# Catalog API (Kotlin + Spring Boot)

This is a simple RESTful API built with Kotlin and Spring Boot that models a product catalog. It includes two main entities—**Product** and **Category**—and uses an in-memory H2 database for storage.

## 🚀 Features

- Kotlin + Spring Boot backend
- REST endpoints for managing products and categories
- In-memory H2 database (resets on restart)
- JSON-based API with associations
- Built using Gradle

## 📦 Entities

### `Category`
- `id`: Long
- `name`: String

### `Product`
- `id`: Long
- `name`: String
- `price`: Double
- `category`: Category (foreign key)

## 🔧 Running the App

Make sure you have Java 17+ and Gradle installed.
```
./gradlew bootRun
```

App runs at: http://localhost:8080

🔌 API Endpoints
Categories
GET /categories – List all categories

POST /categories – Create a new category
```
curl -X POST http://localhost:8080/categories \
  -H "Content-Type: application/json" \
  -d '{"name": "Engineering"}'
```
Products
GET /products – List all products

POST /products – Create a new product (include a category)
```
curl -X POST http://localhost:8080/products \
  -H "Content-Type: application/json" \
  -d '{"name": "Rocket Shoes", "price": 129.99, "category": {"id": 1}}'
```
🤓 Tech Stack
Kotlin

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Gradle

