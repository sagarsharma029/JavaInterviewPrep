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