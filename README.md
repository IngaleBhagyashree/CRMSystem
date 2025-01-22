20+ REST API'S
CRM System A simple Customer Relationship Management System built with Spring Boot for backend REST APIs, Angular for the frontend, and MySQL for the database.

Features Add, update, delete, and view Customer details Full CRUD operations for customers Cross-origin request handling for Angular Technologies 
Used Backend: Spring Boot, Spring Data JPA Frontend: Angular (http://localhost:4200) Database: MySQL Tools: Maven, Eclipse & Vs Code

Clone the repository: bash git clone  https://github.com/IngaleBhagyashree/CRMSystem.git

Frontend Setup: Set up Angular frontend and start it: bash ng serve

Database Setup: Create a MySQL database named crm  
The database schema will automatically update on application startup. 
API Endpoints 
@RequestMapping("/api/customers")
GET /customers: Fetch all customers
GET /customers/{id}: Fetch customers by ID 
GET /customers/byname/{firstName}: Fetch customers by name
GET /customers/byname/{lastName}: Fetch customers by lastfirstname
	getCustomerList
	Customer getCustomerById
	getCustomerByFirstName
	getCustomerByLastName
	getCustomerByLessThanAge
        getCustomerByMoreThanAge
	getCoustommerByAge
	getCustomerByEmail
        getCustomerByMobile
	
POST /employees: Add a new employee
       String InsertCustomer
       String insertMultipleCustomers

PUT /employees/{id}: Update employee by ID 
       updateFirstName
       updateLastName
        updateEmailId
	updateMobile
	updateAge
 
DELETE /employees/{id}: Delete customer by ID
String deleteCustomerById
