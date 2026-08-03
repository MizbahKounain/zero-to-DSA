package ARRAYS.Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class recursive_bubble_sort {
    public static void sort(int[] arr, int n) {
        if (n <= 1)
            return;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        // We can stop early if no swaps occur during a pass, which is optional
        if (swapped == false)
            return;
        sort(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

// best com: O(n)
// worst com: O(n^2)
