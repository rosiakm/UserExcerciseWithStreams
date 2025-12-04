📌 User Management – Java Streams & Optional

A simple Java project demonstrating the usage of:

  ✅ Stream API for data filtering
  ✅ Optional for safe object retrieval
  ✅ JUnit 5 for unit testing
  ✅ Lombok for boilerplate code reduction
  ✅ Basic layered architecture: Model → Builder → Service → Tests

🧩 Features

- Creating users using UserBuilder
- Storing users in UserService
- Filtering users older than 30 using Stream API
- Finding a user by ID with Optional
- Fully covered with unit tests:
  * adding users to the list
  * filtering users by age
  * finding a user by ID (positive and negative cases)

🛠️ Technologies
- Java 17+ (or any version supporting .toList())
- JUnit 5
- Lombok
- SLF4J (Logging)

🧪 Tests

Test classes:
  - BaseTest – shared test initialization
  - UserServiceTest – unit tests for:
    * user filtering
    * finding users by ID using Optional

Run tests using:

mvn test


or directly from your IDE (IntelliJ / Eclipse).

🎯 Project Goal

This project was created as a learning exercise to practice:
- working with Java Stream API
- using Optional properly
- writing clean and reliable unit tests
- building a simple and clean Java service-based architecture
