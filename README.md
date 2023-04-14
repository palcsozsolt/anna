# Task 1.

### Step 1.
Create a User class in 'com.love.study.user' package with the following fields:
 - Name (String)
 - Age (int)

Add a default (empty) constructor and all constructor for all fields and getters for all fields.

### Step 2.
Create a UserController class in 'com.love.study.user' package with an endpoint to register new User. 
The endpoint POST mapping endpoint with path "/user".
The endpoint should accept a request with payload of a User type detailed in Step 1.

### Step 3.
Create a UserService class in 'com.love.study.user' package. 
This class should have a static list on class level which can store User objects.
This class should have a method with name "registerUser" which has a parameter User type and returns nothing.
The "registerUser" adds the method to the static list.
This UserService class should be injectable to the UserController class.

### Step 4.
Inject (or in other words Autowire) the UserService to the UserController class.
The POST mapping endpoint implementation should call the "registerUser" method with the User request.
