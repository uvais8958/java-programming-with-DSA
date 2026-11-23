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
