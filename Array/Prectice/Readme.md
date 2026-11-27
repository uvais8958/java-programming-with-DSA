# Check Whether an Array Is Sorted

The `isSorted` program checks whether an array is in **ascending order**.

## Logic

- Start from the first element.
- Compare each element with the next element.
- If any element is greater than the next element, the array is not sorted.
- If no such pair is found, the array is sorted.

## Example

```java
int arr[] = {10, 20, 30, 40};
System.out.print(isSorted(arr));
```

Output:

```text
true
```

This array is sorted because every value is smaller than or equal to the value after it.

---

# Remove Duplicate Elements Using a HashSet

The `removeDuplicates.java` program removes duplicate values from an array using `HashSet`. It stores each unique value once, then overwrites the beginning of the original array with those values and returns the number of unique elements.

Unlike the optimized approach, this method does not require the input array to be sorted.

## File Structure

```text
removeDuplicates.java
└── removeDuplicates
    ├── removeDup(int arr[])  // Removes duplicates using a HashSet
    └── main(String args[])  // Demonstrates the method with a sample array
```

## How the Algorithm Works

`HashSet<Integer>` stores only unique integer values. The method performs the work in two passes:

1. Create an empty `HashSet`.
2. Add every array element to the set.
3. Duplicate values are ignored automatically because a set cannot contain them.
4. Iterate over the set and copy each unique value into the original array.
5. Return `index`, which is the number of unique elements.

```java
HashSet<Integer> set = new HashSet<>();

for (int i = 0; i < arr.length; i++) {
    set.add(arr[i]);
}

int index = 0;
for (int num : set) {
    arr[index] = num;
    index++;
}

return index;
```

## Example Walkthrough

Consider this input:

```java
int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
```

### Pass 1: Store unique values

| Array value | Set state | Action |
|---|---|---|
| 1 | `{1}` | Added |
| 1 | `{1}` | Duplicate ignored |
| 2 | `{1, 2}` | Added |
| 2 | `{1, 2}` | Duplicate ignored |
| 3 | `{1, 2, 3}` | Added |
| 3 | `{1, 2, 3}` | Duplicate ignored |
| 4 | `{1, 2, 3, 4}` | Added |
| 4 | `{1, 2, 3, 4}` | Duplicate ignored |
| 5 | `{1, 2, 3, 4, 5}` | Added |
| 5 | `{1, 2, 3, 4, 5}` | Duplicate ignored |

### Pass 2: Copy values back to the array

The set iteration copies the unique values into the beginning of the array:

```text
arr = [1, 2, 3, 4, 5, 3, 4, 5, 1, 2]
```

For this implementation, the exact remaining trailing values are not important. Only the first `k` positions are considered the result, where `k` is returned by `removeDup()`.

## Complete Example

```java
public static int removeDup(int arr[]) {
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }

    int index = 0;
    for (int num : set) {
        arr[index] = num;
        index++;
    }

    return index;
}

public static void main(String args[]) {
    int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

    int k = removeDup(arr);

    System.out.println("unique elements:" + k);

    for (int i = 0; i < k; i++) {
        System.out.print(arr[i] + " ");
    }
}
```

## Output

```text
unique elements:5
1 2 3 4 5
```

The exact order printed can vary for other inputs because `HashSet` does not guarantee iteration order.

## Edge Cases

| Input | Result | Explanation |
|---|---|---|
| `{}` | `0` | No values are added to the set. |
| `{7}` | `1` | The set contains only `7`. |
| `{1, 1, 1}` | `1` | All repeated values are ignored. |
| `{1, 2, 3}` | `3` | The set contains all three values. |
| `{3, 1, 3, 2, 1}` | `3` | The method also works for an unsorted array. |

## Complexity

- **Time complexity:** Average $O(n)$
  - Adding each array element to a HashSet takes average $O(1)$ time.
  - Iterating over the set takes $O(k)$ time, where $k$ is the number of unique values.
  - Overall average time is $O(n + k)$, which simplifies to $O(n)$.
- **Extra space complexity:** $O(k)$, or $O(n)$ in the worst case, because the HashSet stores every unique value.

## Running the Program

From the workspace root:

```powershell
javac Array/Prectice/removeDuplicates.java
java Array.Prectice.removeDuplicates
```

