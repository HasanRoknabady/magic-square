package sbu.cs;

import java.util.Collection;
import java.util.Collections;

public class SortArray {

    /**
     * sort array arr with selection sort algorithm
     *
     * @param arr  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] selectionSort(int[] arr, int size)
    {
        int idx;

        for (int i = 0; i < size - 1; i++)
        {
            idx = i;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[idx] > arr[j])
                {
                    //search for lowest
                    idx = j;
                }
            }
            int lowestNum = arr[idx];
            arr[idx] = arr[i];
            arr[i] = lowestNum;
        }
        return arr;
    }



    /**
     * sort array arr with insertion sort algorithm
     *
     * @param arr  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] insertionSort(int[] arr, int size)
    {
        for (int i = 1; i < size; i++)
        {
            int key = arr[i];
            int beforeI = i - 1;
            while ((beforeI > -1) && (arr[beforeI] > key))
            {
                arr[beforeI + 1] = arr[beforeI];
                beforeI--;
            }
            arr[beforeI + 1] = key;
        }
        return arr;
    }

    /**
     * sort array arr with merge sort algorithm
     *
     * @param arr  array of integers
     * @param size size of arrays
     * @return sorted array
     */
    public int[] mergeSort(int[] arr, int size)
    {
        // Recursive control 'if' statement.
        if(arr.length <= 1)
        {
            return arr;
        }

        int midpoint = size / 2;
        // Declare and initialize left and right arrays.
        int[] left = new int[midpoint];
        int[] right;

        if(arr.length % 2 == 0)
        {
            // if array.length is an even number.
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        // Populate the left and right arrays.
        for(int i=0; i < midpoint; i++)
        {
            left[i] = arr[i];
        }
        for(int j=0; j < right.length; j++)
        {
            right[j] = arr[midpoint+j];
        }

        int[] result = new int[size];

        // Recursive call for left and right arrays.
        left = mergeSort(left, left.length);
        right = mergeSort(right, right.length);

        // Get the merged left and right arrays.
        result = merge(left, right);

        // Return the sorted merged array.
        return result;

    }

    private static int[] merge(int[] left, int[] right)
    {
        // Merged result array.
        int[] result = new int[left.length + right.length];

        // Declare and initialize pointers for all arrays.
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        // While there are items in either array...
        while(leftPointer < left.length || rightPointer < right.length)
        {
            // If there are items in BOTH arrays...
            if(leftPointer < left.length && rightPointer < right.length)
            {
                // If left item is less than right item...
                if(left[leftPointer] < right[rightPointer])
                {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            // If there are only items in the left array...
            else if(leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            }
            // If there are only items in the right array...
            else if(rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }

        }

        return result;
    }

    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in iterative form
     *
     * @param arr   sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearch(int[] arr, int value) {
        return -1;
    }

    /**
     * return position of given value in array arr which is sorted in ascending order.
     * use binary search algorithm and implement it in recursive form
     *
     * @param arr   sorted array
     * @param value value to be find
     * @return position of value in arr. -1 if not exists
     */
    public int binarySearchRecursive(int[] arr, int value) {
        return -1;
    }
}
