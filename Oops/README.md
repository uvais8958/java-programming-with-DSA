# OOPs in Java

This folder contains a simple Java program that demonstrates the basic concepts of Object-Oriented Programming (OOPs).

## File: `Oops.java`

`Oops.java` is the main example file in this folder. It shows how to:

- create an object of a class
- define class attributes (fields)
- assign values using a method
- print object data in the console

## Class: `Student`

The `Student` class represents a student object with the following attributes:

- `name`
- `rollNo`
- `course`
- `address`
- `fess`

It also contains a method called `studentDetails(...)` that sets the values of these fields for a student.

## Program Flow

In `main()`:

- a `Student` object is created using `new Student()`
- the `studentDetails(...)` method is called with sample data
- the student information is printed on the screen

This example is a basic introduction to OOPs concepts like:

- class
- object
- instance variables
- methods

## Encapsulation in Java

Encapsulation is one of the core principles of OOPs. It means wrapping data (variables) and the methods that operate on that data into a single class, and protecting the data from direct outside access.

In Java, this is usually done by:

- declaring fields as `private`
- using `public` getter and setter methods to access or update the data
- adding validation logic inside setters

### Example: `BankAccount.java`

```java
package Oops;

public class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid Amount...");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(500);
        System.out.println(acc.getBalance());
    }
}
```

### Why this is encapsulation

- The variable `balance` is `private`, so it cannot be changed directly from outside the class.
- Only the setter method `setBalance()` can modify it.
- The setter checks whether the amount is valid before updating the value.
- The getter method `getBalance()` provides controlled access to the data.

### Benefits of encapsulation

- protects data from accidental modification
- improves code security
- makes code easier to maintain
- helps enforce business rules and validation

### Real-world use

Encapsulation is commonly used in:

- bank accounts
- employee records
- student information systems
- login and authentication classes

This example shows how encapsulation helps control how data is read and modified safely.
