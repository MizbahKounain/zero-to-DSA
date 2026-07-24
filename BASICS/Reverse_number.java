package BASICS;

import java.util.Scanner;

public class Reverse_number {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int reminder = n % 10;
            rev = (rev * 10) + reminder;
            n /= 10;
        }
        return rev;
    }

    public static int reverseNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        String res = sb.reverse().toString();
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // If number starts from non-zero
        int n = sc.nextInt();
        System.out.println(reverse(n));

        // If number starts from a zero
        String s = sc.next();
        System.out.println(reverseNumber(s));
        sc.close();
    }

}