## Advantages

- Works on sorted or unsorted arrays.
- The implementation is straightforward.
- Duplicate detection is handled by Java's `HashSet`.

## Limitations

- Requires extra memory for the HashSet.
- Iteration order is not guaranteed.
- It does not preserve the original relative order of values in the result.
- The order in the trailing positions of the original array is irrelevant and may remain unchanged or overwritten.

---

# Remove Duplicate Elements (Optimized)

The `removeDuplicatesOpt.java` program removes duplicate values from a **sorted array** in place. It keeps only the first occurrence of each value and returns the number of unique elements.

This implementation is optimized because it uses two indices and does not require a `HashSet` or another extra data structure.

## File Structure

```text
removeDuplicatesOpt.java
└── removeDuplicatesOpt
    ├── removDup(int arr[])  // Removes duplicates and returns the unique count
    └── main(String args[])  // Demonstrates the method with a sample array
```

## How the Algorithm Works

The program uses two pointers:

- `i` — points to the last index in the result portion of the array.
- `j` — scans the array from left to right.

### Step-by-Step Logic

1. Start `i` at `0` because the first element is always unique.
2. Start `j` at `1` and compare `arr[j]` with `arr[i]`.
3. If the values are different:
   - Increment `i`.
   - Copy `arr[j]` into `arr[i]`.
4. If the values are equal, do nothing and continue scanning.
5. After the loop, return `i + 1`, which is the number of unique elements.

## Important Note

The array **must be sorted** before calling `removDup()`. The example below is sorted, so duplicate values are next to each other:

```java
int arr[] = {10, 10, 20, 20, 30, 30, 40, 40, 50, 50};
```

The algorithm relies on duplicate values appearing in adjacent positions. It will not reliably remove duplicates from an unsorted array.

## Example Walkthrough

For the array:

```text
[10, 10, 20, 20, 30, 30]
```

| `j` value | Comparison with `arr[i]` | Action | Result | Unique count |
|---|---|---|---|---|
| 10 | 10 == 10 | Skip | `[10, 10, 20, 20, 30, 30]` | 1 |
| 20 | 20 != 10 | Copy 20 to index 1 | `[10, 20, 20, 30, 30, 30]` | 2 |
| 20 | 20 == 20 | Skip | `[10, 20, 20, 30, 30, 30]` | 2 |
| 30 | 30 != 20 | Copy 30 to index 2 | `[10, 20, 30, 20, 30, 30]` | 3 |

The final unique count is `3`, and the first three positions contain:

```text
[10, 20, 30]
```

The remaining array positions are not relevant and may still contain old values.

## Complete Example

```java
public static int removDup(int arr[]) {
    int i = 0;

    for (int j = 1; j < arr.length; j++) {
        if (arr[i] != arr[j]) {
            i++;
            arr[i] = arr[j];
        }
    }

    return i + 1;
}

public static void main(String args[]) {
    int arr[] = {10, 10, 20, 20, 30, 30, 40, 40, 50, 50};
    int k = removDup(arr);

    System.out.println("Unique elements:" + k);

    for (int i = 0; i < k; i++) {
        System.out.print(arr[i] + " ");
    }
}
```

## Output

```text
Unique elements:5
10 20 30 40 50
```

## Edge Cases

| Input | Result | Explanation |
|---|---|---|
| `{}` | `0` | The array is empty; but a loop-based implementation should guard `arr.length == 0` before dereferencing `arr[0]` in the current logic. |
| `{7}` | `1` | The only element is already unique. |
| `{1, 1, 1}` | `1` | All values are duplicates of `1`. |
| `{1, 2, 3}` | `3` | The array contains no duplicates. |
| `{3, 1, 2, 1}` | Not reliable | The input is unsorted. Sort it first or use a separate set-based approach. |

**Note:** The current implementation begins with `i = 0`, so it should only be called for an array with at least one element. A production-ready method should explicitly handle an empty array.

## Complexity

