package BASICS;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        int gcd = 0;
        int smaller = a < b ? a : b;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }

}
