package ARRAYS.Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
    public static void divide(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);
        conquere(nums, start, mid, end);
    }

    public static int[] conquere(int[] nums, int start, int mid, int end) {
        int i = start, j = mid + 1;
        int[] merge = new int[end - start + 1];
        int x = 0;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j])
                merge[x++] = nums[i++];
            else
                merge[x++] = nums[j++];
        }
        while (i <= mid) {
            merge[x++] = nums[i++];
        }
        while (j <= end) {
            merge[x++] = nums[j++];
        }
        for (int k = 0; k < merge.length; k++) {
            nums[start + k] = merge[k];
            /*
             * because the temporary array (merge) is freshly created starting at index 0,
             * while the section of the original array (numb) we are updating is located
             * at a specific sub-range starting at the index start.
             */
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}

// Time com: O(n logn)
// Requires extra array; extra space required
// Space com: O(n)
