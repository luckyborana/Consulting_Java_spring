# Consulting by Lucky - US Engineering Advisory (Spring Boot)[cite: 6]

A full-stack Java web application built with **Spring Boot 3** and **Thymeleaf**, designed for US-based technical consulting and architecture retainers[cite: 6].

---

## Features[cite: 6]

- **Spring MVC Routing**: Handles dynamic landing page rendering and booking form submissions[cite: 6].
- **Thymeleaf Templates**: Server-side rendered views (`index.html` and `success.html`) with dynamic USD pricing[cite: 6].
- **Form Data Binding**: Maps user inquiries directly into the `ConsultationRequest` model[cite: 6].
- **US Pricing Model**: Preconfigured with hourly ($225/hr) and monthly ($12,500/mo) advisory structures[cite: 6].

---

## Project Structure[cite: 6]

```text
consulting-by-lucky/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── lucky/
        │           └── consulting/
        │               ├── ConsultingApplication.java
        │               ├── controller/
        │               │   └── HomeController.java
        │               └── model/
        │                   └── ConsultationRequest.java
        └── resources/
            ├── application.properties
            └── templates/
                ├── index.html
                └── success.html
```[cite: 6]

---

## Prerequisites (Pre-requisites)[cite: 6]

Make sure the following tools are installed on your machine before running:[cite: 6]
- **Java Development Kit (JDK)**: Version 17 or higher (`java -version`)[cite: 6]
- **Apache Maven**: Version 3.8+ (`mvn -version`)[cite: 6]
- **Web Browser**: Chrome / Firefox / Edge[cite: 6]

---

## How to Run (Step-by-Step)[cite: 6]

### Method 1: Using Terminal / Command Line[cite: 6]

1. **Extract and open directory:**[cite: 6]
   ```bash
   cd consulting-by-lucky
   ```[cite: 6]

2. **Clean and build the project:**[cite: 6]
   ```bash
   mvn clean package
   ```[cite: 6]

3. **Start Spring Boot server:**[cite: 6]
   ```bash
   mvn spring-boot:run
   ```[cite: 6]

4. **Alternative: Run directly with JAR:**[cite: 6]
   ```bash
   java -jar target/consulting-by-lucky-1.0.0.jar
   ```[cite: 6]

---

### Method 2: Using IDE (IntelliJ IDEA / Eclipse / VS Code)[cite: 6]

1. Open your IDE[cite: 6].
2. Click **Open / Import Project** and select the `consulting-by-lucky` folder[cite: 6].
3. Choose **Maven Project** so dependencies load automatically[cite: 6].
4. Locate `src/main/java/com/lucky/consulting/ConsultingApplication.java`[cite: 6].
5. Right-click and select **Run 'ConsultingApplication'**[cite: 6].

---

## Access Application in Browser[cite: 6]

Once the console displays `Started ConsultingApplication`:[cite: 6]

- **Homepage**: Open [http://localhost:8080](http://localhost:8080)[cite: 6]
- **Booking Flow**: Fill out the consultation inquiry form to test the `/book` submission and success screen[cite: 6].

---

## Troubleshooting (Common Issues & Fixes)[cite: 6]

* **Issue: `Port 8080 is already in use`**[cite: 6]
  * **Fix**: Change port inside `src/main/resources/application.properties`:[cite: 6]
    ```properties
    server.port=8081
    ```[cite: 6]
  * Then access via `http://localhost:8081`[cite: 6].

* **Issue: `Java version error / Unsupported class file version`**[cite: 6]
  * **Fix**: Ensure your `JAVA_HOME` is pointing to JDK 17+. Check with:[cite: 6]
    ```bash
    java -version
    javac -version
    ```[cite: 6]

* **Issue: `mvn: command not found`**
  * **Fix**: Ensure Apache Maven is added to your system's `PATH` environment variable.

* **Issue: Dependencies not downloading**[cite: 6]
  * **Fix**: Force dependency update using:
    ```bash
    mvn clean install -U
    ```
