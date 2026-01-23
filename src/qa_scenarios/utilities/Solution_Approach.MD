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