- **Time complexity:** $O(n)$, where $n$ is the array length. The `j` pointer visits each element once.
- **Extra space complexity:** $O(1)`. No additional collection or array is created; duplicates are removed by overwriting positions in the original array.

## Running the Program

From the workspace root:

```powershell
javac Array/Prectice/removeDuplicatesOpt.java
java Array.Prectice.removeDuplicatesOpt
```

## Comparison With the HashSet Approach

The HashSet-based approach is useful for both sorted and unsorted arrays, but it requires additional memory. The optimized two-pointer approach is better when the input array is already sorted because it runs in $O(n)$ time with $O(1)$ extra space.

---

# Left Rotate an Array by One Place

The `LeftRotatedOnePlace.java` program rotates an array to the left by **one position**.

After one left rotation:

- The first element moves to the last position.
- Every other element moves one position to the left.

For example:

```text
Original: [1, 2, 3, 4, 5]
Rotated:  [2, 3, 4, 5, 1]
```

## File Structure

```text
LeftRotatedOnePlace.java
└── LeftRotatedOnePlace
    └── main(String args[])  // Stores, rotates, and prints a sample array
```

## How the Algorithm Works

The program uses a temporary variable and one loop:

1. Store the first element in `temp`.
2. Traverse the array from index `0` to `length - 2`.
3. Move each element one position to the left using `arr[i] = arr[i + 1]`.
4. Store `temp` in the last position of the array.
5. Print all elements of the rotated array.

```java
int temp = arr[0];

for (int i = 0; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}

arr[arr.length - 1] = temp;
```

The temporary variable is necessary because the first element would otherwise be lost after copying the second element over it.

## Example Walkthrough

For:

```java
int arr[] = {1, 2, 3, 4, 5};
```

### Step 1: Store the first element

```java
int temp = arr[0]; // temp = 1
```

### Step 2: Shift elements left

| Iteration | `i` | Assignment | Array after assignment |
|---|---:|---|---|
| 1 | 0 | `arr[0] = arr[1]` | `[2, 2, 3, 4, 5]` |
| 2 | 1 | `arr[1] = arr[2]` | `[2, 3, 3, 4, 5]` |
| 3 | 2 | `arr[2] = arr[3]` | `[2, 3, 4, 4, 5]` |
| 4 | 3 | `arr[3] = arr[4]` | `[2, 3, 4, 5, 5]` |

### Step 3: Move the saved first element to the end

```java
arr[arr.length - 1] = temp;
```

The final array becomes:

```text
[2, 3, 4, 5, 1]
```

## Complete Program

```java
package Array.Prectice;

