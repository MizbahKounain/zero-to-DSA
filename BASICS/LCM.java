package BASICS;

import java.util.Scanner;

public class LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a < 0 || b < 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        }
        int gcd = gcd(a, b);
        int lcm = (a * b) / (gcd);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD is " + gcd(a, b));
        System.out.println("LCM is " + lcm(a, b));
        sc.close();
    }
}
