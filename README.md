# E-Commerce
This project is an e-commerce based platform where I picked state pattern design in order to best implement an elegant tracking and shipment system. I will utilize many aspects of object oriented programming to make this code reusable, robust and professional
## Shipment Tracking System
### Overview
  * The Shipment Tracking System is a Spring Boot application that demonstrates the use of the State Design  
    Pattern in managing the lifecycle of an e-commerce shipment.
  * The application tracks the states of a   package, such as Order Received, Dispatched, In Transit, Out        for Delivery, and Delivered, and allows for transitions between these states.
  * The project provides RESTful APIs for managing and simulating package status changes, customer     
    notifications, and tracking updates.
### Features
  1) State Design Pattern Implementation: Encapsulates state-specific behaviors and transitions for shipment 
     lifecycle management.
  2) RESTful API: Exposes endpoints for interacting with the shipment lifecycle (e.g., view status,
     transition states, notify customers).
  4) Customer Notifications: Simulates customer notifications at each state.
  5) Extensibility: Easily add new states, such as Cancelled or Delayed.
  6) Logging and Auditing: Logs state transitions with timestamps for auditing purposes.
  7) Timeout Management: Detects and handles delays in certain states (e.g., In Transit).
### Technologies Used
  * *Java:* Core programming language.
  * *Spring Boot:* Framework for building the application.
  * *Spring Web:* For creating RESTful APIs.
  * *Maven:* Dependency management and project build tool.
### Prerequisites
  * Written in Java 17+
  * Package Management Maven 3.6+
  * Postman or cURL for API testing (optional)
### API Endpoints
##### I. Get Current Package Status
      * URL: /api/package/status
      * Method: GET
      * Response: Current status of the package.
##### II. Transition to the Next State
      * URL: /api/package/next
      * Method: POST
      * Response: Moves the package to the next state in the lifecycle.
##### III. Transition to the Previous State
      * URL: /api/package/previous
      * Method: POST
      * Response: Moves the package to the previous state.
##### IV. Notify the Customer
      * URL: /api/package/notify
      * Method: POST
      * Response: Simulates sending a notification to the customer about the current state.
