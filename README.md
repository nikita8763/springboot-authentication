# springboot-authentication

User Authentication system using Spring Boot and Spring Security. It focuses on managing users, securely storing their passwords, and providing functionality for login and password validation.

Login:

POST /login → Fetches the user by username, validates the raw password against the stored hash, and authenticates.
