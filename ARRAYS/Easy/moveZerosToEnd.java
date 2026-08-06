package ARRAYS.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class moveZerosToEnd {
    // O(n)
    // public static void movezeros(int[] nums) {
    // int i = 0;
    // for (int j = 0; j < nums.length; j++) {
    // if (nums[j] != 0) {
    // nums[i] = nums[j];
    // i++;
    // }
    // }
    // for (int k = i; k < nums.length; k++) {
    // nums[k] = 0;
    // }
    // }
    public static void movezeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        movezeros(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
