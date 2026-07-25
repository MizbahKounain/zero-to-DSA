package BASICS;

import java.util.*;

public class Print_prime {
    public static boolean is_prime(int n) {
        if (n <= 1)
            return false;
        int count = 0;
        for (int i = 2; i <= (n / i); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0)
            return true;
        else
            return false;
    }

    public static void print_prime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (is_prime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        print_prime(a, b);
        sc.close();
    }
}
