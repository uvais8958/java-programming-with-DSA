# Java String Basics

This project demonstrates the fundamental concepts of Java strings using the file `basicString.java`. It is designed for beginners who are learning Java and understanding how strings work in programming.

## Project Purpose

Strings are one of the most important data types in Java. They are used to store and manipulate text such as names, messages, addresses, file names, and user input. This beginner-friendly project focuses on the essential operations that every Java developer should understand.

In a real-world software environment, string handling is used in:
- User login and registration
- Search and validation features
- Form input processing
- Text-based application logic
- Data parsing and formatting

## What This Program Covers

The file includes examples of:
- Creating strings in Java
- String concatenation
- Converting text to uppercase and lowercase
- Finding string length
- Accessing a specific character using index
- Comparing strings with `equals()`
- Checking whether a string contains a specific substring
- Reading input using `Scanner`

## Core Java String Concepts Explained

### 1. String Declaration

A string can be created in two common ways:

```java
String name = "Uvais";
String name2 = new String("Uvais");
```

Both represent string values, but the first method is more commonly used in Java programs.

### 2. String Length

The `length()` method returns the number of characters in a string.

```java
String name = "Uvais";
System.out.println(name.length());
```

Output:

```java
5
```

### 3. Uppercase and Lowercase Conversion

```java
String name = "Uvais";
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
```

This is useful when standardizing user input, such as comparing email addresses or usernames regardless of case.

### 4. Accessing Characters

The `charAt(index)` method is used to access a specific character in a string.

```java
String name = "Uvais";
System.out.println(name.charAt(3));
```

This returns the character at index 3.

### 5. String Comparison

The `equals()` method compares two strings by value.

```java
String a = "Denesh";
String b = "Denesh";
System.out.println(a.equals(b));
```

This returns `true` because both strings are identical.

### 6. Checking Substring Presence

The `contains()` method checks whether a string contains a given sequence of characters.

```java
String str = "today i was learning java programming";
System.out.println(str.contains("java programming"));
```

This returns `true` if the text exists.

### 7. String Concatenation

Strings can be combined using `+` or by using concatenation methods in Java.

```java
String firstName = "Uvais";
String lastName = "Ansari";
String fullName = firstName + " " + lastName;
System.out.println(fullName);
```

Output:

```java
Uvais Ansari
```

### 8. Taking Input as String

The `Scanner` class is used to read user input.

```java
Scanner sc = new Scanner(System.in);
String firstName = sc.next();
String lastName = sc.nextLine();
```

- `next()` reads a single word
- `nextLine()` reads the entire line

This is commonly used in console-based applications.

## Example from the Program

The file demonstrates several of these operations together:

```java
String name = "Uvais";
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.charAt(3));

String a = "Denesh";
String b = "Denesh";
System.out.println(a.equals(b));

String str = "today i was learning java programming";
System.out.println(str.contains("java programming"));

String u = "Uvais";
String v = "Ansari";
System.out.print(u + " " + v);
```

## Why This Is Important

String manipulation is a core skill in Java development. It helps developers build:
- Login systems
- Search features
- Form validation
- Messaging apps
- Data processing tools

Recruiter-friendly summary:

This project demonstrates a strong understanding of Java basics, especially string handling, which is essential in most real-world software applications. It shows practical knowledge of user input, text processing, and common string methods used in day-to-day development work.

## Skills Demonstrated

- Java fundamentals
- String handling
- Console input/output
- Problem-solving using built-in methods
- Beginner-level application logic

## Conclusion

This project is a strong beginner-level Java exercise that lays the foundation for working with text in applications. It covers the necessary string operations that every Java developer should know and helps build confidence in coding logic and method usage.

## Run the Program

Compile and run the Java file using:

```bash
javac basicString.java
java basicString
```

## Author Note

This is a simple Java string practice file intended for learning and skill-building in core Java programming.
