# Attendance_system

# needed requirements
Java JDK 17 or higher
Maven 3.6 or higher
Node.js and npm (for client-side development)
Git


# App structure
attendance-system/
├── server/              # Backend Spring Boot application
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── attendancesystem/
│           │               
│           │               ├── controller/
│           │               ├── model/
│           │               └── service/
│           └── resources/
└── client/       
     ├── login.html/
     ├── index.html/
     └── script.js/      


# Clone the repository 
git clone (https://github.com/krishnamenan007/attendance-system.git)
cd attendance-system

# Navigate to the server directory
cd server

# Installing dependencies
mvn clean install

# Run the server
mvn spring-boot:run

# The server will start on http://localhost:8080

# Open new terminal and navigate to client folder
cd client

# Installing dependencies
npm install 

# Start the application
npm start

# Now Client Application will start on (http://localhost:5500)

username : admin
password : 1234

