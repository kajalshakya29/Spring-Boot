# 📘 Spring Boot Examples  

This repository contains multiple examples demonstrating the **core concepts of Spring Framework and Spring Boot**. Each module showcases a different feature such as **Dependency Injection, Autowiring, Component Scanning, and Loose Coupling**.  

## 🔧 Features  
- **Constructor Injection** – Injecting dependencies using constructors  
- **Setter Injection** – Injecting dependencies via setters  
- **Autowiring** – Demonstrations of autowiring by constructor, type, and name  
- **Annotation-based Configuration** – Using `@Autowired`, `@ComponentScan`, and `@Configuration`  
- **Loose Coupling** – Achieving flexibility in code with interfaces and IoC  

## 🛠️ Tech Stack  
- **Java** (Spring Framework / Spring Boot)  
- **Maven** (build tool)  

## 📂 Project Structure
```text
SpringExample/
 ├── src/main/java/
 │   ├── car/example/bean/              # Bean example
 │   ├── car/example/constructor/       # Constructor injection
 │   ├── car/example/setter/            # Setter injection
 │   ├── com/example/autowire/          # Autowiring examples
 │   ├── com/example/autowired/anno/    # Annotation-based autowiring
 │   ├── com/example/componentscan/anno # Component scan demo
 │   └── com/loose/coupling/            # Loose coupling example
 └── pom.xml                            # Maven configuration


## 🚀 Running the Project  
Build the project using Maven:  
```bash
mvn clean install
Run examples (e.g., App.java) from your IDE or via Maven:

bash
Copy code
mvn spring-boot:run
👩‍💻 Author
Kajal Shakya

🌐 GitHub Profile : https://github.com/kajalshakya29

💼 Aspiring Java Backend Developer | Skilled in Spring Boot & REST APIs | DSA Enthusiast
