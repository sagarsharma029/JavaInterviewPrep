# Java Interview Practice – Questions Log

---

## Day 1 – Core Java & OOPS Basics

### Q1. Reverse a String
- **Problem:** Reverse a given string without using built-in reverse methods.
- **Package:** `corejava.strings`
- **Class:** `ReverseString`



### Q2. Remove Duplicate Characters from a String
- **Problem:** Remove duplicate characters from a string while preserving order.
- **Package:** `corejava.strings`
- **Class:** `RemoveDuplicateCharacters`



### Q3. Count Occurrence of Each Character
- **Problem:** Print the frequency of each character in a string.
- **Package:** `corejava.strings`
- **Class:** `CharacterFrequency`


### Q4. Demonstrate Encapsulation
- **Problem:** Create an Employee class with private fields and controlled access.
- **Package:** `oops.encapsulation`
- **Class:** `Employee`



### Q5. QA Scenario – Login Test Data Utility
- **Problem:** Design a utility class to store login test data (username, password, environment).
- **Package:** `qa_scenarios.utilities`
- **Class:** `LoginTestData`
---

## Day 2 – Strings & Constructors

### Q1. Check if String is Palindrome
- **Problem:** Check whether a given string is a palindrome.
- **Package:** `corejava.strings`
- **Class:** `PalindromeCheck`

### Q2. Count Vowels and Consonants
- **Problem:** Count the number of vowels and consonants in a string.
- **Package:** `corejava.strings`
- **Class:** `VowelConsonantCount`

### Q3. Demonstrate String Immutability
- **Problem:** Show that String objects are immutable in Java.
- **Package:** `corejava.strings`
- **Class:** `StringImmutabilityDemo`

### Q4. Constructors in Java
- **Problem:** Create a class with default and parameterized constructors.
- **Package:** `oops.constructors`
- **Class:** `User`

### Q5. QA Scenario – Immutable Config Class
- **Problem:** Create an immutable configuration class for browser and base URL.
- **Package:** `qa_scenarios.utilities`
- **Class:** `Config`
---

## Day 3 – Strings & Inheritance

### Q1. Reverse Each Word in a Sentence
- **Problem:** Reverse each word in a sentence without changing word order.
- **Package:** `corejava.strings`
- **Class:** `ReverseWordsInSentence`

### Q2. Check Two Strings Are Anagrams
- **Problem:** Check whether two strings are anagrams of each other.
- **Package:** `corejava.strings`
- **Class:** `AnagramCheck`

### Q3. Method Overriding Example
- **Problem:** Demonstrate method overriding using parent and child classes.
- **Package:** `oops.inheritance`
- **Class:** `LoginTest` (parent), `AdminLoginTest` (child)

### Q4. Use of super Keyword
- **Problem:** Demonstrate use of super keyword in inheritance.
- **Package:** `oops.inheritance`
- **Class:** `BaseClass`, `ChildClass`

### Q5. QA Scenario – Base Test Class
- **Problem:** Create a base test class and reuse setup logic in child test class.
- **Package:** `qa_scenarios.framework`
- **Class:** `BaseTest`, `LoginTest`

---

## Day 4 – Polymorphism & Abstraction

### Q1. First Non-Repeated Character in a String
- **Problem:** Find the first non-repeated character in a given string.
- **Package:** `corejava.strings`
- **Class:** `FirstNonRepeatedCharacter`

### Q2. Second Largest Number in an Array
- **Problem:** Find the second largest number in an integer array.
- **Package:** `corejava.arrays`
- **Class:** `SecondLargestNumber`

### Q3. Method Overloading Example
- **Problem:** Demonstrate method overloading using same method name with different parameters.
- **Package:** `oops.polymorphism`
- **Class:** `Calculator`

### Q4. Abstraction using Abstract Class
- **Problem:** Demonstrate abstraction using abstract class and child implementations.
- **Package:** `oops.abstraction`
- **Class:** `Browser`, `ChromeBrowser`, `FirefoxBrowser`

### Q5. QA Scenario – Payment Method Interface
- **Problem:** Demonstrate interface-based design for different payment methods.
- **Package:** `qa_scenarios.framework`
- **Class:** `PaymentMethod`, `CreditCardPayment`, `UPIPayment`
---

## Day 5 – Collections & Exceptions

### Q1. Remove Duplicates from a List
- **Problem:** Remove duplicate elements from a list of integers.
- **Package:** `collections.list`
- **Class:** `RemoveDuplicatesFromList`

### Q2. Count Character Frequency using Map
- **Problem:** Count frequency of each character in a string using Map.
- **Package:** `collections.map`
- **Class:** `CharacterFrequencyMap`

### Q3. Sort Employees by Salary
- **Problem:** Sort a list of employees by salary using Comparator.
- **Package:** `collections.list`
- **Class:** `EmployeeSortBySalary`

### Q4. Custom Exception
- **Problem:** Create and throw a custom exception if age is less than 18.
- **Package:** `exceptions`
- **Class:** `InvalidAgeExceptionDemo`

### Q5. QA Scenario – Test Data using Map
- **Problem:** Store and retrieve login test data using Map.
- **Package:** `qa_scenarios.utilities`
- **Class:** `LoginTestDataMap`
---

## Day 6 – Comparable, Sets & Exceptions

### Q1. Sort Employees using Comparable
- **Problem:** Sort Employee objects by name using Comparable.
- **Package:** `collections.list`
- **Class:** `EmployeeComparableSort`

### Q2. Find Duplicate Elements using Set
- **Problem:** Find duplicate elements in an array using Set.
- **Package:** `collections.set`
- **Class:** `FindDuplicatesUsingSet`

### Q3. HashMap vs TreeMap Demo
- **Problem:** Demonstrate difference between HashMap and TreeMap using code.
- **Package:** `collections.map`
- **Class:** `MapOrderingDemo`

### Q4. Multiple Catch Blocks
- **Problem:** Demonstrate multiple catch blocks with different exceptions.
- **Package:** `exceptions`
- **Class:** `MultipleCatchDemo`

### Q5. QA Scenario – Browser Factory using Map
- **Problem:** Implement a browser factory using Map to return different browser drivers.
- **Package:** `qa_scenarios.framework`
- **Class:** `BrowserFactory`