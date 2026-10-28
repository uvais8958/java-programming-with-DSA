# Recursion Basics in Java

Recursion is a technique where a function calls itself to solve a smaller version of the same problem. It is useful when a problem can be divided into similar subproblems.

## End-to-end flow of recursion

A recursive function usually has 3 parts:

1. **Base case**: stops the recursion.
2. **Recursive call**: calls the same function with a smaller input.
3. **Work after recursion**: performs action after the smaller problem is solved.

When a function calls itself, Java keeps each call in memory stack. Once the base case is reached, Java starts returning back to previous calls.

Example:
```java
public static int fact(int n){
    if(n == 0 || n == 1){
        return 1; // base case
    }
    return n * fact(n - 1); // recursive call
}
```

For `fact(4)`:
- `fact(4)` -> `4 * fact(3)`
- `fact(3)` -> `3 * fact(2)`
- `fact(2)` -> `2 * fact(1)`
- `fact(1)` -> `1`

Then Java returns step by step:
- `fact(2)` -> `2 * 1 = 2`
- `fact(3)` -> `3 * 2 = 6`
- `fact(4)` -> `4 * 6 = 24`

So the answer is `24`.

---

## 1) Factorial

### Problem
Find the factorial of a number.

### Code
```java
public static int fact(int n){
    if(n == 0 || n == 1){
        return 1;
    }
    return n * fact(n - 1);
}
```

### How it works
- If `n` is `0` or `1`, return `1`.
- Otherwise, call the same method with `n - 1`.
- Multiply the current number with the result of the smaller call.

### Example
```java
System.out.println(fact(5)); // 120
```

---

## 2) Fibonacci

### Problem
Find the nth Fibonacci number.

### Code
```java
public static int fib(int n){
    if(n <= 1){
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}
```

### How it works
- If `n` is `0` or `1`, return `n`.
- Else, add results of previous two Fibonacci numbers.

### Example
```java
System.out.println(fib(6)); // 8
```

Fibonacci sequence:
`0, 1, 1, 2, 3, 5, 8, ...`

### Note
This is a classic recursive example, but it is not efficient for large values because the same values are recalculated many times.

---

## 3) Print numbers from N to 1

### Code
```java
public static void printDec(int n){
    if(n == 1){
        System.out.print(n + " ");
        return;
    }
    System.out.print(n + " ");
    printDec(n - 1);
}
```

### How it works
- Print the current value.
- Call the function again with `n - 1`.
- Stop when `n` becomes `1`.

### Example
```java
printDec(5);
```

Output:
```java
5 4 3 2 1
```

---

## 4) Print numbers from 1 to N

### Code
```java
public static void printInc(int n){
    if(n == 1){
        System.out.print(n + " ");
        return;
    }
    printInc(n - 1);
    System.out.print(n + " ");
}
```

### How it works
- First reduce the problem to smaller values.
- When it reaches `1`, print it.
- Then print the current values while returning from recursion.

### Example
```java
printInc(5);
```

Output:
```java
1 2 3 4 5
```

---

## 5) Check if array is sorted

### Code
```java
public static boolean checkSh(int arr[], int index){
    if(index == arr.length - 1){
        return true;
    }
    if(arr[index] > arr[index + 1]){
        return false;
    }
    return checkSh(arr, index + 1);
}
```

### How it works
- Base case: when index reaches the last element, array is sorted so far.
- Compare current value with next value.
- If any value is greater than the next value, array is not sorted.
- Otherwise, move to the next index.

### Example
```java
int arr[] = {1, 2, 3, 4, 5};
System.out.println(checkSh(arr, 0)); // true
```

---

## 6) Find first occurrence of a key

### Code
```java
public static int firstAcc(int arr[], int key, int i){
    if(i == arr.length - 1){
        return -1;
    }
    if(arr[i] == key){
        return i;
    }
    return firstAcc(arr, key, i + 1);
}
```

### How it works
- Check the current element.
- If it matches the key, return its index.
- Otherwise, move to next index.
- If no match is found, return `-1`.

### Example
```java
int arr[] = {8, 2, 6, 9, 5, 10, 7};
System.out.println(firstAcc(arr, 5, 0)); // 4
```

---

## 7) Sum of first natural numbers

### Code
```java
public static int cal(int n){
    if(n == 1){
        return 1;
    }
    int snm1 = cal(n - 1);
    int sn = n + snm1;
    return sn;
}
```

### How it works
- Recursively calculate sum up to `n - 1`.
- Add current number `n` to that result.

### Example
```java
System.out.println(cal(5)); // 15
```

---

## Key points to remember

- A recursive function must have a base case.
- Each recursive call should reduce the problem size.
- Too many recursive calls may cause stack overflow.
- Recursion is easy to write for problems with repeated subproblems.

## Summary

Recursion is a powerful concept in Java where a function solves a problem by reducing it into smaller similar problems. In this folder, we practiced:
- factorial
- Fibonacci
- number printing
- sorted array check
- first occurrence search
- sum of natural numbers

These examples help build the foundation for understanding recursion before moving to more advanced topics like trees, backtracking, and divide-and-conquer algorithms.
