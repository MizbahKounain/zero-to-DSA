package ARRAYS.Easy;

import java.util.Scanner;

public class largestElement {
    public static int largestElement(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = largestElement(arr);
        System.out.println(res);
        sc.close();
    }
}
