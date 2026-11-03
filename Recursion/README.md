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

### How recursion works internally

Every time a function is called, Java creates a new frame in the call stack. Each frame stores:
- local variables
- parameters
- return address
- current execution state

When the base case matches, the function returns immediately. Then Java pops the stack frame and continues from the previous call.

This is why recursion is powerful for problems that can be broken into smaller subproblems, but it must be designed carefully to avoid stack overflow.

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

### End-to-end flow of this approach

This approach follows the pattern:

1. Reduce the problem to a smaller version.
2. Solve the smaller problem first.
3. Add the current value back while returning.

For `cal(5)`, Java executes the following recursion:

```java
cal(5)
-> cal(4)
   -> cal(3)
      -> cal(2)
         -> cal(1)
            -> returns 1
         -> returns 2 + 1 = 3
      -> returns 3 + 3 = 6
   -> returns 4 + 6 = 10
-> returns 5 + 10 = 15
```

So the final result is:

```java
cal(5) = 15
```



---

## 8) Binary strings without consecutive 1s

This is a classic recursive backtracking problem. We generate all binary strings of length `n` in which no two adjacent bits are `1`.

### Code
```java
public static void binaryString(int n, int lastPlaced, String str){
    if(n == 0){
        System.out.println(str);
        return;
    }

    binaryString(n - 1, 0, str + "0");

    if(lastPlaced == 0){
        binaryString(n - 1, 1, str + "1");
    }
}
```

### How it works
- At each step, we always try to place `0`.
- We place `1` only if the previous placed value is `0`.
- When `n` becomes `0`, we print the final string.

### Example
```java
binaryString(3, 0, "");
```

Output:
```java
000
001
010
100
101
```

---

## 9) Friends Pairing Problem

### Problem
Count the number of ways in which `n` friends can be paired up or left single.

### Code
```java
public static int pair(int n){
    if(n == 1 || n == 2){
        return n;
    }

    int single = pair(n - 1);
    int pairs = pair(n - 1) * pair(n - 2);
    return single + pairs;
}
```

### End-to-end flow of the recursion

The idea is to break the problem into smaller subproblems:

1. The `n`th friend stays single.
2. The `n`th friend pairs with one of the other `n - 1` friends.

This gives the recursive thinking behind the function.

### Step-by-step execution for `pair(3)`

```java
pair(3)
-> pair(2) + pair(2) * pair(1)
   -> pair(2) returns 2
   -> pair(1) returns 1

single = 2
pairs = 2 * 1 = 2
return 2 + 2 = 4
```

So:

```java
pair(3) = 4
```

### Why the function calls itself

The recursion is divided into two parts:

- `single = pair(n - 1)`
  - This means the last friend does not pair with anyone and remains single.

- `pairs = pair(n - 1) * pair(n - 2)`
  - This means the last friend pairs with someone, so we recursively count ways for the remaining friends.

After both branches are solved, the function adds them:

```java
return single + pairs;
```

### Call stack flow

For `pair(4)`, Java works like this:

```java
pair(4)
-> pair(3) + pair(3) * pair(2)
   -> pair(3)
      -> pair(2)
         -> pair(1)
      -> pair(2)
   -> pair(2)
```

The function keeps reducing the problem size until it reaches the base case (`n == 1` or `n == 2`).

Once the base cases return values, Java starts unwinding the stack and combines the results from smaller calls to build the final answer.

### Important note

The standard friends-pairing recurrence is:

```java
f(n) = f(n - 1) + (n - 1) * f(n - 2)
```

This represents:
- leave the last friend single
- or pair them with one of the other `n - 1` friends

This is a classic recursive counting problem where each smaller subproblem is solved first, then the results are combined.

---

## 10) Tilling Problem

### Problem
Count the number of ways to tile a `2 x n` board using `2 x 1` tiles.

### Code
```java
public static int tillingP(int n){
    if(n == 0 || n == 1){
        return 1;
    }

    int fnm1 = tillingP(n - 1);
    int fnm2 = tillingP(n - 2);
    int totalWays = fnm1 + fnm2;
    return totalWays;
}
```

### Short forms meaning

The variables in this code are short names used for easier understanding:

- `fnm1` = ways for `n - 1`
- `fnm2` = ways for `n - 2`
- `totalWays` = final answer for the current `n`

So the function is using the recurrence:

```java
f(n) = f(n - 1) + f(n - 2)
```

### End-to-end flow of the recursion

This problem is divided into two choices:

1. Place a vertical tile on the last column.
2. Place two horizontal tiles on the last two columns.

These two choices reduce the problem to smaller sizes:

- `tillingP(n - 1)` -> one column is filled
- `tillingP(n - 2)` -> two columns are filled

Then both results are added:

```java
int totalWays = fnm1 + fnm2;
```

### Example: `tillingP(4)`

