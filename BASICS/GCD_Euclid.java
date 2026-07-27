package BASICS;
/* GCD using Euclid's algorithm:
expmple: GCD 48 and 18
48 % 18 = 12
18 % 12 = 6
12 % 6 = 0
GCD = 6 */

import java.util.Scanner;

public class GCD_Euclid {
    public static int gcd(int a, int b) {
        int rem = 0;
        while (b != 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
}
