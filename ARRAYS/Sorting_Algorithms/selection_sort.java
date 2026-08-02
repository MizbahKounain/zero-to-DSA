package ARRAYS.Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {
    public static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            // swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

// Time com: O(n^2)
