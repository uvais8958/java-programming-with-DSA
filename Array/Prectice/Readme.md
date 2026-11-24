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
- **Extra space complexity:** $O(1)$. No additional collection or array is created; duplicates are removed by overwriting positions in the original array.

## Running the Program

From the workspace root:

```powershell
javac Array/Prectice/removeDuplicatesOpt.java
java Array.Prectice.removeDuplicatesOpt
```

## Comparison With the HashSet Approach

The HashSet-based approach is useful for both sorted and unsorted arrays, but it requires additional memory. The optimized two-pointer approach is better when the input array is already sorted because it runs in $O(n)$ time with $O(1)$ extra space.
