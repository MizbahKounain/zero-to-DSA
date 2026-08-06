package ARRAYS.Sorting_Algorithms;

import java.util.*;

public class quick_sort {
    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quick(arr, low, partition - 1);
            quick(arr, partition + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

// Time com: O(n logn)
// Space com: O(1)