```java
tillingP(4)
-> tillingP(3) + tillingP(2)
   -> tillingP(3)
      -> tillingP(2) + tillingP(1)
         -> tillingP(2)
            -> tillingP(1) + tillingP(0)
               -> 1 + 1 = 2
         -> 2 + 1 = 3
   -> tillingP(2) = 2

return 3 + 2 = 5
```

So:

```java
System.out.println(tillingP(4)); // 5
```

### Important note

Base cases:

```java
if(n == 0 || n == 1){
    return 1;
}
```

This means:
- a board of size `0` has 1 way to tile it
- a board of size `1` also has 1 way to tile it

This is the standard recursive structure for the tilling problem, where each smaller subproblem is solved first and then combined to get the final answer.

---

## 11) Power Recursion

### Problem
Find the value of `x^n` using recursion.

### Code
```java
public static int power(int x, int n){
    if(n == 0){
        return 1;
    }

    int half = power(x, n - 1);
    return x * half;
}
```

### How it works
This is the simple recursive version.

- Base case: if `n == 0`, return `1`.
- Otherwise, reduce the power by `1`.
- Multiply the current value of `x` with the result of the smaller recursion.

### Example
```java
System.out.println(power(2, 5)); // 32
```

### End-to-end flow for `power(2, 5)`

```java
power(2, 5)
-> power(2, 4)
   -> power(2, 3)
      -> power(2, 2)
         -> power(2, 1)
            -> power(2, 0)
               -> returns 1
            -> returns 2 * 1 = 2
         -> returns 2 * 2 = 4
      -> returns 2 * 4 = 8
   -> returns 2 * 8 = 16
-> returns 2 * 16 = 32
```

So the final result is:

```java
power(2, 5) = 32
```

---

### Optimized recursive power

A faster version uses divide-and-conquer logic.

```java
public static int optimizeSolution(int x, int n){
    if(n == 0){
        return 1;
    }

    int half = optimizeSolution(x, n / 2);

    if(n % 2 == 0){
        return half * half;
    } else {
        return x * half * half;
    }
}
```

### Why this is faster

Instead of reducing `n` by `1` each time, this version reduces `n` by half.

- If `n` is even: `x^n = (x^(n/2))^2`
- If `n` is odd: `x^n = x * (x^(n/2))^2`

This reduces the number of recursive calls dramatically.

### Example
```java
System.out.println(optimizeSolution(2, 3)); // 8
```

### End-to-end flow for `optimizeSolution(2, 3)`

```java
optimizeSolution(2, 3)
-> optimizeSolution(2, 1)
   -> optimizeSolution(2, 0)
      -> returns 1
   -> n is odd, so return 2 * 1 * 1 = 2
-> n is odd, so return 2 * 2 * 2 = 8
```

So:

```java
optimizeSolution(2, 3) = 8
```

### Short variable explanation

- `half` = result of `x^(n/2)`
- if `n` is even, we square it
- if `n` is odd, multiply by `x` once more

This is the core idea of optimized exponentiation using recursion.

---

## 12) Last Occurrence of a Key

### Problem
Find the index of the last occurrence of a key in an array.

### Code
```java
public static int lastAccu(int arr[], int key, int index){
    if(index == arr.length){
        return -1;
    }

    int isFound = lastAccu(arr, key, index + 1);

    if(isFound == -1 && arr[index] == key){
        return index;
    }
    return isFound;
}
```

### How it works
This solution searches from left to right by recursion, but it checks the result while returning from recursion.

- Base case: if `index` reaches the end of the array, return `-1`.
- Recursively search the rest of the array.
- When returning back, check whether:
  - a match was found later, or
  - the current element is the key and no later match was found.

### Example
```java
int arr[] = {2, 4, 6, 8, 4, 10};
int key = 4;
System.out.println(lastAccu(arr, key, 0)); // 4
```

### End-to-end flow for `lastAccu(arr, 4, 0)`

```java
lastAccu([2,4,6,8,4,10], 4, 0)
-> lastAccu([2,4,6,8,4,10], 4, 1)
   -> lastAccu([2,4,6,8,4,10], 4, 2)
      -> lastAccu([2,4,6,8,4,10], 4, 3)
         -> lastAccu([2,4,6,8,4,10], 4, 4)
            -> lastAccu([2,4,6,8,4,10], 4, 5)
               -> lastAccu([2,4,6,8,4,10], 4, 6)
                  -> returns -1
            -> arr[5] = 10, not key, return -1
         -> arr[4] = 4, isFound == -1, return 4
      -> arr[3] = 8, not key, return 4
   -> arr[2] = 6, not key, return 4
-> arr[1] = 4, but isFound already 4, return 4
```

So the last index found is:

```java
4
```

### Why this works

The important logic is:

```java
if(isFound == -1 && arr[index] == key){
    return index;
}
```

This means:
- if no match was found in the later part of the array,
- and the current element matches the key,
- then this current index is the last valid occurrence.

This is a classic example of recursive “check while returning” logic.

---












