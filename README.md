# Attendance_system

Needed requirements <br />
Java JDK 17 or higher<br />
Maven 3.6 or higher<br />
Node.js and npm (for client-side)<br />
Git


# App structure
Attendance-system/<br />
├── server/              # Backend Spring Boot application<br />
│   └── src/<br />
│       └── main/<br />
│           ├── java/<br />
│           │   └── com/<br />
│           │       └── example/<br />
│           │           └── attendancesystem/<br />
│           │               <br />
│           │               ├── controller/<br />
│           │               ├── model/<br />
│           │               └── service/<br />
│           └── resources/<br />
└── client/       <br />
     ├── login.html/<br />
     ├── index.html/<br />
     └── script.js/      <br />


# Clone the repository 
git clone (https://github.com/krishnamenan007/attendance-system.git)<br />
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

username : admin <br />
password : 1234

