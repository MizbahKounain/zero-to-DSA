package BASICS;

import java.util.Scanner;

/* an integer whose square ends with the exact same digits as the number itself
Exmple: 5=5^2 = 25 */
public class automorphic_num {
    public static boolean automorphic(int n) {
        int sq = n * n;
        while (n != 0) {
            if (n % 10 != sq % 10)
                return false;
            n /= 10;
            sq /= 10;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(automorphic(n));
        sc.close();
    }
}
