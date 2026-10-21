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

## String Comparison Program

The file `stringCompara.java` demonstrates the difference between comparing strings using `==` and `.equals()` in Java.

### Why This Is Important

In Java, `==` compares reference values, while `.equals()` compares the actual content of the strings.

### Example

```java
String str1 = "Uvais";
String str2 = "Uvais";
String str3 = new String("Uvais");

if(str1 == str2){
    System.out.println("String is are equals");
}

if(str1 == str3){
    System.out.println("is equals");
}else{
    System.out.println("is not equals");
}

if(str1.equals(str3)){
    System.out.println("is equals");
}
```

### Output Summary

- `str1 == str2` is `true` because both reference the same string literal.
- `str1 == str3` is `false` because `str3` is created as a new object.
- `str1.equals(str3)` is `true` because both strings have the same content.

### Key Learning

This example helps understand:
- string references
- object creation in Java
- correct string comparison techniques

### Run the Program

```bash
javac stringCompara.java
java stringCompara
```

This is a simple beginner exercise to practice Java string comparison logic.

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

## Palindrome Check Program

The file `palindrame.java` demonstrates how to check whether a string is a palindrome.

A palindrome is a word or phrase that reads the same forward and backward, such as `racecar` or `madam`.

### Logic Used

The program compares characters from both ends of the string:

```java
public static boolean isPalindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
    }
    return true;
}
```

This loop checks the first character against the last, second against the second last, and so on. If any pair does not match, the method returns `false`.

### Example

```java
String str = "racecar";
System.out.print(isPalindrome(str)); // true
```

Another example:

```java
String str = "raceca";
System.out.print(isPalindrome(str)); // false
```

### Why It Matters

Palindrome checks are a common beginner problem in Java and help improve understanding of:
- String indexing
- Loop logic
- Comparison of characters
- Basic algorithm design

### Run the Program

```bash
javac palindrame.java
java palindrame
```

This program is a simple example of string manipulation and logical thinking in Java.

## Shortest Path Program

The file `shortestPath.java` demonstrates how to calculate the shortest distance from the starting point after following a path of directions.

The program accepts a string containing movement directions such as:
- `N` = North
- `S` = South
- `E` = East
- `W` = West

It tracks the final position and then calculates the straight-line distance from the origin using the Pythagorean formula.

### Logic Used

```java
public static float getShortestPath(String path){
    int x=0,y=0;
    for(int i=0;i<=path.length()-1;i++){
        char dir=path.charAt(i);
        if(dir=='S') y--;
        if(dir=='N') y++;
        if(dir=='W') x--;
        if(dir=='E') x++;
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2 + y2);
}
```

This works by updating the x and y coordinates based on each direction. At the end, it computes:

$$
\sqrt{x^2 + y^2}
$$

which gives the shortest path to the destination.

### Example

```java
String path = "WHEENESENNN";
System.out.print(getShortestPath(path));
```

The program prints the shortest distance from the origin after following the route.

### Why It Matters

This is a beginner-friendly example of:
- string traversal
- direction-based logic
- coordinate tracking
- mathematical calculations in Java

### Run the Program

```bash
javac shortestPath.java
java shortestPath
```

This example helps practice problem-solving with strings and simple geometry.

## Substring Program

The file `substring.java` demonstrates how to extract a substring from a string using a custom method and Java's built-in `substring()` method.

### Logic Used

```java
public static String subString(String str,int si,int ei ){
    String substr="";
    for(int i=0;i<ei;i++){
        substr += str.charAt(i);
    }
    return substr;
}
```

This method loops through the string and builds a new string from the chosen range.

### Example

```java
String str = "HelloWorld";
System.out.println(subString(str, 0, 5)); // Hello
System.out.println(str.substring(0, 5)); // Hello
```

### Why It Matters

Substring operations are commonly used in:
- text processing
- searching and filtering
- validation
- data parsing

### Run the Program

```bash
javac substring.java
java substring
```

This example helps practice string indexing and basic substring logic in Java.
