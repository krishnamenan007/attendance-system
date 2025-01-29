const API_URL = "http://localhost:8080/api/auth/login";

document.addEventListener("DOMContentLoaded", () => {
    const loginForm = document.getElementById("loginForm");
    const logoutBtn = document.getElementById("logoutBtn");

    if (loginForm) {
        loginForm.addEventListener("submit", async (e) => {
            e.preventDefault();

            const username = document.getElementById("username").value.trim();
            const password = document.getElementById("password").value.trim();

            // Validate input fields
            if (!username || !password) {
                document.getElementById("errorMessage").textContent = "Please enter both username and password.";
                return; // Stop execution if validation fails
            }

            try {
                const response = await fetch(API_URL, {
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({ username, password }),
                });

                if (!response.ok) {
                    throw new Error("Invalid credentials");
                }

                const data = await response.json();
                localStorage.setItem("jwtToken", data.token); // Store token
                window.location.href = "index.html"; // Redirect to home page
            } catch (error) {
                document.getElementById("errorMessage").textContent = error.message;
            }
        });
    }

    // Handle Logout
    if (logoutBtn) {
        logoutBtn.addEventListener("click", () => {
            localStorage.removeItem("jwtToken"); // Clear token
            window.location.href = "login.html"; // Redirect to login
        });
    }

    // Protect Home Page
    if (window.location.pathname.includes("index.html") || window.location.pathname === "/") {
        const token = localStorage.getItem("jwtToken");
        if (!token) {
            window.location.href = "login.html"; 
        } 
    }
});
