package Divide;

/**
 * MergeSort
 */
public class MergeSort {

    // ye main function hai array ko divide karega
    public static void mergeSort(int arr[], int si, int ei) {
        // base case: agar ek element ya 0 element hai to already sorted hai
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // left part ko sort karo
        mergeSort(arr, si, mid);
        // right part ko sort karo
        mergeSort(arr, mid + 1, ei);

        // dono sorted parts ko merge karo
        merge(arr, si, mid, ei);
    }

    // ye function dono sorted array ko merge karega
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // dono halves ko compare karke temp me daalo
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left side ke bache hue elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right side ke bache hue elements
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // temp array ko original array me copy karo
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 1, 4, 2};

        mergeSort(arr, 0, arr.length - 1);

        // print array sorted way
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
out put
1 2 3 4 


*/ 