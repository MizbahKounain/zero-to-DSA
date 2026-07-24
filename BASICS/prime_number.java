package BASICS;

import java.util.*;

public class prime_number {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            int count = 0;
            for (int i = 2; i <= (Math.sqrt(n)); i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 0)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}
