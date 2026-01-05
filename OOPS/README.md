# OBJECT ORIENTED PROGRAMMING CONCEPTS - JAVA

## Table of Contents

1. [Introduction](#introduction)
2. [Four Pillars of OOP](#four-pillars-of-oop)
3. [Core Concepts](#core-concepts)
4. [Access Modifiers](#access-modifiers)
5. [Interview Questions & Answers](#interview-questions--answers)
6. [Code Examples](#code-examples)
7. [Best Practices](#best-practices)

---

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm that uses **objects** and **classes** to structure code. Java is a purely object-oriented language where everything is built around these core principles.

This document provides:

- ✅ Clear explanations of all OOP concepts
- ✅ Real-world code examples
- ✅ Common interview questions with answers
- ✅ GitHub repository references
- ✅ Best practices for enterprise development

---

## Four Pillars of OOP

### 1. Encapsulation

**Definition:** Bundling data (variables) and methods that operate on that data within a single unit (class), while hiding internal implementation details.

**Key Points:**

- Use `private` for sensitive data
- Provide `public` getters and setters
- Prevents unauthorized access and modifications
- Improves code maintainability

**Code Example:**

```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter - Read-only access
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
```

**GitHub Reference:**

```
https://github.com/yourusername/oop-java-examples/blob/main/src/main/java/encapsulation/BankAccount.java
```

**Interview Question:**
_Why is encapsulation important?_

- Protects data integrity
- Allows internal implementation changes without affecting external code
- Follows the principle of information hiding

---

### 2. Inheritance

**Definition:** A mechanism by which a new class (subclass/child) inherits properties and methods from an existing class (superclass/parent).

**Key Points:**

- Java supports **single inheritance** using `extends`
- Promotes code reusability
- Creates an **IS-A** relationship
- Supports **method overriding**

**Code Example:**

```java
// Parent Class
public class Vehicle {
    private String color;
    private int yearManufactured;

    public Vehicle(String color, int yearManufactured) {
        this.color = color;
        this.yearManufactured = yearManufactured;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    public String getColor() {
        return color;
    }
}

// Child Class
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String color, int yearManufactured, int numberOfDoors) {
        super(color, yearManufactured);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car engine is starting with a roar!");
    }

    public void openTrunk() {
        System.out.println("Trunk is now open");
    }
}

// Child Class
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String color, int yearManufactured, boolean hasSidecar) {
        super(color, yearManufactured);
        this.hasSidecar = hasSidecar;
    }

    public void wheelie() {
        System.out.println("Performing a wheelie!");
    }
}
```

**Usage:**

```java
Car myCar = new Car("Red", 2023, 4);
myCar.start();      // Car engine is starting with a roar!
myCar.openTrunk();  // Trunk is now open

Motorcycle myBike = new Motorcycle("Black", 2022, false);
myBike.start();     // Vehicle is starting...
myBike.wheelie();   // Performing a wheelie!
```

**GitHub Reference:**

```
https://github.com/yourusername/oop-java-examples/blob/main/src/main/java/inheritance/Vehicle.java
```

**Interview Question:**
_What is the difference between single and multiple inheritance?_

- Java supports **single inheritance** (one parent class)
- Multiple inheritance is achieved via **interfaces** to avoid the diamond problem
- This prevents ambiguity when calling overridden methods

---

### 3. Polymorphism

**Definition:** The ability of an object to take on multiple forms or a method to behave differently based on context.

**Types:**

1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

#### Compile-time Polymorphism (Overloading)

```java
public class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: Add integers and double
    public double add(int a, double b) {
        return a + b;
    }
}
```

**Usage:**

```java
Calculator calc = new Calculator();
System.out.println(calc.add(5, 10));           // 15
System.out.println(calc.add(5.5, 10.2));       // 15.7
System.out.println(calc.add(5, 10, 15));       // 30
System.out.println(calc.add(5, 10.5));         // 15.5
```

#### Runtime Polymorphism (Overriding)

```java
// Parent Class
public abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child Classes
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo! Moo!");
    }
}
```

**Usage:**

```java
Animal dog = new Dog();
Animal cat = new Cat();
Animal cow = new Cow();

dog.makeSound();    // Woof! Woof!
cat.makeSound();    // Meow! Meow!
cow.makeSound();    // Moo! Moo!

dog.sleep();        // Animal is sleeping...
```

**GitHub Reference:**

```
https://github.com/yourusername/oop-java-examples/blob/main/src/main/java/polymorphism/
```

**Interview Question:**
_Difference between overloading and overriding?_

| Feature           | Overloading      | Overriding                 |
| ----------------- | ---------------- | -------------------------- |
| Type              | Compile-time     | Runtime                    |
| Parameters        | Must differ      | Must be same               |
| Return Type       | Can differ       | Must be same/compatible    |
| Access Modifier   | Can be different | Cannot be more restrictive |
| Class Requirement | Same class       | Parent-child class         |

---

### 4. Abstraction

**Definition:** The process of hiding implementation details and showing only essential features to the user.

**Implementation Methods:**

1. **Abstract Classes** (partial abstraction)
2. **Interfaces** (complete abstraction)

#### Abstract Class Example

```java
public abstract class PaymentProcessor {

    // Abstract method - must be implemented by subclasses
    public abstract void processPayment(double amount);

    // Concrete method - common to all subclasses
    public void validatePaymentAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    // Concrete method
    public void logTransaction(String transactionId) {
        System.out.println("Transaction logged: " + transactionId);
    }
}

public class CreditCardProcessor extends PaymentProcessor {

    private String cardNumber;

    public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        validatePaymentAmount(amount);
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card: " + maskCardNumber(cardNumber));
        logTransaction("CC-" + System.currentTimeMillis());
    }

    private String maskCardNumber(String cardNumber) {
        int length = cardNumber.length();
        return "*".repeat(length - 4) + cardNumber.substring(length - 4);
    }
}

public class PayPalProcessor extends PaymentProcessor {

    private String email;

    public PayPalProcessor(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        validatePaymentAmount(amount);
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
        logTransaction("PAYPAL-" + System.currentTimeMillis());
    }
}
```

#### Interface Example

```java
// Interface - contract without implementation
public interface DatabaseConnection {
    void connect();
    void disconnect();
    void executeQuery(String query);
}

public class MySQLConnection implements DatabaseConnection {

    private String connectionString;

    public MySQLConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL: " + connectionString);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}

public class PostgreSQLConnection implements DatabaseConnection {

    private String connectionString;

    public PostgreSQLConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL: " + connectionString);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}
```

**GitHub Reference:**

```
https://github.com/yourusername/oop-java-examples/blob/main/src/main/java/abstraction/
```

**Interview Question:**
_When should you use abstract class vs interface?_

| Criterion          | Abstract Class                     | Interface                      |
| ------------------ | ---------------------------------- | ------------------------------ |
| **Purpose**        | Partial abstraction                | Complete contract              |
| **Implementation** | Can have concrete methods          | Only abstract (until Java 8)   |
| **Inheritance**    | Single inheritance                 | Multiple inheritance           |
| **State**          | Can have state (fields)            | Cannot have instance variables |
| **Use Case**       | Share code between related classes | Define behavior contract       |

---

## Core Concepts

### Constructor

A constructor is a special method called when an object is instantiated.

```java
public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}
```

### `this` and `super` Keywords

```java
public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);           // Call parent constructor
        this.employeeId = employeeId; // Current class field
    }
}
```

### Static Members

```java
public class Counter {
    private static int count = 0;  // Class variable

    public Counter() {
        count++;  // Shared among all instances
    }

    public static int getCount() {
        return count;
    }
}
```

---

## Access Modifiers

| Modifier               | Class | Package | Subclass | World |
| ---------------------- | ----- | ------- | -------- | ----- |
| `public`               | ✅    | ✅      | ✅       | ✅    |
| `protected`            | ✅    | ✅      | ✅       | ❌    |
| `default` (no keyword) | ✅    | ✅      | ❌       | ❌    |
| `private`              | ✅    | ❌      | ❌       | ❌    |

**Best Practice:** Use the most restrictive access modifier that allows functionality.

---

## Interview Questions & Answers

### Q1: Difference between `==` and `equals()` method?

**Answer:**

```java
// == compares references
String s1 = new String("Hello");
String s2 = new String("Hello");
System.out.println(s1 == s2);          // false (different objects)
System.out.println(s1.equals(s2));     // true (same content)
```

### Q2: What is the diamond problem?

**Answer:**

```
        Interface A
           /     \
      Interface B  Interface C
           \     /
        Class D
```

Java solves this through interfaces and the default method implementation.

### Q3: Can a constructor be inherited?

**Answer:** No, constructors cannot be directly inherited, but they can be invoked using `super()`.

### Q4: What is method signature?

**Answer:** Method signature = Method name + Parameters (return type is NOT part of signature).

### Q5: Explain immutable objects in Java.

**Answer:**

```java
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
```

### Q6: What is the difference between `final`, `finally`, and `finalize`?

**Answer:**

- **`final`**: Keyword - prevents modification of classes, methods, or variables
- **`finally`**: Block - always executes after try-catch
- **`finalize()`**: Method - called by garbage collector before object destruction

### Q7: What is SOLID principle?

**Answer:** Five principles for maintainable code:

- **S**ingle Responsibility
- **O**pen/Closed
- **L**iskov Substitution
- **I**nterface Segregation
- **D**ependency Inversion

---

## Code Examples

### Example 1: Complete OOP System - Bank Management

```java
// Abstract base class
public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// Concrete implementation
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}

// Usage
BankAccount savingsAccount = new SavingsAccount("ACC123", 10000, 3.5);
savingsAccount.deposit(5000);
savingsAccount.calculateInterest();
```

---

## Best Practices

1. **Follow Single Responsibility Principle:** Each class should have one reason to change
2. **Use Access Modifiers Wisely:** Keep fields private, expose only necessary methods
3. **Prefer Composition over Inheritance:** Not everything needs inheritance
4. **Use Interfaces for Contracts:** Define behavior expectations upfront
5. **Override `toString()`, `equals()`, and `hashCode()`:** For proper object representation
6. **Write Immutable Classes:** When possible, to prevent accidental modifications
7. **Use Sealed Classes:** (Java 17+) For better control over inheritance

---

## Conclusion

Mastering OOP concepts is crucial for Java development. This document covers the fundamental principles with practical examples. Practice these concepts through real-world projects to solidify your understanding.

**GitHub Repository:**

```
https://github.com/yourusername/oop-java-interview-guide
```

---

## References

- [Oracle Java Tutorials - Learning the Java Language](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java-3rd/9780134685991/)

---

**Document Version:** 1.0  
**Last Updated:** January 2026  
**Created for:** Java Backend Developers
