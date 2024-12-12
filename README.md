# springboot-authentication

User Authentication system using Spring Boot and Spring Security. It focuses on managing users, securely storing their passwords, and providing functionality for login and password validation.

Registration:

POST /register → Calls UserService to hash the password and save the user.

Login:

POST /login → Fetches the user by username, validates the raw password against the stored hash, and authenticates.

Debugging Passwords:

GET /api/test-password → Allows testing of raw and hashed passwords for validation issues.
