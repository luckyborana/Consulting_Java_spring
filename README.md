# Consulting by Lucky - US Engineering Advisory (Spring Boot)

A full-stack Java web application built with **Spring Boot 3** and **Thymeleaf**, designed for US-based technical consulting and architecture retainers.

---

## Features

- **Spring MVC Routing**: Handles dynamic landing page rendering and booking form submissions.
- **Thymeleaf Templates**: Server-side rendered views (`index.html` and `success.html`) with dynamic USD pricing.
- **Form Data Binding**: Maps user inquiries directly into the `ConsultationRequest` model.
- **US Pricing Model**: Preconfigured with hourly ($225/hr) and monthly ($12,500/mo) advisory structures.

---

## Project Structure

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
