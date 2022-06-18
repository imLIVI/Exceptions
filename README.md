# Checking access to a resource
## Description
During the launch of the program, you need to request a username or password of the user. If one of the entered parameters does not match (login/password), then you need to throw a checked UserNotFoundException exception. If the user is less than 18 years old, then you need to throw the AccessDeniedException exception, and if 18 or older, display the message "Access granted".

The array of users for authorization must be described before launching the program. Each user record contains the following fields: login, password, age and email.

## The functionality of the program
1. Creating a Scanner to read the user's login and password from the console;
2. Creating a checked UserNotFoundException exception;
3. Creating a checked AccessDeniedException exception;
4. Throw a UserNotFoundException error if the username or password is entered incorrectly;
5. Throw the AccessDeniedException error if the user is under 18 years old;
6. If there are no errors, display the message "Access granted".