public class LeftRotatedOnePlace {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Output

```text
2 3 4 5 1 
```

## Logic for Printing

After rotation, a separate loop prints each array element:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

`System.out.print()` prints values on the same line, with a space after every value.

## Edge Cases

| Input | Result | Explanation |
|---|---|---|
| `{}` | Error | The current code accesses `arr[0]`, so it is invalid for an empty array. |
| `{7}` | `{7}` | Storing `7` and shifting zero elements leaves the array unchanged. |
| `{1, 2}` | `{2, 1}` | The second element moves first and `1` moves to the end. |
| `{5, 5, 5}` | `{5, 5, 5}` | All values are equal, so the array looks unchanged. |

For a production-ready method, check the array length before accessing `arr[0]`:

```java
if (arr.length == 0) {
    return;
}
```

## Complexity

- **Time complexity:** $O(n)$
  - The shifting loop visits $n - 1$ elements.
  - The printing loop visits $n$ elements.
  - Therefore, the total work is $O(n)$.
- **Extra space complexity:** $O(1)$
  - Only one extra variable, `temp`, is used.
  - The rotation is performed directly in the original array.

---

# Left Rotate an Array by D Places

The `rotatedOptimal.java` program rotates an array to the **left** by `d` positions using the **reverse algorithm**.

After a left rotation by `d`, the first `d` elements move to the end, while the remaining elements move toward the beginning.

For example:

```text
Original: [1, 2, 3, 4, 5, 6, 7]
d = 3
Rotated:  [4, 5, 6, 7, 1, 2, 3]
```



## How the Reverse Algorithm Works

To left rotate an array, the program reverses three sections:

1. Reverse the first `d` elements.
2. Reverse the remaining `n - d` elements.
3. Reverse the entire array.

The implementation is:

```java
public static void rotated(int arr[], int d) {
    int n = arr.length;

    if (n == 0) {
        return;
    }

    d = d % n;

    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
}
```

The following method reverses an array section in place:

```java
public static void reverse(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}
```

## Why `d = d % n` Is Used

Rotating an array by multiples of its length produces the original array again.

Therefore, the effective rotation is:

```java
d = d % n;
```

Examples:

| Array length | Requested `d` | Effective `d` |
|---:|---:|---:|
| 7 | 3 | 3 |
| 7 | 7 | 0 |
| 7 | 10 | 3 |
| 7 | 14 | 0 |

For a negative value of `d`, Java's remainder can also be negative. The current implementation expects a non-negative `d`. A reusable method can validate or normalize negative values before reversing:

```java
d = d % n;

if (d < 0) {
    d += n;
}
```

## Complete Example Walkthrough

For:

```java
int arr[] = {1, 2, 3, 4, 5, 6, 7};
int d = 3;
```

The array length is `7`, and `3 % 7` remains `3`.

### Step 1: Reverse the first `d` elements

Reverse indices `0` through `2`:

```text
Before: [1, 2, 3, 4, 5, 6, 7]
After:  [3, 2, 1, 4, 5, 6, 7]
```

### Step 2: Reverse the remaining elements

Reverse indices `3` through `6`:

```text
Before: [3, 2, 1, 4, 5, 6, 7]
After:  [3, 2, 1, 7, 6, 5, 4]
```

### Step 3: Reverse the entire array

Reverse indices `0` through `6`:

```text
Before: [3, 2, 1, 7, 6, 5, 4]
After:  [4, 5, 6, 7, 1, 2, 3]
```

The final array is rotated left by three positions.

## Reverse Operation Walkthrough

The `reverse()` method works by swapping elements at the `start` and `end` positions.

For:

```text
[1, 2, 3, 4, 5]
start = 0
end = 4
```

| Iteration | Swap | Result |
|---:|---|---|
| 1 | `1` and `5` | `[5, 2, 3, 4, 1]` |
| 2 | `2` and `4` | `[5, 4, 3, 2, 1]` |
| 3 | stop because `start >= end` | `[5, 4, 3, 2, 1]` |

A temporary variable is required so that neither swapped value is lost.

## Complete Program

```java
package Array.Prectice;

public class rotatedOptimal {

    public static void rotated(int arr[], int d) {
        int n = arr.length;

        if (n == 0) {
            return;
        }

        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        rotated(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Output

```text
4 5 6 7 1 2 3 
```

## Printing the Result

After rotation, `main()` prints every element using:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

`System.out.print()` keeps all values on the same output line, and the extra space is printed after each value.

## Edge Cases

| Input | `d` | Result | Explanation |
|---|---:|---|---|
| `{}` | 3 | `{}` | The method returns immediately for an empty array. |
| `{7}` | 3 | `{7}` | `d % n` becomes `0`, so the array is unchanged. |
| `{1, 2, 3}` | 0 | `{1, 2, 3}` | No effective rotation occurs. |
| `{1, 2, 3}` | 3 | `{1, 2, 3}` | Rotating by the array length returns the original array. |
| `{1, 2, 3, 4, 5}` | 7 | `{3, 4, 5, 1, 2}` | `7 % 5` leaves an effective rotation of `2`. |
| `{5, 5, 5}` | 1 | `{5, 5, 5}` | Equal values make the result appear unchanged. |
| `{1, 2, 3}` | -1 | Undefined for this implementation | Negative values need explicit normalization before reversal. |

## Complexity Analysis

For an array of length `n`:

- **Time complexity:** $O(n)$
  - The first reversal touches at most `d` elements.
  - The second reversal touches at most `n - d` elements.
  - The final reversal touches `n` elements.
  - The total number of swaps is still linear with respect to `n`.
- **Extra space complexity:** $O(1)`
  - Only a few integer variables and one temporary swap variable are used.
  - Rotation is performed directly inside the original array.

## Advantages

- Uses only constant extra space.
- Runs in linear time.
- Handles rotations larger than the array length through modulo operation.
- Avoids repeated element shifts or copying into another array.

## Limitations

- The current method is designed for a non-negative rotation value `d`.
- `d = d % n` does not normalize negative Java remainders.
- If the method is reused with many different arrays, it mutates the original array directly.


