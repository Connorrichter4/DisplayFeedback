# Display User Feedback

## Project Description

Create a Spring Boot project that will capture user feedback using a REST endpoint. The REST resource will take in parameters using HTTP POST. The feedback data will be then added to a database table.

As a part of developing an ecommerce web application, a REST resource is needed to capture user feedback. Feedback data will be received from third-party apps and websites. The data will be sent to the REST API which will collect feedback from various sources.

## Technologies Used

- Eclipse as the IDE
- Apache Tomcat as the web server
- Spring Boot with Hibernate

## Requirements

- Create a MySQL table named feedback for storing feedback data
- An entity class Feedback should be made with annotations to link it with the feedback table
- A repository class should then map the entity class to the CrudRepository interface
- Create a REST controller class to create the REST endpoint. It should take in parameters using the POST protocol
- Data received in the REST controller will be then saved into the database
- Create a test form in HTML to submit data to the REST endpoint to ensure it’s working
- The step-by-step process involved in completing this task should be documented

## Examples

### Feedback Form

![feedback-form](https://user-images.githubusercontent.com/58124052/107054414-b5a1cd00-6795-11eb-9bc5-15913b2fab9f.png)

### Completed Form

![filled-out-form](https://user-images.githubusercontent.com/58124052/107054415-b63a6380-6795-11eb-855d-793b71aa3b00.png)

### Showing all feedback as JSON Data

![show-all-data](https://user-images.githubusercontent.com/58124052/107054416-b63a6380-6795-11eb-8461-67a516577df9.png)
