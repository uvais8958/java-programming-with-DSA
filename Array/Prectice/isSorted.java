package Array.Prectice;

/**
 * isSorted
 * This program checks whether an array is in ascending order.
 */
public class isSorted {

    /**
     * Checks if every element is smaller than or equal to the next element.
     *
     * @param arr the array to check
     * @return true if the array is sorted in ascending order, otherwise false
     */
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};
        System.out.print(isSorted(arr));
    }
}