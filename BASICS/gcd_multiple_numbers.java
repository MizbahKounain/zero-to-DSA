package BASICS;

import java.util.Scanner;

public class gcd_multiple_numbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int multipleGCD(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = gcd(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(multipleGCD(arr));
        sc.close();
    }

}
