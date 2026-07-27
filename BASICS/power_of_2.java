package BASICS;

import java.util.Scanner;

public class power_of_2 {
    public static boolean power(int n) {
        if (n <= 0)
            return false;
        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
        sc.close();
    }
}

/*
 * Bit manipulation concept is used above
 * every power of 2 has 1 bit that is one then rest is zero
 * example: 8 = 1000, 2 = 0010
 * subtract (8-1)= 7 = 0111
 * AND op -> 8 & (8-1) = 0000
 */
