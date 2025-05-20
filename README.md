# S04T01N01 - HelloWorld Spring Boot REST API

## 📄 Description - Exercise

**EN:**
This project is a simple REST API built with Spring Boot. It provides endpoints to greet users by name and demonstrates basic RESTful practices, error handling, and Maven project structure.

**ES:**
Este proyecto es una API REST sencilla construida con Spring Boot. Proporciona endpoints para saludar a los usuarios por nombre y demuestra prácticas REST básicas, manejo de errores y estructura de proyecto Maven.

---

## 💻 Tecnologías utilizadas

- Java 21
- Spring Boot 3.4.4
- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Maven Wrapper

---

## 📋 REQUISITOS

**ES:**
- Java JDK 21 o superior
- Maven 3.9.x o usar el Maven Wrapper incluido (`mvnw`/`mvnw.cmd`)
- Git (para clonar el repositorio)

---

## 🛠️ Instalación

**ES:**
1. Clona el repositorio:
   ```sh
   git clone https://github.com/MaraMarchello/S04T01N01
   cd S04T01N01
   ```
2. Compila el proyecto:
   ```sh
   ./mvnw clean install
   # o en Windows
   mvnw.cmd clean install
   ```

---

## ▶️ Implementación

**ES:**
- Ejecuta la aplicación:
  ```sh
  ./mvnw spring-boot:run
  # o en Windows
  mvnw.cmd spring-boot:run
  ```
- La API estará disponible en: `http://localhost:9000`
- Endpoints de ejemplo:
  - `GET /helloworld` (devuelve saludo con "UNKNOWN")
  - `GET /helloworld?name=yourname` (devuelve saludo con tu nombre)
  - `GET /helloworld2` (devuelve saludo con "UNKNOWN")
  - `GET /helloworld2/yourname` (devuelve saludo con tu nombre)

---

## 🌐 DESPLIEGUE

**ES:**
- Para desplegar en producción, construye el archivo JAR:
  ```sh
  ./mvnw clean package
  # o en Windows
  mvnw.cmd clean package
  ```
- Ejecuta el JAR:
  ```sh
  java -jar target/S04T01N01-0.0.1-SNAPSHOT.jar
  ```
- Configura las variables de entorno y ajustes del servidor según sea necesario.

---

## 🤝 Contribución

**ES:**
- Haz un fork del repositorio y crea una nueva rama para tu funcionalidad o corrección.
- Realiza tus cambios y envía un pull request con una descripción clara.
- Sigue las buenas prácticas estándar de Java y Spring Boot. 
