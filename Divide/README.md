# Merge Sort Algorithm

Merge Sort is a sorting algorithm based on the divide-and-conquer technique.

## Idea
- Split the array into two halves.
- Recursively sort both halves.
- Merge the two sorted halves into one sorted array.

## Why it is called divide and conquer
- Divide: break the array into smaller parts.
- Conquer: sort each smaller part.
- Combine: merge the sorted parts back together.

## Merge Sort logic
```java
public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }

    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);
    merge(arr, si, mid, ei);
}
```

## Merge step
```java
public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    for (k = 0, i = si; k < temp.length; k++, i++) {
        arr[i] = temp[k];
    }
}
```

## Example
```java
int arr[] = {3, 1, 4, 2};
mergeSort(arr, 0, arr.length - 1);
```

Output:
```java
1 2 3 4
```

## Time complexity
- Best case: O(n log n)
- Average case: O(n log n)
- Worst case: O(n log n)

## Space complexity
- O(n) because of the temporary array used during merging.

## Notes
Merge Sort is stable and works well for large arrays, but it uses extra memory compared to in-place sorting algorithms like Quick Sort.

---

# Quick Sort Algorithm

Quick Sort is also a divide-and-conquer sorting algorithm. It picks a pivot element and partitions the array around it.

## Idea
- Choose a pivot.
- Put smaller elements on the left and larger elements on the right.
- Recursively sort the left and right parts.

## Quick Sort logic
```java
public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }

    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx - 1);
    quickSort(arr, pIdx + 1, ei);
}
```

## Partition step
```java
public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;

    for (int j = si; j < ei; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}
```

## Example
```java
int arr[] = {6, 3, 9, 8, 2, 5};
quickSort(arr, 0, arr.length - 1);
```

Output:
```java
2 3 5 6 8 9
```

## Time complexity
- Best case: O(n log n)
- Average case: O(n log n)
- Worst case: O(n^2)

## Space complexity
- O(log n) for recursion stack in average case
- O(n) in worst case

## Notes
Quick Sort is usually faster in practice than Merge Sort because it is in-place and does not require extra arrays, but its worst-case performance can be poor if the pivot is poorly chosen.

---

# Search in Rotated Sorted Array

This algorithm finds a target value in a sorted array that has been rotated at some pivot point.

## Idea
- Find the middle element.
- Check which half is sorted.
- Use the sorted half to decide whether to search left or right.
- Recurse until the target is found or the search range is exhausted.

## Logic
```java
public static int search(int arr[], int target, int si, int ei) {
    if (si > ei) {
        return -1;
    }

    int mid = si + (ei - si) / 2;
    if (arr[mid] == target) {
        return mid;
    }

    if (arr[si] <= arr[mid]) {
        if (arr[si] <= target && target <= arr[mid]) {
            return search(arr, target, si, mid - 1);
        } else {
            return search(arr, target, mid + 1, ei);
        }
    } else {
        if (arr[mid] <= target && target <= arr[ei]) {
            return search(arr, target, mid + 1, ei);
        } else {
            return search(arr, target, si, mid - 1);
        }
    }
}
```

## Example
```java
int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
int target = 0;
int index = search(arr, target, 0, arr.length - 1);
```

Output:
```java
4
```

## Time complexity
- Best/Average/Worst: O(log n)

## Space complexity
- O(log n) because of recursion stack

## Notes
This is a divide-and-conquer search that keeps the time complexity logarithmic, unlike linear search on a rotated array.
