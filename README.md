# Notion Clone

Welcome to **Notion Clone**, a full-featured task management application built using Java and Spring Boot. This project is developed and maintained by **Pratik Hanmante**,

## 📌 Table of Contents
- [📖 Introduction](#introduction)
- [✨ Features](#features)
- [⚙ Installation](#installation)
- [🚀 Usage](#usage)
- [🤝 Contributing](#contributing)
- [📜 License](#license)

## 📖 Introduction

Notion Clone is a powerful and intuitive task management application designed to help users efficiently create, organize, and track their tasks. This project follows **best practices** in Java development, ensuring **maintainability and scalability**.

## ✨ Features

✅ Create, update, and delete tasks  
✅ Mark tasks as complete or incomplete  
✅ User authentication and authorization  
✅ RESTful API for seamless integration  

## ⚙ Installation

### 📌 Prerequisites

- ☕ **Java Development Kit (JDK) 17** or later
- 🛠 **Apache Maven 3.6.0** or later
- 🗄 **H2 Database** (Default) or configure an external database

### 🔧 Steps

1️⃣ Clone the repository:

```sh
git clone https://github.com/pratik-hanmante/Notion-clone.git
```

2️⃣ Configure the database:

Update the `application.properties` file with your database settings.

3️⃣ Build the project:

```sh
mvn clean install
```

4️⃣ Run the application:

```sh
mvn spring-boot:run
```

## 🚀 Usage

Once the application is running, access it at **`http://localhost:8080`**. Use the web interface to manage your tasks.

### 📡 API Endpoints

🔹 `GET /tasks` - Retrieve all tasks  
🔹 `POST /tasks` - Create a new task  
🔹 `PUT /tasks/{id}` - Update a task  
🔹 `DELETE /tasks/{id}` - Delete a task  
🔹 `POST /login` - Authenticate a user  
🔹 `POST /register` - Register a new user  

## 🤝 Contributing

We welcome **contributions** to improve Notion Clone. If you have a **feature request**, **bug report**, or **improvement suggestion**, feel free to open an issue or submit a pull request.

### 💡 How to Contribute

1️⃣ **Fork** the repository  
2️⃣ **Create a new branch** (`git checkout -b feature-branch`)  
3️⃣ **Implement your changes**  
4️⃣ **Commit your changes** (`git commit -m 'Add feature XYZ'`)  
5️⃣ **Push to your branch** (`git push origin feature-branch`)  
6️⃣ **Open a pull request**  

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

🎉 **Happy coding!** 🚀

