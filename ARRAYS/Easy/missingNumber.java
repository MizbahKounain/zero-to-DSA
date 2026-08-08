package ARRAYS.Easy;

import java.util.Scanner;

/*
Given an integer array of size n containing distinct values in the range from 
0 to n (inclusive), return the only number missing from the array within this range.
*/

public class missingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;

        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += nums[i];
        }
        int res = sum1 - sum2;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
        sc.close();
    }
}
