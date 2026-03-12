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

## 5 : Prototype Pattern 
Is a creational pattern that creates new objects by copying (cloning) an existing instance, known as the prototype, rather than creating them from scratch.
### Useful when
Object creation involves heavy database calls
- Object initialization is complex
- You need many similar Object
### Use Cases
- Game Development : Game engines often use the Prototype pattern to efficiently create numerous similar game objects like: characters, weapons, environment
- Document and Content Management Systems (CMS): In applications that manage documents or templates (e.g., invoices, reports, contracts)
- Database Record Duplication: The pattern can be used when creating similar objects from existing database records. Instead of re-querying the database for common data, an existing object can be cloned, and only the unique fields are updated.

---

## 6 : Adapter Pattern
Is a structural design pattern in Java that acts as a bridge between two incompatible interfaces, allowing them to work together without modifying their source code.
Adapter Pattern allows incompatible interfaces to work together by converting one interface into another expected by the client.
### Use Cases
- Integrating Third-party Libraries or APIs
- Legacy System Integration
- Data Formate Conversion

---

## 7 : Decorator Pattern
Is a structural design pattern that allows behavior to be added to individual objects dynamically at runtime without affecting other objects of the same class.
### Use Cases
- Product Customization : E-commerce platforms or coffee shop/pizza ordering systems use decorators to allow customers to select various add-ons (e.g., extra cheese, specific coffee add-ons, or car features) and calculate the cumulative cost and description dynamically.
- Text and UI Formatting : In text processing or GUI development, decorators can dynamically add features like bold text, scrollbars, borders, or different themes to a base component without creating a complex class hierarchy for every combination.
- Cross-Cutting Concerns (Middleware/AOP) :  In application development, decorators can be used to add functionalities such as logging, authentication, validation, or caching to core business logic components in a modular way.
- Notification Systems : A basic notification object can be decorated with additional delivery methods (SMS, Slack) or functionality (logging, retries) based on user preferences or system configuration.
- Data Processing and Security : Data streams can be dynamically enhanced with encryption or compression decorators before being written to disk.

---

## 8 : Proxy Pattern
Is a structural design pattern that provides a substitute or placeholder object to control access to another (real) object.
The Proxy Pattern is used when you want to control access to another object.
A proxy acts as a middle layer between the client and the real object.
### Use Cases
- Lazy Loading (Virtual Proxy) : This delays the creation of resource-intensive objects (like large images, files, or database connections) until they are actually needed, improving application startup time and memory usage. The proxy creates the real object only when its methods are first invoked.
- Access Control (Protection Proxy) : Proxies can enforce security checks and user permissions before allowing access to sensitive operations or data. For example, a proxy might check a user's role before permitting them to run a system command.
- Caching (Caching Proxy) : The proxy can store the results of expensive operations (e.g., database queries or API calls) and return the cached data for repeated requests, reducing latency and resource consumption.
- Logging and Monitoring (Logging Proxy): A proxy can intercept all method calls, logging information such as method names, parameters, and execution times for debugging or auditing purposes, without cluttering the business logic of the real object.

---

## 9 : Facade Pattern
Is a structural pattern that provides a simplified, unified interface to a complex subsystem, hiding internal complexity to make it easier to use.
The Facade Pattern provides a simplified interface to a complex subsystem.
Instead of the client interacting with multiple classes, the facade exposes one simple method that internally calls all required services.
### Use Cases
- Simplifying Complex Libraries/APIs : When a third-party library has dozens of classes and methods but the application only needs a tiny bit of its functionality, a facade can provide a clean, simple API for the required features.
- Integrating with Legacy Code : When integrating a new system with an old, complex legacy system, a facade can serve as a wrapper, shielding the new codebase from the legacy system's intricacies and providing a cleaner, modernized interface. 
- Layering Subsystems : In large applications with multiple subsystems (e.g., inventory, payment, and shipping in an e-commerce system), facades can define clear entry points for each layer, minimizing dependencies and communication between layers.
- Database Connectivity : The standard Java JDBC driver manager is an example of a facade, providing a unified DriverManager class to obtain database connections, hiding the specific implementations of different database drivers (MySQL, Oracle, etc.).

---

## 10: Composite Pattern
Is a structural pattern that composes objects into tree-like hierarchies to represent part-whole relationships.
The Composite Pattern is used when you want to treat individual objects and groups of objects in the same way.
### Use Cases
- File Systems
- Organizational Hierarchies : In a company structure, an Employee can be a single contributor (leaf) or a Manager (composite) who has a team of employees and other managers. Operations like calculating the total payroll or headcount can be handled uniformly across the entire hierarchy.]
- XML/HTML Parsing : XML or HTML documents have a tree-like structure where elements (composite) can contain content or other nested elements (leaves or composites). Parsers use the composite pattern to navigate and manipulate this structure.
- Menu Systems: Application menus often have nested structures with MenuItem (leaf) and MenuGroup (composite) components that share a common interface for operations like display() or onClick().

---

## 11: Strategy Pattern
