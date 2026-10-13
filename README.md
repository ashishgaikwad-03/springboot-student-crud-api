# Student Management REST API

A basic structured Spring Boot CRUD application demonstrating enterprise backend architecture, live database handling, and strict input validation pipelines.

## Tech Stack & Architecture
- Language & Framework: Java 22, Spring Boot 4.1.1
- Build Tool: Maven
- Database Engine: MySQL Server & Workbench
- ORM Framework: Spring Data JPA (Hibernate)
- Architecture Pattern: Layered Architecture (`Controller` ➔ `Service` ➔ `Repository` ➔ `Database`)
- API Testing Interface: Postman Desktop Client

## Core Features & Implementation Details
- Full CRUD Lifecycle: Create, Read, Update, and Delete actions mapped directly to live database columns.
- Advanced Deletion Strategies: Implemented both permanent (Hard Deletes) and production-standard (Soft Deletes) (`isDeleted = 1`) to preserve data auditing logs.
- Enterprise Data Validation: Enforced robust gateway validations (`@NotBlank`, `@Min`, `@Email`) on controller request bodies to block bad inputs instantly.
- Global Error Handling: Designed a custom `@RestControllerAdvice` framework to intercept validation exceptions and return clean, human-readable JSON error mappings straight to Postman.

## API Endpoints Map

All requests use the base prefix URL path: `/api/students`

- `POST /create` - Creates a new student record (Validates payload before entry and returns `201 Created`).
- `GET /get?id={value}` - Fetches a single student using a query parameter (Returns `404 Not Found` if the ID doesn't exist).
- `GET /getAll` - Retrieves a list of all active records (Returns `404 Not Found` if the database table is completely empty).
- `PUT /update?id={value}` - Updates an existing profile using a query parameter while enforcing strict input re-validation checks.
- `DELETE /delete?id={value}` - Performs a permanent hard delete removal from the database table.
- `PATCH /soft-deleted?id={value}` - Performs a soft delete by toggling an internal system tracking flag without erasing the row data.