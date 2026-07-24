package BASICS;

import java.util.Scanner;

public class Sum_First_Last_digit {
    public static int sum(int n) {
        int last = n % 10;
        while (n >= 10) {
            n /= 10;
        }
        int first = n;
        return (first + last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
