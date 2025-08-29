📘 Spring Boot Examples

This repository contains multiple examples demonstrating the core concepts of Spring Framework and Spring Boot. Each module showcases a different feature such as Dependency Injection, Autowiring, Component Scanning, and Loose Coupling.

🔧 Features

Constructor Injection – Injecting dependencies using constructors

Setter Injection – Injecting dependencies via setters

Autowiring – Demonstrations of autowiring by constructor, type, and name

Annotation-based Configuration – Using @Autowired, @ComponentScan, and @Configuration

Loose Coupling – Achieving flexibility in code with interfaces and IoC

🛠️ Tech Stack

Java (Spring Framework / Spring Boot)

Maven (build tool)

📂 Project Structure
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

🚀 Getting Started
1. Clone the Repository
git clone https://github.com/your-username/Spring-Boot-main.git
cd Spring-Boot-main/SpringExample

2. Build the Project
mvn clean install

3. Run Examples

You can run individual classes (e.g., App.java) from your IDE or via Maven:

mvn spring-boot:run

Author: @kajalshakya29
