package BASICS;

import java.util.Scanner;

public class Fibonacci_seq {
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
}
