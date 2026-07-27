package BASICS;

import java.util.Scanner;

public class trailing_zeros_in_factorial {
    public static long fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return (n * fact(n - 1));
    }

    public static int trailing_zero(int n) {
        int count = 0;
        long fact = fact(n);
        while (fact != 0) {
            long rem = fact % 10;
            if (rem != 0)
                return count;
            else {
                count++;
                fact /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailing_zero(n));
        sc.close();
    }
}
