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


# Task 2.1
 
### Step 1.
Add a new field to the User class
- Id (UUID)
This field is an auto generated once the user is created. The user is created when the post request is triggered and put in the static list. (Task 1. / Step 3.)
Set the Id field in the UserService class.
Additional note: UUID is a built in type in Java, to generate a new one there is a static method.

### Step 2.
Create a new enpoint GET with path "/user" in the UserController class.
The endpoint should return a list of users.

### Step 3.
Create a new method in the UserService class which takes no argument returns a list of users.
It should return the content of the static list (which is our database at the moment).
Use this method for the new endpoint in the controller class.


# Task 2.2
*continue Task 2.2 once 2.1 is finished

### Step 1.
Create a new GET endpoint with "/user/{id}" in the UserController class. Note {id} is parameter of the endpoint.
The endpoint should return a single user.

### Step 2.
Create a method which takes one argument (the id of the User) and returns one user.
This method should filter the static list of users (our database) for the given id. It needs to iterate through the list and find a match for a user id.
Use this method for the new endpoint in the controller class.

### Step 3.
Create a custom exception UserNotFoundException.
This exceptions should inherit from the RuntimeException class.
It should have one constructor which takes an arugment of String type. The argument is the error message.

### Step 4.
Throw the UserNotFoundException when there is no user found in Task 2.2 / Step 2.
