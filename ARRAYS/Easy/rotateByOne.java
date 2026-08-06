package ARRAYS.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class rotateByOne {
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
