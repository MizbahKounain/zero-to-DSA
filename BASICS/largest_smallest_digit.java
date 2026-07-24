//Largest digit in a number
package BASICS;

import java.util.*;

public class largest_smallest_digit {
    public static int largestDigit(int n) {
        int min = Integer.MAX_VALUE;
        while (n != 0) {
            int rem = n % 10;
            if (rem < min) {
                min = rem;
            }
            n /= 10;
        }
        return min;
    }

    public static int smallestDigit(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        } else {
            int n = Integer.parseInt(s);
            int max = Integer.MAX_VALUE;
            while (n != 0) {
                int rem = n % 10;
                if (rem < max) {
                    max = rem;
                }
                n /= 10;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // If number starts with non-zero
        int n = sc.nextInt();
        System.out.println(largestDigit(n));

        // If number starts with zero
        String s = sc.next();
        System.out.println(smallestDigit(s));
        sc.close();
    }
}
