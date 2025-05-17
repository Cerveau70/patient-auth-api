# patient-auth-api

# Patient Auth API

Cette API Spring Boot permet la gestion de l'authentification des patients dans un système médical. Elle inclut les fonctionnalités de **connexion (login)** et d'**inscription (signup)**, avec une validation des données côté serveur.

## Technologies utilisées

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Validation Jakarta
- Base de données (H2/PostgreSQL, selon configuration)
- Maven

##  Fonctionnalités

- Inscription d’un nouveau patient avec rôle et mot de passe sécurisé
-  Connexion via nom et mot de passe
-  Validation automatique des champs (`@NotBlank`, `@Size`, etc.)
-  Structure prête à intégrer JWT pour la sécurité

##  Architecture du projet

com.api
├── controller # Endpoints REST
├── dto # Objets pour recevoir les données (login/signup)
├── model # Entités JPA (ex: Patient)
├── repository # Accès aux données via JPA
├── service # Logique métier (authentification)
└── PatientAuthApiApplication.java


## Lancement rapide

# Cloner le dépôt
git clone https://github.com/Cerveau70/patient-auth-api.git

# Se déplacer dans le dossier
cd patient-auth-api

# Lancer l'application (avec IntelliJ, Eclipse ou via Maven)
./mvnw spring-boot:run

# Swagger

![image](https://github.com/user-attachments/assets/506e4c50-a23c-47d7-945c-73f0356b7683)

![image](https://github.com/user-attachments/assets/5c7f0bcf-fdbe-4d83-ada1-7bd640bb5683)

![image](https://github.com/user-attachments/assets/4f300ed5-0be7-4983-b33e-f8f61c295341)



