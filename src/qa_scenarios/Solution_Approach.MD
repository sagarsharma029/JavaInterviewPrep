## Day 1, Q5 – Login Test Data Utility

### Problem
Design a utility class to store login test data such as:
- Username
- Password
- Environment

### Approach
- Encapsulation used to protect test data
- Constructor-based initialization
- No setters to avoid accidental modification

### QA Automation Relevance
- Centralized test data management
- Avoids hardcoding credentials
- Pattern commonly used in config and test data utilities

### Concepts Used
- Encapsulation
- Constructor
- Immutability (basic)

---

## Day 2, Q5 - Immutable Config Class

### Problem
Create an immutable configuration class containing:
- Browser
- Base URL

### Approach
- Declared class as `final` to make it immutable and avoid modification
- Used `private final` variables initialized via constructor
- No setters to avoid accidental modification

### QA Automation Relevance
- Configuration values must remain constant during test execution.
- Prevents accidental changes that can cause unstable or flaky tests.
- Commonly used pattern in automation frameworks for managing environment and browser settings.

### Concepts Used
- Immutability
- Encapsulation
- Constructors

---

## Day 3 – Q5: Base Test Class using Inheritance

### Problem
Create a base test class that contains common setup logic and allow child test classes to reuse this logic.

### Approach
- Created a `BaseTest` class to hold common setup functionality.
- Marked the setup method as `protected` so it can be accessed by child classes.
- Created a child class that extends `BaseTest`.
- Reused the setup method in the child class instead of duplicating code.
- Triggered the execution from the child class using a `main` method.

### QA Automation Relevance
- Base test classes are commonly used in automation frameworks to manage:
    - Test initialization
    - User setup
    - Environment configuration
- Inheritance helps avoid code duplication across multiple test classes.
- This design improves maintainability and scalability of the test framework.

### Concepts Used
- Inheritance
- Access modifiers (`protected`)
- Method reuse
- Framework design principles

---

## Day 4 – Q5: Payment Method using Interface

### Problem
Design a flexible payment system using an interface so that different payment methods can be implemented without changing existing code.

### Approach
- Created an interface to define a common payment contract with a `pay()` method.
- Implemented the interface in two classes: CreditCardPayment and UPIPayment.
- Used the interface reference to invoke different implementations at runtime.
- Demonstrated runtime polymorphism and loose coupling between classes.

### QA Automation Relevance
- Interface-based design allows easy addition of new payment methods without modifying test logic.
- Promotes loose coupling and maintainability in automation frameworks.
- Similar pattern is used for browser handling, environment selection, and driver management.

### Concepts Used
- Interface
- Abstraction
- Polymorphism
- Loose coupling

---

## Day 5 – Q5: Test Data using Map

### Problem
Store and retrieve login test data such as username and password using a Map.

### Approach
- Created a HashMap to store login test data as key-value pairs.
- Used keys such as "username" and "password" to represent test data fields.
- Retrieved values using the `get()` method.
- Iterated through the Map using `entrySet()` to display stored test data.

### QA Automation Relevance
- Map-based test data storage allows centralized and flexible access to credentials.
- This approach avoids hardcoding values across multiple test cases.
- Commonly used in automation frameworks for handling login credentials and environment data.

### Concepts Used
- Map (HashMap)
- Key-value pairs
- Data retrieval
- Test data management
---

## Day 6 – Q5: Browser Factory using Map

### Problem
Create a browser factory that returns different browser implementations based on an input string.

### Approach
- Defined a common `Browser` interface with an `open()` method.
- Implemented the interface using concrete classes for different browsers.
- Used a Map to store browser name as key and browser implementation as value.
- Created a factory method to return the required browser object from the Map based on input.
- Demonstrated runtime polymorphism by invoking browser methods using the interface reference.

### QA Automation Relevance
- This pattern is similar to WebDriver factory design used in automation frameworks.
- Allows easy addition of new browsers without modifying existing test logic.
- Improves maintainability and scalability of the framework.

### Concepts Used
- Interface
- Map (HashMap)
- Factory design pattern
- Polymorphism
- Loose coupling