# Project Structure

```
IT342_G5_chavez_Lab1/
├── /backend                          # Spring Boot Backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/chavez/userauth/
│   │   │   │   ├── config/          # Security & CORS config
│   │   │   │   ├── controller/      # REST endpoints
│   │   │   │   ├── dto/             # Data Transfer Objects
│   │   │   │   ├── model/           # JPA Entity
│   │   │   │   ├── repository/      # Data access layer
│   │   │   │   ├── service/         # Business logic
│   │   │   │   └── UserauthApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── .mvn/
│   ├── pom.xml
│   ├── mvnw (for Linux/Mac)
│   ├── mvnw.cmd (for Windows)
│   ├── HELP.md
│   └── target/ (build output)
│
├── /web                              # React Frontend
│   ├── src/
│   │   ├── components/
│   │   │   ├── Dashboard.js
│   │   │   ├── Login.js
│   │   │   ├── Profile.js
│   │   │   ├── Register.js
│   │   │   └── ProtectedRoute.js
│   │   ├── App.js
│   │   ├── App.css
│   │   ├── index.js
│   │   └── index.css
│   ├── public/
│   │   └── index.html
│   ├── package.json
│   ├── package-lock.json
│   └── node_modules/ (ignored)
│
├── /mobile                           # Mobile App (empty for now)
│
├── /docs                             # Documentation
│   ├── ERD.md
│   ├── FRS.md
│   └── UML_DIAGRAMS.md
│
├── README.md
├── TASK_CHECKLIST.md
├── .gitignore
└── .git/
```

## Running the Application

### Backend (Spring Boot)
```bash
cd backend
./mvnw spring-boot:run          # Linux/Mac
mvnw.cmd spring-boot:run        # Windows
```

### Frontend (React)
```bash
cd web
npm install
npm start
```

## Git Commits
- `8eaf49d` - main_security_config_and_auth_fixes
- `e5c27d6` - refactor: reorganize project structure to match required format
