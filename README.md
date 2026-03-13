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
Is a behavioral pattern that enables an object to dynamically change its behavior (algorithm) at runtime by encapsulating a family of algorithms, putting each into a separate class, and making them interchangeable.
The Strategy Pattern is used when you have multiple ways to perform the same task, and you want to choose the algorithm at runtime.
Instead of using many if-else statements, you encapsulate each algorithm into separate classes and switch them dynamically.
### Use Cases
- Payment Processing :  E-commerce applications often support various payment methods (e.g., credit card, PayPal, Apple Pay, bank transfer). Each method has its own specific processing logic, which can be encapsulated in separate strategy classes. The system can switch between these strategies based on the user's selection at runtime.
- Sorting and Searching Algorithms : Applications that need to sort data in different ways (e.g., sort products by price, popularity, or rating on an e-commerce site) can use the Strategy pattern. The specific sorting algorithm (e.g., Quick Sort, Merge Sort) can be selected at runtime based on the data set or user preference.
- File Compression : Utilities that offer different compression methods (e.g., ZIP, GZIP, TAR) use the Strategy pattern. Each compression algorithm is a concrete strategy that the client can choose from dynamically.
- Navigation Systems : Car navigation systems can use different algorithms to calculate a route (e.g., shortest route, fastest route, scenic route). The user can select their preferred strategy, and the system dynamically applies the chosen algorithm.
- Pricing and Discount Calculation : Retail or e-commerce systems can apply various pricing strategies or discounts (e.g., percentage discount, fixed discount, happy hour offer) based on different conditions like user type, time of day, or sales promotions.
- Text/Image Formatting or Rendering : In applications that process or display content, different formatting or rendering algorithms can be used as interchangeable strategies, allowing the system to adapt to various output requirements or performance settings.

---

## 12: Observer Pattern
Is a behavioral pattern that defines a one-to-many dependency, allowing an object (the subject/publisher) to automatically notify dependents (observers/subscribers) about state changes
The Observer Pattern is used when one object (Subject) changes state and multiple other objects (Observers) need to be notified automatically.
It is commonly used in event-driven systems.
### Use Cases
- Model-View-Controller (MVC) Architecture : In MVC frameworks, the Model (subject) notifies the View (observer) when its underlying data changes. This allows the view to update the user interface accordingly, decoupling the data logic from the presentation logic.
- Real-time Data Updates : Applications requiring real-time data, such as stock market apps, weather monitoring systems, or chat applications, use the observer pattern to push updates to multiple interested clients as soon as the data changes.
- Social Media Notifications and RSS Feeds : When a user subscribes to a YouTube channel or follows someone on social media, they act as observers to the channel/user (subject). They are notified automatically when new content is posted.
### Note
- In Spring-boot @EventListener annotation used to make a component as observer 
- Spring automatically notifies listeners when the event occurs.

---

## 13: Command Pattern
Is a behavioral pattern that turns a request into a stand-alone object, separating the invoker of an action from the receiver that performs it. This decoupling enables complex functionality like parameterized requests, queuing, logging, and undoable operations.
### Use Cases
- Undo/Redo Functionality : This is a classic application in text editors and drawing tools. Each user action is stored as a command object in a history stack. To undo, the application pops the last command and calls its corresponding undo() method.
- Queuing and Scheduling Tasks : Since commands are objects, they can be placed in a queue or scheduled for execution at a later time or by a separate thread (e.g., in a job scheduler, thread pool, or message queue system)
- Logging and Auditing : Commands can be logged persistently to provide a history of all actions performed within the system. This log can be used for debugging, auditing, or reconstructing the system's state after a crash.
- Database Transaction Management : Each query or operation within a transaction can be wrapped in a command object. This allows for executing operations sequentially and rolling them back if one fails, ensuring data consistency.
- Workflow Orchestration and Infrastructure Automation : Commands are useful in systems where operations need to be performed in a specific order or across different services, such as a "Start System" command that triggers multiple sub-commands like turning on a server and checking database status.

---

## 14: State Pattern
Is a behavioral pattern that allows an object to change its behavior when its internal state changes.
Instead of using many if-else or switch statements, each state is represented as a separate class.
The object delegates behavior to the current state object.
### Use Cases
- Game Development : Managing character behaviors, such as a player's different states in a Super Mario game (Child, Adult, Army state), each with unique abilities and rules for power-ups or encountering enemies.
- Vending Machines : Managing states like Idle, ItemSelected, HasMoney, and Dispensing. Each state handles user interactions differently (e.g., you can't dispense an item before money is inserted). 
- Media Players : Handling actions like play, pause, and stop where the response to a button press depends on the current playback status (e.g., pressing "play" when already playing might be ignored or throw an error).
- Workflow and Document Management: Modeling processes where objects move through specific stages (e.g., a document's lifecycle from Draft to UnderReview to Published). Each state has different allowed actions and permissions.

---

## 15: Template Method
Is a behavioral design pattern that defines the skeleton of an algorithm in a base (abstract) class, but lets subclasses redefine specific steps without changing the algorithm's overall structure.
### Use Cases
- Frameworks and Libraries: Frameworks often use the template method to define the generic flow of an operation, allowing developers to extend specific parts.
- Data Processing and Reporting : The pattern is ideal for scenarios involving data processing pipelines or report generation where the high-level steps are consistent.
- Workflows and Business Processes : The classic example involves preparing hot beverages, where the prepareRecipe method defines the fixed sequence (boil water, brew, pour in cup, add condiments), but the brew and addCondiments steps vary for tea versus coffee.
- Game Development and AI : A game engine might use a template method to define the main game loop's structure (initialize, update game logic, render graphics, handle input).

---

## 16: Chain of Responsibility
Is a behavioral design pattern that passes requests along a chain of handlers. Upon receiving a request, each handler decides either to process it or pass it to the next handler in the chain.
It helps remove tight coupling between the sender and receiver.

### Use Cases
- Web Middleware & Pipelines: Frameworks like Express.js or Laravel use this to pass requests through a series of handlers (e.g., authentication → validation → logging → business logic).
- Authorization & Validation: Security frameworks use this to run multiple checks in sequence (e.g., firewall → check session → check permissions).
- Approval/Escalation Chains: Business processes where requests (e.g., expenses) are escalated from junior to senior managers if not approved.

---

