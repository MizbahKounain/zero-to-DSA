package ARRAYS.Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class recursive_insertion_sort {
    public static void recursive(int[] arr, int n) {
        if (n <= 1)
            return;
        recursive(arr, n - 1);
        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        recursive(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}
