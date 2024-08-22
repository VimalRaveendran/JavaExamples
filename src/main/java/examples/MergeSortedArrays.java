package examples;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = n1 - n2 - 1; // Pointer for arr1
        int j = n2 - 1; // Pointer for arr2
        int k = arr1.length - 1; // Pointer for merged array

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8, 9, 11, 14};

        // Extend arr1 to accommodate arr2 elements
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);

        mergeArrays(arr1, arr2);

        System.out.println("Merged array: " + Arrays.toString(arr1));
    }
}

