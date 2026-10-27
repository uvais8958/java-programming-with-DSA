# Recursion Basics in Java

## What is Recursion?

Recursion is a programming technique where a function calls itself to solve a smaller version of the same problem. Every recursive function must have:

- A base case: stops the recursive calls.
- A recursive call: moves the problem closer to the base case.

Recursion is useful for problems like factorial, Fibonacci, tree traversal, and pattern printing.

---

## File: `RecursionBasic.java`

This file contains basic recursion examples that cover:

1. Factorial calculation
2. Fibonacci series
3. Printing numbers in descending order
4. Printing numbers in ascending order

---

## 1) Factorial Program

### Question
How to calculate factorial of a number using recursion?

### Code
```java
public static int fact(int n){
    if(n==0 || n==1){
        return 1;
    }
    return n * fact(n-1);
}
```

### Explanation
- Base case: if `n == 0` or `n == 1`, return `1`.
- Recursive step: multiply `n` with `fact(n-1)`.

### Example
`fact(5)` = `5 * 4 * 3 * 2 * 1 = 120`

### Output
```java
System.out.print(fact(5)); // 120
```

---

## 2) Fibonacci Series

### Question
How to print or calculate Fibonacci numbers using recursion?

### Code
```java
public static int fibon(int n){
    if(n <= 1){
        return n;
    }
    return fibon(n-1) + fibon(n-2);
}
```

### Explanation
- Base case: `n <= 1` returns `n`.
- Recursive step: add the previous two Fibonacci values.

### Example
Fibonacci sequence:
`0, 1, 1, 2, 3, 5, 8, 13, ...`

`fibon(6)` returns `8`

### Output
```java
System.out.println(fibon(6)); // 8
```

### Note
This method is simple but not efficient for large values because it repeats the same subproblems many times.

---

## 3) Print Numbers from N to 1

### Question
How to print numbers in decreasing order using recursion?

### Code
```java
public static void printDec(int n){
    if(n == 1){
        System.out.print(n);
        return;
    }
    System.out.print(n + " ");
    printDec(n-1);
}
```

### Explanation
- If `n == 1`, print `1` and stop.
- Otherwise, print `n` and call `printDec(n-1)`.

### Example
For `printDec(10)`, output is:
```java
10 9 8 7 6 5 4 3 2 1
```

### Logic
This is a classic example of recursion where the function works from the current number down to the base case.

---

## 4) Print Numbers from 1 to N

### Question
How to print numbers in increasing order using recursion?

### Code
```java
public static void printIncre(int n){
    if(n == 1){
        System.out.print(n + " ");
        return;
    }
    printIncre(n-1);
    System.out.print(n + " ");
}
```

### Explanation
- First reduce the problem by calling `printIncre(n-1)`.
- Once the smaller value reaches `1`, print it.
- Then print the current value in reverse order of recursion.

### Example
For `printIncre(10)`, output is:
```java
1 2 3 4 5 6 7 8 9 10
```

### Logic
This is a recursive pattern where the smaller problem is solved first, and the current value is added afterward.

---

## 5) Main Method

### Question
How are these recursion methods executed in the program?

### Code
```java
public static void main(String args[]){
    int n = 10;

    // System.out.print(fact(n));
    // System.out.println(fibon(n));
    // printDec(n);
    printIncre(n);
}
```

### Explanation
- `n` is set to `10`.
- The examples are commented out.
- The active call is `printIncre(10)`.

### Output
```java
1 2 3 4 5 6 7 8 9 10
```

---

## Key Points of Recursion

1. Base case is mandatory to stop repeated calls.
2. Recursive calls reduce the problem size.
3. Every call uses stack memory.
4. Too many recursive calls can cause stack overflow.
5. Recursion is useful for problems that have repeated subproblems.

---

## Summary

This file is a beginner-level recursion practice set. It teaches:

- factorial recursion
- Fibonacci recursion
- recursive number printing in descending order
- recursive number printing in ascending order

These are basic but important concepts for understanding recursion in Java.
