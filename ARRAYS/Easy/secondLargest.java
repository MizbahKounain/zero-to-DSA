package ARRAYS.Easy;

import java.util.Scanner;

public class secondLargest {
    public static int secondLargestElement(int[] nums) {
        int large = -1;
        int small = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                small = large;
                large = nums[i];
            } else if (nums[i] > small && nums[i] < large) {
                small = nums[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = secondLargestElement(arr);
        System.out.println(res);
        sc.close();
    }
}