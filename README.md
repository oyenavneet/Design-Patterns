# Hands-on Design Patterns in Java using Spring Boot

## 1 : Singleton Pattern
Is a Creational design pattern that restricts a class to a single instance while providing a global, shared access point.
### Use Cases
- Logging
- Configuration Management
- Database connection
- Caching

---

## 2 : Factory Pattern 
Is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.
### Use Cases
- DB Connection Management : we can use a factory to generate different database connection object like MySqlCOnnection, PostgreSqlConnection etc.
- Redis Instance : To create different redis instance based on configurations, like Standalone, Sentinel and cluster.
- Payment Gateway Integration: We can use factories to instantiate different payment processors like Stripe, PayPal, Paytm etc.
- Logging Frameworks : Applications use logger factories to create loggers with various configurations (e.g., file logger, database logger, console logger) depending on the environment or desired output.
- File Parsing and Document Generation : Systems that need to handle different file formats (e.g., CSV, JSON, XML parsers) or generate various document types (e.g., PDF, Excel, Word generators) use factories to return the correct parser or generator based on the file type.

---

## 3 : Abstract Factory
Is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. 
In simple terms: 
    Factory Pattern → Create one type of object 
    Abstract Factory → create a group/family of related objects
### Use Cases
- Notification System : Different providers may support multiple notification type
  - AWS have  → SES, SNS
  - Twilio have → SendGrid, Twilio SMS
- Each provider produce a family of related services.

---

## 4 : Builder Pattern 
Is a creational design pattern that allows the step-by-step construction of complex objects, separating the construction logic from the object's final representation.
### Use Cases
- When Class has numerous optional parameters, to avoid the Telescoping Constructor 
- Order Creation API
  - In an e-commerce system, order object can have many fields.
  - Some fields are required and many are optional
  - Like:
  - ```
    Order (Object)
    orderId
    userId
    items
    totalAmount
    shippingAddress
    couponCode (optional)
    giftWrap (optional)
    deliveryInstructions (optional)
    expressDelivery (optional)
    // if use constructer
    new Order(id, userId, items, amount, address, coupon, giftWrap, instructions, express);
    ```
  - Above example is hard to read 
  - Order of parameters confusing 
  - Many optional parameters 
  - Not maintainable
- Builder Pattern solves this issue.
- Example:
- ```
  Order order = new Order.Builder("ORD101", "USER22")
                .totalAmount(1500)
                .shippingAddress("Lucknow")
                .couponCode("NEWUSER")
                .giftWrap(true)
                .expressDelivery(true)
                .build();
  ```
  
---

## 4 : Prototype Pattern 
Is a creational pattern that creates new objects by copying (cloning) an existing instance, known as the prototype, rather than creating them from scratch