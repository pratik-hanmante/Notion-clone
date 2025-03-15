Notion Clone

Welcome to Notion Clone, a full-featured task management application built using Java and Spring Boot. This project is developed and maintained by DevOps Shack, a YouTube channel focused on DevOps tutorials and best practices.

Table of Contents

Introduction

Features

Installation

Usage

Contributing

License

Introduction

Notion Clone is a powerful and intuitive task management application designed to help users efficiently create, organize, and track their tasks. This project follows best practices in Java development, ensuring maintainability and scalability.

Features

Create, update, and delete tasks

Mark tasks as complete or incomplete

User authentication and authorization

RESTful API for seamless integration

Installation

Prerequisites

Java Development Kit (JDK) 17 or later

Apache Maven 3.6.0 or later

H2 Database (Default) or configure an external database

Steps

Clone the repository:

git clone https://github.com/pratik-hanmante/Notion-clone.git

Configure the database:

Update the application.properties file with your database settings.

Build the project:

mvn clean install

Run the application:

mvn spring-boot:run

Usage

Once the application is running, access it at http://localhost:8080. Use the web interface to manage your tasks.

API Endpoints

GET /tasks - Retrieve all tasks

POST /tasks - Create a new task

PUT /tasks/{id} - Update a task

DELETE /tasks/{id} - Delete a task

POST /login - Authenticate a user

POST /register - Register a new user

Contributing

We welcome contributions to improve Notion Clone. If you have a feature request, bug report, or improvement suggestion, feel free to open an issue or submit a pull request.

How to Contribute

Fork the repository

Create a new branch (git checkout -b feature-branch)

Implement your changes

Commit your changes (git commit -m 'Add feature XYZ')

Push to your branch (git push origin feature-branch)

Open a pull request

License

This project is licensed under the MIT License. See the LICENSE file for details.

Happy coding!

