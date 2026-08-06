package ARRAYS.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class rotateByK {
    public static void rotateArray(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
    }

    public static void rotate(int[] nums, int s, int e) {
        if (s >= e)
            return;
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

}
