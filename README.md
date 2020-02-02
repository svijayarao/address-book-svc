# address-book-svc

##  Description

Address Book API

- You can get the list of customers by using the last name
- Once you get the customers, you can access the address of the customer

### Implementation

- Implemented using Spring Boot Web, H2 DB, and HATEOAS
- The application when run creates H2 DB with two tables CUSTOMER and ADDRESS populated with test data
- You can find the test data in src/main/resources/data.sql file
- Use the data to test the application  

### Assumptions and Scope

- Based on the requirements, assumed that I'm asked to build an API using HATEOAS
- Tried to keep it simple
- Can add more tests for controller, service and data layer


### Instructions to install and start the application

##### Clone the application into a folder
 
        git@github.com:svijayarao/address-book-svc.git
        
##### Navigate to the folder, build and start the application

        cd address-book-svc        
        mvn clean install
        java -jar target/address-book-svc-0.0.1-SNAPSHOT.jar

##### Open your favourite browser and hit the below endpoint
        
        http://localhost:8080/customers/root
